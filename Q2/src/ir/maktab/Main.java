package ir.maktab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        fill(numbers);

    }

    public static void fill(ArrayList<Integer> numbers) {
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
    }
    public static void fill(int i, ArrayList<Integer> numbers) {
        Random rand = new Random();
        for (int j = 0; j < i; j++) {
            numbers.add(rand.nextInt(10));
        }
    }
}
