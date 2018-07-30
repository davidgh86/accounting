package com.ust.calc.calculadora.api.resources;

import javax.validation.constraints.NotNull;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
@Setter
@NoArgsConstructor
public class Contract {

	@NotNull(message="The category is required")
	private String category;
	@NotNull(message="The contract type is required")
	private String contractType;
	@NotNull(message="The start date is required")
	private String startDate;
	@NotNull(message="The salary is required")
	private String salary;
	@NotNull(message="The currency is required")
	private String currency;
	private String endDate;
	@NotNull(message="The insurance number is required")
	private String insuranceNumber;
	@NotNull(message="The civil status is required")
	private String civilStatus;
	@NotNull(message="The current account is required")
	private String currentAccount;
	
}
