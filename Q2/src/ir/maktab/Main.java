package ir.maktab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        fill(numbers);
        System.out.println(find(numbers));
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

    public static ArrayList<ArrayList<Integer>> find(ArrayList<Integer> numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (numbers.size() % 2 == 0)
            makePair(numbers, result, numbers.size());
        else
            makePair(numbers, result, numbers.size() - 1);
        return result;
    }

    public static void makePair(ArrayList<Integer> numbers, ArrayList<ArrayList<Integer>> result, int size) {
        for (int i = 0; i < size / 2; i++) {
            result.add(new ArrayList<>());
        }

        Iterator<Integer> iterator = numbers.iterator();
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < 2; j++) {
                result.get(i).add(iterator.next());
            }
        }
    }
}
