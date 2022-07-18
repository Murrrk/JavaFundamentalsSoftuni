package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        int countVowels = getVowelsCount(text);
        System.out.println(countVowels);
    }

    private static int getVowelsCount (String text) {
        int count = 0;

        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        return count;
    }
}