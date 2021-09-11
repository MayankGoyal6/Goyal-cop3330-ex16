/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 16
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your age? ");
    int age = scanner.nextInt();

    String message = (age > 16) ? ("You are old enough to legally drive."):("You are not old enough to legally drive.");
    System.out.println(message);
  }
}