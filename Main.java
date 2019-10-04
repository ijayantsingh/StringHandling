package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            System.out.println("index :" + i);
            System.out.println("chars :" + b);
        }
    }
}