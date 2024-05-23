package april.ex_25042024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user which browser you want me to run th code
        // chrome -> start chrome, firefox -> firefox, edge-> execution edge

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program");

        String browserName = scanner.nextLine();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                // Further code to start the chrome
                // Webdriver driver = new Chrome(); // Selenium code will be taught later part
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the chrome
                // Webdriver driver = new Chrome(); // Selenium code will be taught later part
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }

    }
}
