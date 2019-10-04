package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String a = sc.next();
        System.out.println("enter the substrng index: ");
        int b = sc.nextInt();
        String c = a.substring(b);
        System.out.println(c);

    }
}
