package com.greatlearning.test;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.service.CredentialServiceImpl;

public class TestEmployee {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome,please enter your firstName ");
		String firstName = in.nextLine();
		System.out.println("Welcome,please enter your lastName ");
		String lastName = in.nextLine();
		Employee e1 = new Employee(firstName,lastName);
		CredentialService cs = new CredentialServiceImpl();
		String generatedEmail;
		String generatedPassword;
		String department = "gen";
		System.out.print("New Worker: " + "\nDEPARTMENT CODES:\n1 for Technical\n2 for Admin\n3 for Human Resources\n4 for Legal\n0 for none\nEnter the department code: ");
		int depchoice=in.nextInt();
		
		switch(depchoice)
		{
			case 1 : 
					department = "tech";
					break;
					
			case 2 : department = "admin";
					break;
					
			case 3 : department = "humanresources";
					break;
					
			case 4 : department = "legal";
					break;
					
			default : System.out.println("Please enter a valid option");
					
		}
		
		generatedEmail = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), department);
		generatedPassword = cs.generatePassword();
		cs.showCredentials(e1, generatedEmail, generatedPassword);
		
		//another way of implementation using if-else is commented below
		/*if(depchoice==1) {
			generatedEmail = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else if(depchoice==2) {
			generatedEmail = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "admin");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else if(depchoice==3) {
			generatedEmail = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "humanresources");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else if(depchoice==4) {
			generatedEmail = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else {
			
		}*/
	in.close();	
	}
}
