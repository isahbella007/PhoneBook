package assignment3;

import java.util.Arrays;
import java.util.Scanner;

import java.lang.*;

public class phoneBook {
	static int numEntries = 0;
	static phoneBookEntry[] arr = new phoneBookEntry[0]; 
	
	phoneBook() {
		
	}
	
	public int getNumEntries() {
		return numEntries; 
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			
			phoneBook p = new phoneBook();  
		
			boolean run = true; 
			Scanner Input = new Scanner(System.in); 
			
			displayMessage();
			while(run) {
				int userChoice = Input.nextInt(); 
				if(userChoice == 1) {
					System.out.println("Number of records in the book: " +p.getNumEntries());
					
					displayMessage();
				}
				else if(userChoice == 2) {
					System.out.println("Add details to the array");
					
					System.out.println("Enter Name: ");
					String name = Input.next(); 
					
					System.out.println("Enter Home Phone (Enter null if you don't have a home phone) : ");
					String homePhone = Input.next(); 
					
					System.out.println("Enter Office Phone: (Enter null if you don't have an office phone)");
					String officePhone = Input.next(); 
					
					phoneBookEntry newEntry = new phoneBookEntry(name, homePhone,officePhone); 
					
					if(arr.length < 100) {
						arr = p.addEntry(newEntry); 
					}else {
						System.out.println("Cannot add more records. exceeded limit");
					}
					
					
					displayMessage();
				}
				else if(userChoice == 3) {
					System.out.println("Remove a record from the array by name");
					String name = Input.next(); 
					p.removeEntry(name);
					displayMessage();
				}
				else if(userChoice == 4) {
					System.out.println("Search for a user by first name");
					String name  = Input.next(); 
					p.searchEntry(name);
					
					displayMessage();
				}
				else {
					System.out.println("No option for the number entered.");
					run = false; 
				}
			}

	}
		public boolean removeEntry(String name) {
			phoneBookEntry pbe = null; 
			phoneBookEntry fakedata = new phoneBookEntry("Deleted record", "null", "null"); 
			for(int i = 0; i < arr.length; i++) {
				phoneBookEntry pbe1 = arr[i]; 
				pbe = pbe1; 
				if(pbe1.getName().equalsIgnoreCase(name)) {
					arr[i] =  fakedata; 
					 numEntries--; 
					System.out.println("Deleted Succesfully");
				}
			}
			if(pbe == null) {
				System.out.println("No record found...");
			}
			return true; 
		}
		
		private phoneBookEntry searchEntry(String name) {
			// TODO Auto-generated method stub
			phoneBookEntry pbe = null; 
			for(int i = 0; i < arr.length; i++) {
				phoneBookEntry pbe1 = arr[i]; 
				pbe = pbe1;
				if(pbe1.getName().equalsIgnoreCase(name)) {
					System.out.println("Record Found...");
					System.out.println("Name: "+pbe.getName() +", "+ pbe.getHomePhone()+", "+pbe.getOfficePhone());
					
					break; 
				}
				
			}
			if(pbe == null) {
				System.out.println("No record found...");
			}
			
			
			return pbe;
			
		}

		public  phoneBookEntry[] addEntry(phoneBookEntry newEntry) {
			int n = arr.length; 
//			System.out.println(n);
//			make a new array 
			phoneBookEntry[] newArray = new phoneBookEntry[n+1]; 
			
//			copy content from old array to new one
			for(int i = 0; i<n; i++) {
				newArray[i] = arr[i]; 
			}
			
			newArray[n] = newEntry;
			
			for(int j = 0; j < newArray.length; j++) {
				System.out.println(newArray[j].getName());
			}
			numEntries++; 
			return newArray; 
			
			 
		}
	
		public static  void displayMessage() {
			System.out.println("\n");
			System.out.println("Choose an option from the menu: ");
			System.out.println("1. View the number of available phonebook entries ");
			System.out.println("2. Add a new phonebook entry >_<");
			System.out.println("3. Remove phonebook entry(by first name) ");
			System.out.println("4. search for persons detail (by first name) ");
		}
}
