package org.example.facade;

import java.sql.Driver;

public class Firefox {
    public static Driver getFirefoxDriver() {
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver) {
        System.out.println("Generating HTML Report for Firefox Driver");
    }

    public static void generateJUnitReport(String test, Driver driver) {
        System.out.println("Generating JUnit Report for Firefox Driver");
    }
}
