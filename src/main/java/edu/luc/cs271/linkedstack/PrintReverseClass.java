package edu.luc.cs271.linkedstack;


public class PrintReverseClass{
	
private static void printReverse(final Scanner input) {
  // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
	if(input == null)
		return;
	else{
		printReverse(input.next);
		System.out.println(input.peek());
		System.out.println(input.pop());
	}
		
} 
}
