package org.example.facade;

public class FacadePatternExample {
    public static void main(String[] args) {
        String test = "test";
        WebExplorerHelperFacade.generateReports("chrome", "junit", test);
    }
}
