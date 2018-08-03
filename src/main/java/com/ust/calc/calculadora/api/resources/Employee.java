package com.ust.calc.calculadora.api.resources;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representation of Employee
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	@NotNull(message="The name is required")
	@Size(min = 3, message="The name must be longer")
    private String name;

    private String address;
	
	@NotNull(message="The e-mail is required")
	@Pattern(regexp=".+@.+\\.[a-z]+", message="E-mail format not valid")
    private String email;
	
	@NotNull(message="The DNI is required")
	@Pattern.List({
	    @Pattern(regexp = "((([X-Z])|([LM])){1}([-]?)((\\d){7})([-]?)([A-Z]{1}))|((\\d{8})([-]?)([A-Z]))", message = "The DNI must contain one digit."),
//	    @Pattern(regexp = "[XYZ][0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKE]", message = "Password must contain one lowercase letter."),	    @Pattern(regexp = "(?=.*[A-Z])", message = "Password must contain one uppercase letter."),
	})
    private String dni;
	
	@NotNull(message="The user date of birth is required")
    private Date birthDate;
    private String phoneNumber;
    private String sex;
    private String id;
    
	@NotNull(message="The contract is required")
    private Contract contract;
	
	@Pattern(regexp="^([a-zA-Z0-9_.-]{14})$|^([a-zA-Z0-9_.-]{20})$", message="cadastreRef size must be 14 or 20 characters")
	private String cadastreRef;

}
