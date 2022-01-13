package com.cp.compiler.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel(description = "Returned response")
public class Response {
	
	@ApiModelProperty(notes = "The output of the program during the execution")
	private String output;
	
	@ApiModelProperty(notes = "The value can be one of these : Accepted, Wrong Answer, Compilation Error, Runtime Error, Out Of Memory, Time Limit Exceeded")
	private String status;
}
