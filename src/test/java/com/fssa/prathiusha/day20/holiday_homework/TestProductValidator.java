package com.fssa.prathiusha.day20.holiday_homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.prathiusha.day20.holiday_homework.ProductValidator;

public class TestProductValidator {

	@Test
	public void testValidate() {
		

		Assertions.assertTrue(ProductValidator.validateProductName("Tomato"));
	}

	@Test
	public void testInvalidProductName() {
		try {
			ProductValidator.validateProductName(null) ;
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("ProductName cannot be empty or null", ex.getMessage());

		}
	}

	@Test
	public void testInvalidProductImage() {
		try {
			ProductValidator.validategetProduct(null);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Product image cannot be empty or null", ex.getMessage());

		}
	}

	@Test
	public void testInvalidProductPrice() {
		try {
			ProductValidator.validateProductPrice(0);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("ProductPrice cannot be 0 or more that 5000", ex.getMessage());

		}
	}

	@Test
	public void testInvalidProductRatings() {

		try {
			ProductValidator.validateProductRatings(0);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("ProductRatings cannot be less than or equal to zero and not more than 5 star", ex.getMessage());

		}

	}

	@Test
	public void testInvalidProductQuantity() {
		try {
			ProductValidator.validateProductQuantity(0);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Product Quantity cannot be less than or equal to 0 the quantity should be more that 5 kg", ex.getMessage());

		}

	}

}