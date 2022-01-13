package com.cp.compiler.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Request {
	@JsonProperty("sourceCode")
	private String sourceCode;
	
	@JsonProperty("language")
	private Language language;
	
	@JsonProperty("timeLimit")
	private int timeLimit;
	
	@JsonProperty("memoryLimit")
	private int memoryLimit;
}
