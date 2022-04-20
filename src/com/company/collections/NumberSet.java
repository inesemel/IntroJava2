package com.company.collections;

import java.util.*;

public class NumberSet {
    public static Set numberInput() {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a number: ");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}
