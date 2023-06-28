package com.fssa.prathiusha.day19.practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestUserValidator {
	
	//  for valid id
	
@Test
	public void testValidId() {
		Assertions.assertTrue(UserValidator.idValidator("12345678"));
	}
//  for invalid id
	
@Test
	public void testInvalidId() {
		try {
			UserValidator.idValidator("998");
			Assertions.fail("Validateid failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Id is invalid", ex.getMessage());
		}
	}
//  for valid name
	
@Test

	public void testValidName() {
		Assertions.assertTrue(UserValidator.nameValidator("prathiusha"));
	}
//  for invalid name
	
@Test
	public void testInvalidName() {
		try {
			UserValidator.nameValidator("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The name should be in minimum 2 letters", ex.getMessage());
		}
	}
//  for valid email
	
@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserValidator.emailValidator("prathiusha@gmail.com"));
	}
//  for invalid email
	
@Test
	public void testInvalidEmail() {
		try {
			UserValidator.emailValidator("prathiushagmail");
			Assertions.fail("Validateemail failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The email is invalid", ex.getMessage());
		}
	}
//  for valid password
	
@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserValidator.passwordValidator("prathiusha@#99"));
	}
//  for invalid id
	
@Test
	public void testInvalidPassword() {
		try {
			UserValidator.passwordValidator("prathiusha");
			Assertions.fail("Validatepassword failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The password is invalid", ex.getMessage());
		}
	}
}
