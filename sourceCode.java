
package org.simplilearn.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class sourceCode {
	Scanner sc = new Scanner (System.in);
	//Retrieving the file names in an ascending order	
	public void retrive(){
		
		System.out.println("Enter File Path");
		String n = sc.nextLine();
	
		File f = new File(n);
		 String s[] = f.list();
		 if (s!=null){
			 for (int i=0;i<s.length;i++) { System.out.println(s[i]);}
		 }
		 else System.out.println("file not found");
 	}
	public void addFile(){
			System.out.println("enter file name which you want to created");
			String s1= sc.nextLine();
			File f1= new File(s1);
			try{
				if (f1.exists()==false){
					f1.createNewFile(); // creates new file
					System.out.println("File sucsessfully cratrted");
				}
				else{
					System.out.println("File already exist");
				}
			}
			catch(IOException e){e.printStackTrace();}			
	}	
	public void deleteFile(){
		System.out.println("Enter file name which you want to delete");
		String s2= sc.nextLine();
		File f2 = new File(s2);
		if (f2.exists()==true) 
			{f2.delete();System.out.println("File successfully deleted");}
				else {System.out.println("File does not exist");}
	}
	public void searchFile() {
		// Create an object of the File class
		// Replace the file path with path of the directory
		System.out.println("Enter the file name for searching");
		
		String filename = sc.next();

		File directory_search = new File("C:\\\\Simplilearn_Project\\\\virtualkeyproject");

		String[] flist_search = directory_search.list();
		int flag_s = 0;
		if (flist_search == null) {
			System.out.println("Empty directory");
		} else {

			// Linear search in the array
			for (int i = 0; i < flist_search.length; i++) {
				String search_filename = flist_search[i];
				if (search_filename.equalsIgnoreCase(filename)) {
					System.out.println(search_filename + " found");
					flag_s = 1;
				}
			}
			if(flag_s == 0)
			{
				System.out.println("File not found");
			}
		}
		
        }
	}

