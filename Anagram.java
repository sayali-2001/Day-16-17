package com.bl.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String str1 = sc.nextLine();
        System.out.println("Enter second String");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char[] c1 = str1.toCharArray(); //String to char array
            char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean result = Arrays.equals(c1, c2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
