package org.example;
public interface NasaInterface {
    void connect(String url, String username, String password);
    void disconnect();
    void saveData(String data);
    void retrieveData();
}

