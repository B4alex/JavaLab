package main.java.com.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputDevice inputDevice = new InputDevice(new FileInputStream("file.txt"));
        OutputDevice outputDevice = new OutputDevice(new FileOutputStream("file.txt"));

        outputDevice.writeMessage(args);
        Application mainApp = new Application(inputDevice, outputDevice, args[0]);
        mainApp.run();
    }
}
