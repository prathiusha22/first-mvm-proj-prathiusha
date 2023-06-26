package com.fssa.prathiusha.day18.solved;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.prathiusha.day18.solved.ValidationUtil;

public class JUnitTeatValidationUtil {
	 // Annotation is marker for JUNIT to run this method automatically
	public void testPostiveValidateAge() {
		Assertions.assertTrue(ValidationUtil.validateAge(9));
	}
	

	public void testNegativeValidateAge() {
		try {
			ValidationUtil.validateAge(-9);
			Assertions.fail("ValidateAge failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid age", ex.getMessage());
		}
	}

}
