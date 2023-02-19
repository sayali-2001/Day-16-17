package com.bl.algorithm;

import java.util.Scanner;

public class StringPermutation {
    public static void printPermutation(String string,String ans) {
        if(string.length()==0) {
            System.out.print(ans+" ");
        }
        for(int i=0;i<string.length();i++) {
            char ch = string.charAt(i);

            String r = string.substring(0, i) + string.substring(i+1);
            printPermutation(r,(ans+ch));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String  : ");
        String str = sc.next();
        printPermutation(str,"");
    }
}
