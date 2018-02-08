package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Please enter path to input file:");
		String pathInput = sc.nextLine();
		
		//Declares input file
		File inputFile = new File(pathInput);
		
		//Checks if file exists and is a file
		if(inputFile.exists() == false) {
			System.out.println(pathInput + " does not exist dummy");
			System.exit(1);
		} else if (inputFile.isFile() == false) {
			System.out.println(pathInput + " is not a file loser");
			System.exit(1);
		}
		
		//Read file Scanner
		int count = 0;
		try (Scanner textScanner = new Scanner(inputFile)){
			//while(textScanner.hasNextLine() && textScanner.next() == " ") {
				while(textScanner.hasNextLine())	{
					if(textScanner.next() !="") {
					count++;
					}
			}
		}
		System.out.println("The word count is " + count + " you vagabond!");
		
		//Sentence count
		int countSen = 0;
		try (Scanner textScanner = new Scanner(inputFile)){
			//while(textScanner.hasNextLine() && textScanner.next() == " ") {
				while(textScanner.hasNextLine())	{
					if(textScanner.next().charAt(textScanner.next().length()-1) == '?') {
					countSen++;
					}
					
					// || textScanner.next().contains(".") || textScanner.next().contains("!")
			}
		}
		System.out.println("The word count is " + count + " you vagabond!");

	}

}
