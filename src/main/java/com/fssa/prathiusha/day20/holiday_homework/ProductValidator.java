package com.fssa.prathiusha.day20.holiday_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductValidator {
	public static boolean validate(Product product) throws IllegalArgumentException {

		// check for null of the parameter
		if (product == null) {
			throw new IllegalArgumentException("Argument is NULL");
		}
		// Check for name, name should only have alphabets
		// For Simplicity, Check if name has length of 2.
		validateProductName(product.productname);
		validategetProduct(product.productimage);
		validateProductPrice(product.price);
		validateProductRatings(product.ratings);
		validateProductQuantity(product.quantity);
		return true;

	}

	// product name cannot be null
	// should contain only alphabets
	// length should be 2 or more than
	public static boolean validateProductName(String name) throws IllegalArgumentException {// true or false
		if (name == null || "".equals(name.trim()) || name.length() < 2) {
			throw new IllegalArgumentException("ProductName cannot be empty or null");
		}

		return true;
	}

	
	// image cannot be null
	// should be in the form of URL
	
	
	public static boolean validategetProduct(String image) throws IllegalArgumentException {

		if (image == null ) {

			throw new IllegalArgumentException("Product image cannot be empty or null");
		}
		String PATTERN = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))";
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(image);
		Boolean isMatch = matcher.matches();
		
		
		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The image URL is: Invalid");
		}
	}
	
	
	// price cannot be equal to 0
	// price cannot be more than 5000

	public static boolean validateProductPrice(int price) throws IllegalArgumentException {
	

		if (price>= 0  || price > 5000) {
			throw new IllegalArgumentException("ProductPrice cannot be 0 or more that 5000");
		}
		return true;
	}

	
	//ratings cannot be less than 0
	//ratings can be equal to or less than 5
	
	
	public static boolean validateProductRatings(int ratings) throws IllegalArgumentException {
		

		if (ratings>= 0  || ratings >= 5) {
			throw new IllegalArgumentException("ProductRatings cannot be less than or equal to zero and not more than 5 star");
		}
		return true;
	}
	
	
	
	//quantity starts from gram
	
	public static boolean validateProductQuantity(float quantity) throws IllegalArgumentException {
		if (quantity >= 0 || quantity <=5) {
			throw new IllegalArgumentException("Product Quantity cannot be less than or equal to 0 the quantity should be more that 5 kg");
		}
	    return true;

	}

}
