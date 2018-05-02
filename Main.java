package me;

import java.util.Arrays;

public class Main {

    static boolean[] primes = new boolean[1000000000];

    public static void main(String[] args) {
        Arrays.fill(primes, true);
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++)
                    primes[i * j] = false;
            }
        }
        System.out.println("Done Sieving");
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (i % 2 == 0)
                run(i);
        }
        System.out.println("Done");
    }

    static void run(int integer) {
        if (integer > 3 && integer % 2 == 0) {
            check(integer);
        } else {
            System.out.println("Input > 3 and is even.");
        }
    }

    static boolean check(int integer) {
        for (int i = 2; i < integer; i++) {
            if (primes[i] && primes[integer - i]) {
                return true;
            }
        }
        System.out.println(integer);
        return false;
    }
}
