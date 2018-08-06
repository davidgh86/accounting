package com.ust.calc.calculadora.api.resources;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@Builder
@Setter
@NoArgsConstructor
public class Contract {

	@NotNull(message="The category is required")
	@ApiModelProperty(required=true)
	private String category;
	@NotNull(message="The contract type is required")
	@ApiModelProperty(required=true)
	private String contractType;
	@NotNull(message="The start date is required")
	@ApiModelProperty(required=true)
	private String startDate;
	@NotNull(message="The salary is required")
	@ApiModelProperty(required=true)
	private String salary;
	@NotNull(message="The currency is required")
	@ApiModelProperty(required=true)
	private String currency;
	private String endDate;
	@NotNull(message="The insurance number is required")
	@ApiModelProperty(required=true)
	private String insuranceNumber;
	@NotNull(message="The civil status is required")
	@ApiModelProperty(required=true)
	private String civilStatus;
	@NotNull(message="The current account is required")
	@ApiModelProperty(required=true)
	private String currentAccount;
	
}
