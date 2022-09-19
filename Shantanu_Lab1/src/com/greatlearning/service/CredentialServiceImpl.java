package com.greatlearning.service;

import java.security.SecureRandom;

import com.greatlearning.model.Employee;
import java.util.Scanner;
import java.security.SecureRandom;
public class CredentialServiceImpl implements CredentialService {

	public String companyName = "greatlearning.com";
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		 // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "!@#$%ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < 10 ; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
		
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		String email=firstName.toLowerCase()+lastName.toLowerCase()+"@" +department+"."+companyName;
		//System.out.println("Your email is:"+email);
		return email;
		
	}

	public void showCredentials(Employee employee, String email, String generatedPassword) {
		// TODO Auto-generated method stub
		System.out.println("Dear"+" "+employee.getFirstName()+", Your credentials are as follows :"+"\nEMAIL : "+email +"\nPASSWORD :"+generatedPassword);
		//return "YOUR NAME :"+" "+firstName+" "+lastName+
			//	"\nYOUR COMPANY EMAIL: "+email+"\n";
		
	}
	
}
