package com.bl.algorithm;

public class PrimeNumber {
    public void isPrime() {

        for(int no=1;no<=1000;no++) {
            int temp=0;

            for(int i=2;i<no-1;i++) {
                if(no % i == 0) {
                    temp=temp+1;
                }
            }

            if(temp == 0) {
                System.out.print(no+" ");
            }

        }


    }
    public static void main(String[] args) {
        PrimeNumber p=new PrimeNumber();
        p.isPrime();

    }

}
