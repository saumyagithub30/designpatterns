package org.example.facade;

import java.sql.Driver;

public class WebExplorerHelperFacade {
    public static void generateReports(String explorer, String report, String test) {
        Driver driver = null;
        switch (explorer) {
            case "firefox":
                driver = Firefox.getFirefoxDriver();
                switch(report) {
                    case "html":
                        Firefox.generateHTMLReport(report, driver);
                        break;
                    case "junit":
                        Firefox.generateJUnitReport(report, driver);
                        break;
                }
                break;
            case "chrome":
                driver = Chrome.getChromeDriver();
                switch(report) {
                    case "html":
                        Chrome.generateHTMLReport(report, driver);
                        break;
                    case "junit":
                        Chrome.generateJUnitReport(report, driver);
                        break;
                }
        }
    }
}
