package com.cp.compiler.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Response.
 *
 * @author Zakaria Maaraki
 */
@Data
@AllArgsConstructor
@ApiModel(description = "The provided code")
public class SourceCodeBody {
	
	@ApiModelProperty(notes = "Code to be executed")
	private String code;

  public String getCode() {
    return code;
  }
}
