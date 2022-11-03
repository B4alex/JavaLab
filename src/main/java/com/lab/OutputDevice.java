package main.java.com.lab;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class OutputDevice {

    OutputStream outputStream;

    public OutputDevice() {
        this.outputStream = System.out;
    }

    public OutputDevice(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public <K, V> void writeMessage(Map<K, V> mapMessage){
        try {
            outputStream.write(mapMessage.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> void writeMessage(T message) {
        try {
            outputStream.write(message.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeMessage(String[] messArr) {
        for(String arg: messArr){
            this.writeMessage(arg);
        }
    }

}
