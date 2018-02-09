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

	
	public void auditMe ()   {
	Scanner in = new Scanner(System.in);

	String basepath = "/Users/aprokofyeva/Development/team7-java-week4-pair-exercise/m1-capstone";
	
	String newDir = basepath + "AuditRecord";
	
	//Create a directory
	File dirFileObject = new File(newDir);

	if (dirFileObject.exists() == false) {
		dirFileObject.mkdir();
	}
	
	String newFilePath = newDir + "/Log.txt";
	
	//Create a file
	File fileFileObject = new File(newFilePath);
	
	if (fileFileObject.exists() == false) {
		fileFileObject.createNewFile();
		}
	
	//get local time
	LocalDateTime currentDateTime = LocalDateTime.now();
	//create string to hold transaction, item, $cost, $total
	String formattedEntry = "";
	
	try(FileWriter fileWriter = new FileWriter(fileFileObject.getAbsoluteFile(), true);
		BufferedWriter bufferedFileWriter = new BufferedWriter(fileWriter);
			) {
		bufferedFileWriter.write(currentDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a")) + formattedEntry);
		
		bufferedFileWriter.flush();
	}
	
}

}


	
	


