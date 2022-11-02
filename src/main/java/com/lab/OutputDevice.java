package main.java.com.lab;

import java.io.OutputStream;
import java.util.Map;

public class OutputDevice {

    OutputStream outputStream;

    public OutputDevice() {
        this.outputStream = System.out;
    }

    public <K, V> void writeMessage(Map<K, V> mapMessage){
        outputStream.write(mapMessage.toString().getBytes());
    }

    public <T> void writeMessage(T message) {
        outputStream.write(message.toString().getBytes());
    }

    public void writeMessage(String[] messArr) {
        for(String arg: messArr){
            this.writeMessage(arg);
        }
    }

}
