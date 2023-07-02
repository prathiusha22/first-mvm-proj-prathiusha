package com.fssa.prathiusha.day20.holiday_homework;
import org.junit.jupiter.api.Assertions;

public class TestUserValidator {
//	@Test
	public void testValidate() {
		User user=new User();
		user.getClass();
		Assertions.assertTrue(UserValidator.validate(user));
	}
	
//	@Test
	public void testInvalidfirstName() {
		User user = new User();
		user.getFirstName();
		try {
			user.firstname = "Prathiusha";
			UserValidator.validate(user);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("FirstName cannot be empty or null",
					ex.getMessage());
			
		}
	}
//	@Test
	public void testInvalidLastName() {
		User user = new User();
		user.getLastName();
		try {
			user.lastname = "Sakthivel";
			UserValidator.validate(user);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("LastName cannot be empty or null",
					ex.getMessage());
			
		}
	}
//	@Test
	public void testInvalidEmail() {
		User user = new User();
		user.getEmailId();
		try {
			user.emailId = "prathiusha@freshworks.com";
			UserValidator.validate(user);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid Email",
					ex.getMessage());
			
		}
	}
	
//	@Test
	public void testInvalidPassword() {
		User user = new User();
		user.getPassword();
		try {
			user.password = "Prathiusha@22";
			UserValidator.validate(user);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid Password",
					ex.getMessage());
			
		}
	}
	

	public User getStudent() {
		User user = new User();
		user.firstname = "Prathiusha";
		user.lastname = "Sakthivel";
		user.emailId = "prathiusha@freshworks.com";
		user.password = "Prathiusha@22";
		return user;
	}
	
}