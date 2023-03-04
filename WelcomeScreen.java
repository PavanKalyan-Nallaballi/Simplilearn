package org.simplilearn.project;

import java.io.File;
import java.util.*;

public class WelcomeScreen {
	public static void main(String[] args) {
		String filename;
		char ch;
		File directory = new File("C:\\Simplilearn_Project\\virtualkeyproject");
		String[] flist = directory.list();
		// Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("**** Simplilearn Assignment *******");
		System.out.println("***********************************");
		System.out.println("**** Pavan Kalyan N ***************");
		System.out.println("***********************************");
		System.out.println("**** Full Stack Developer *********\n");
		
		do {
		System.out.println("Select File Option to perform any operation:-\n");
		System.out.println("1.List all the files");
		System.out.println("2.File Creation");
		System.out.println("3.File List");
		System.out.println("4.File Delete");
		System.out.println("5.Search file");
		System.out.println("6.Exit");
		sourceCode k = new sourceCode();

		int choice = input.nextInt();

		switch (choice) {
		case 1:
			k.retrive();
			break;
		case 2:
			k.addFile();
			break;
			
		case 3:
			
		k.deleteFile();
			break;
		case 4:
			k.searchFile();
			break;
		case 5:
			System.out.println("Thank you user");
			
			
		default:
			System.out.println("Your input is incorrect,plse give correct one");
			break;
		}
		System.out.println("Do you want to continue?\n");
		System.out.println("Type (Y/N)");
		ch = input.next().charAt(0);
		if(ch=='n' || ch=='N')
		{
			System.out.println("Thank you");
		}
		}
		
		
		while (ch == 'Y' || ch == 'y');
		
	}

}

