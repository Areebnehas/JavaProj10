package org.example;
public class Main {
    public static void main(String[] args) {
        // Create instances
        Hibernate hibernateDB = new Hibernate();
        DataJPA dataJPADB = new DataJPA();

        // Hibernate operations
        hibernateDB.connect("hibernate_url", "hibernate_user", "hibernate_password");
        hibernateDB.saveData("Some data for Hibernate");
        hibernateDB.retrieveData();
        hibernateDB.disconnect();

        // DataJPA operations
        dataJPADB.connect("data_jpa_url", "data_jpa_user", "data_jpa_password");
        dataJPADB.saveData("Some data for Data JPA");
        dataJPADB.retrieveData();
        dataJPADB.disconnect();
    }
}
