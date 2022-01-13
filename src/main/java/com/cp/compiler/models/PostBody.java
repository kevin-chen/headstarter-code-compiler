package com.cp.compiler.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostBody {
    @JsonProperty("code")
    private String code;

    public String getCode() {
        return code;
    }
}
