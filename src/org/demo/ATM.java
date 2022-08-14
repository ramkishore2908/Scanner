package org.demo;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Full Name");
		String name = s.nextLine();
		System.out.println("Your Name is "+name);
		
		System.out.println("Enter Your Pin");
		int pin = s.nextInt();
		System.out.println("Your Pin is "+pin);
		
		System.out.println("Enter Your Phone number");
		long ph = s.nextLong();
		System.out.println("Your Phone Number is "+ph);
		
		System.out.println("Enter The Amount");
		float amt = s.nextFloat();
		System.out.println("Your Amount is "+amt);
		
		System.out.println("Enter Your email");
		String a = s.next();
		System.out.println("Your email is "+a);
		
		System.out.println("Do You Want To Continue?");
		boolean b = s.nextBoolean();
		System.out.println(b);
		
	}
}
