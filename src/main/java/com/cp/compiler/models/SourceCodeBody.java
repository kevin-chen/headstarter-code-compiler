package com.cp.compiler.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SourceCodeBody {
	
  @JsonProperty("code")
	private String code;

  public String getCode() {
    return code;
  }
}
