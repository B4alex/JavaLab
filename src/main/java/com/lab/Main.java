package main.java.com.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();

        outputDevice.writeMessage(args);
        Application mainApp = new Application(inputDevice, outputDevice, args[0]);
        mainApp.run();
    }
}
