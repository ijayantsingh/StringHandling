package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.next();
        String b = a.replace("a", "*");
        System.out.println(b);
    }
}
