package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    System.out.println("What is your name?");
    Scanner name = new Scanner(System.in);
    String nameStr = name.nextLine();
    System.out.println("Hello, nice to meet you " + nameStr + ".");
    System.out.println("How old are you? (In an integer)");
    int age = name.nextInt();
    System.out.println("I see " + nameStr + "you are " + age + " years old.");
    name.close();
    }
}
