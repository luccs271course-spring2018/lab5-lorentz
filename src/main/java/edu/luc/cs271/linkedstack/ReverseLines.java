package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.Scanner;

public class ReverseLines {

  public static void main(String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    if (input.hasNextLine()) {
      final String line = input.nextLine();
      System.out.println(line);
      printReverse(input);
      System.out.println(line);
    }
  }
}
