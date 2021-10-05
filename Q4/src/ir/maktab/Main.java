package ir.maktab;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] c = str.toCharArray();
        int i = 0;
        while (i < c.length) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            } else {
                map.put(c[i], 1);
            }
            i++;
        }
       permute(map);

    }
    public static void permute(HashMap<Character, Integer> map) {
        if (map.isEmpty()) {
            System.out.println();
        } else {
            Set<Character> keys = map.keySet();

            for (Character c : keys) {

                System.out.print(c + ",");

                int val = map.get(c) - 1;

                if (val == 0) {
                    map.remove(c);
                } else {
                    map.put(c, val);

                }
                permute(map);
            }
        }
    }


}
