package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Audit {
	
	private String transactionName;
	private double amount;
	private double balance;

	
	public void logTransaction (String transactionName, double amount, double balance) throws IOException   {
		
		this.transactionName = transactionName;
		this.amount = amount;
		this.balance = balance;
		
		//get local time
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		//Create file object
		String filePath = "Log.txt";
		File fileFileObject = new File(filePath);
		
		try(FileWriter fileWriter = new FileWriter(fileFileObject .getAbsoluteFile(), true);
			BufferedWriter bufferedFileWriter = new BufferedWriter(fileWriter);
			) {
			//Print a formatted line in the log
			bufferedFileWriter.write(currentDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a  ")) + String.format(("%-20s%-10s%-10s\n"), transactionName, amount, balance));
		
			bufferedFileWriter.flush();
		}
	
	}

}


	
	


