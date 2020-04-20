package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        for (int j = 1; j<=r;j++) {
            System.out.printf("*");
            for (int i = 1; i <= c-2; i++) {
                if (j==1||j==r){
                    System.out.printf("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("*\n");
        }
    }
}
