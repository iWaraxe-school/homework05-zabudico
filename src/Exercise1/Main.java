package Exercise1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();


        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }


        System.out.println("Numbers at even indices:");
        for (int i = 0; i < numbers.size(); i += 2) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
    }}