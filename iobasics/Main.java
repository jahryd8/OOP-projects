package iobasics;
import java.util.Scanner; //allows the program to accept values; util has large library

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!"); //ln puts cursor in new line, can use regular print
		System.out.println("I enjoy programming!");
		System.err.println("I enjoy programming!"); //error stream; bring error messages to the user attention
		
		String name = "Jaheim Ryder";
		System.out.println("Hi! My name is " + name);
		
		
		//Alternative 
		String fname = "Jaheim";
		String lname = "Ryder";
		System.out.println("Hi! My name is " + fname+ " "+ lname);
		
		//Alternative to accept value from user 
		Scanner reader = new Scanner(System.in); //Create object for reading input from keyboard
		String firstName = "";
		String lastName = "";
		double age = 0;
		System.out.println("Enter first name: ");
		firstName = reader.next(); //read single string with no spaces 
		System.out.println("Enter last name: ");
		lastName = reader.next(); //nextline accepts string with spaces 
		System.out.println("Enter age: ");
		age = reader.nextDouble();
		System.out.println("Hi! My name is " + firstName+ " "+ lastName+ " I am "+age+ " years old");
		reader.close();
		
		
	}

}