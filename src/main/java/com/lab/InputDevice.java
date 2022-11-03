package main.java.com.lab;

import main.java.com.lab.fruits.Apple;
import main.java.com.lab.fruits.Banana;
import main.java.com.lab.fruits.Fruit;
import main.java.com.lab.fruits.Mango;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InputDevice {

    InputStream inputStream;

    public InputDevice() {
        this.inputStream = System.in;
    }

    public InputDevice(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String nextLine(){
        StringBuilder sb = new StringBuilder();
        int n;
        try {
            n = inputStream.read();
            while(n != -1 && n !='\n'){
                sb.append((char) n);
                n = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public String getType() {
        return "random";
    }

    public int[] getNumbers(int n) {
        int[] numbers = new int[n];
        for (int idx = 0; idx < n; idx++) {
            numbers[idx] = this.nextInt();
        }

        return numbers;
    }

    public String getLine() {
        return "The quick brown fox jumps over the lazy dog";
    }

    public int nextInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public Fruit[] readFruitArr() {
        return new Fruit[]{new Banana(15, 3, 6), new Banana(25, 19, 2),
                new Apple(11, 4, 8, Fruit.Color.RED),
                new Mango(20, 4, 4, Fruit.Color.GREEN)};
    }

    public ArrayList<Fruit> readFruit(){
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Banana(15, 3, 6));
        fruits.add(new Banana(25, 19, 2));
        fruits.add(new Apple(11, 4, 8, Fruit.Color.RED));
        fruits.add(new Mango(20, 4, 4, Fruit.Color.GREEN));
        return fruits;
    }
}
