package com.fssa.prathiusha.day20.holiday_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	public static boolean validate(User user) throws IllegalArgumentException {

		// check for null of the parameter
		if (user == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		// Check for name, name should only have alphabets
		// For Simplicity, Check if name has length of 2.
		validateFirstName(user.firstname);
		validateLastName(user.lastname);
		validateEmail(user.emailId);
		validatePassword(user.password);
		return true;
		
		}

	// first name cannot be null
    // should contain only alphabets
	//length should be 2 or more than
	public static boolean validateFirstName(String name)
			throws IllegalArgumentException {
		if (name == null || "".equals(name.trim()) || name.length() < 2) {
			throw new IllegalArgumentException("FirstName cannot " + "be empty or null");
		}
		return true;
	}

	public static boolean validateLastName(String lastname) throws IllegalArgumentException {
		// last name cannot be null
		// should contain only alphabets
		//length should be 1 or more than
		if (lastname == null || "".equals(lastname.trim()) || lastname.length() < 1) {
			return true;
		}
		throw new IllegalArgumentException("LastName cannot " + "be empty or null");

	}

	public static boolean validateEmail(String email)
			throws IllegalArgumentException {
		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		Boolean isMatch = matcher.matches();
//				Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The User email is : Invalid");
		}
	}

	
	//At least 8 chars
	//Contains at least one digit
	//Contains at least one lowercase letter and one uppercase letter
	//should not contain space 
	//should have special character
	public static boolean validatePassword(String password)
			throws IllegalArgumentException {
		String regex="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		Boolean isMatch = matcher.matches();
		
		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("Password is not valid");
		}

	}

	public static void main(String[] args) {
		User s = null;
		validate(s);
	}
}


