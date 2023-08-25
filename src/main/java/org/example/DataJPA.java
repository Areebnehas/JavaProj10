package org.example;
public class DataJPA implements NasaInterface {
    private boolean isConnected = false;

    public void connect(String url, String username, String password) {
        System.out.println("Connecting to Elons phone on Mars with TELELINK...");
        isConnected = true;
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Hes busy building Next Twitter...");
            isConnected = false;
        }
    }

    public void saveData(String data) {
        if (isConnected) {
            System.out.println("Process INITIATE Data To NASA XTB: " + data);
        } else {
            System.out.println("Cannot save data. Not connected to Data JPA.");
        }
    }

    public void retrieveData() {
        if (isConnected) {
            System.out.println("Retrieving data from Data JPA...");
        } else {
            System.out.println("Cannot retrieve data. Not connected to Data JPA.");
        }
    }
}
