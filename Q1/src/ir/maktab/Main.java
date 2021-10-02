package ir.maktab;

import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Character> setOne = new TreeSet<>();
        TreeSet<Character> setTwo = new TreeSet<>();
        fill(setOne, setTwo);
        System.out.println("first treeSet : " + setOne);
        System.out.println("second treeSet : " + setTwo);
        System.out.println("community : " + community(setOne, setTwo));
        System.out.println("subscript : " + subscript(setOne, setTwo));
    }

    public static void fill(TreeSet<Character> setOne, TreeSet<Character> setTwo) {
        Random rand = new Random();
        do {
            if (setOne.size() < 10)
                setOne.add((char) (rand.nextInt(26) + 'a'));
            if (setTwo.size() < 10)
                setTwo.add((char) (rand.nextInt(26) + 'a'));
        } while (setOne.size() + setTwo.size() != 20);
    }

    public static TreeSet<Character> community(TreeSet<Character> setOne, TreeSet<Character> setTwo) {
        TreeSet<Character> newTreeSetOne = new TreeSet<>();
        TreeSet<Character> newTreeSetTwo = new TreeSet<>();
        newTreeSetOne.addAll(setOne);
        newTreeSetTwo.addAll(setTwo);
        newTreeSetOne.addAll(newTreeSetTwo);
        return newTreeSetOne;
    }

    public static TreeSet<Character> subscript(TreeSet<Character> setOne, TreeSet<Character> setTwo) {
        TreeSet<Character> newTreeSetOne = new TreeSet<>();
        TreeSet<Character> newTreeSetTwo = new TreeSet<>();
        TreeSet<Character> subscript = new TreeSet<>();
        newTreeSetOne.addAll(setOne);
        newTreeSetTwo.addAll(setTwo);
        for (Character c : newTreeSetOne) {
            if (newTreeSetTwo.contains(c))
                subscript.add(c);
        }
        return subscript;
    }
}

