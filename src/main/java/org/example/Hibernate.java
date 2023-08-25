package org.example;
public class Hibernate implements NasaInterface {

    private boolean isConnected = false;

    public void connect(String url, String username, String password) {
        System.out.println("Connecting to Nasa Interface...");
        isConnected = true;
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting from Nasa Interface...");
            isConnected = false;
        }
    }

    public void saveData(String data) {
        if (isConnected) {
            System.out.println("Saving Data to ALIENSDRIVE: " + data);
        } else {
            System.out.println("Cannot save data. Not connected to Hibernate.");
        }
    }

    public void retrieveData() {
        if (isConnected) {
            System.out.println("Hello Humans...");
        } else {
            System.out.println("Cannot retrieve data. Not connected to Hibernate.");
        }
    }
}
