package com.bl.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        String[] words = {"Sayali", "Kiran", "Neha", "Tanvi ", "Maya" };
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        int index, left=0;

        int right = words.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to find ");
        String str = sc.nextLine();
        while (true)
        {
            int mid = (left+right) / 2;
            if (words[mid].compareTo(str) == 0){
                System.out.println("Index of your word  is : " +mid);
                break;
            }else if (words[mid].compareTo(str) > 0){
                System.out.println("Index of your word is : " + (mid-1));
                break;
            }
            else{
                System.out.println("Index of your word is : "+(mid+1));
                break;
            }
        }
    }
}
