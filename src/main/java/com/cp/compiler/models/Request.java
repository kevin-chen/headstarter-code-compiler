package com.cp.compiler.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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
	
	// public MultipartFile getSourceCode() throws IOException {
	// 	File sourceCodeFile = new File(language.getFolder() + "/" + language.getFile());
	// 	return new MockMultipartFile(language.getFile(), language.getFile(), null , new ByteArrayInputStream(this.sourceCode.getBytes()));
	// }

}
