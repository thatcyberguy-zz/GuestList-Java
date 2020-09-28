/*
* File: GuestList.java
* Author: David Pierre
* Date: February 10, 2020
* Purpose: This program prints a guest list and add a new guest.
*/

import java.util.Scanner;
import java.util.ArrayList; //ArrayList manipulates size and adds a new user


public class GuestList {

	public static void main(String[] args) {
		
		String newGuest = "";// Empty string for the future new guest
			
		//Scanner to get the user inputs
		Scanner scan = new Scanner(System.in);
			
		// Arrays list that will hold my guest. 
    // Notice I left () empty after the ArrayList so my array can be unlimited
		ArrayList<String> guestList = new ArrayList<>(); 
		
		//Default users
		System.out.println();// Because of the ArrayList I can easily add default users
		guestList.add("David");
		guestList.add("Londa");
		guestList.add("Grace");
		guestList.add("Samuel");
		System.out.print("This is our current guest list: " + guestList + "\n" + "We only have" + " "+ guestList.size() + " people. "); //.size tells the size of the guestList
		
		//Getting new guest
		System.out.println("Please enter your name to join the list:");
		newGuest = scan.nextLine();
		// added new Guest
		guestList.add(newGuest);
		System.out.println("Welcome " + newGuest + "! Now our new list is: " + "\n" + guestList);
		
		
		scan.close(); // Close to free up resources.
	
	
	}	//End main

}	//End GuestList Class
