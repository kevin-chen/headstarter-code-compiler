package com.cp.compiler.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Verdict {
    NO_ERROR("No error detected"),
    ACCEPTED("Accepted"),
    WRONG_ANSWER("Wrong Answer"),
    COMPILATION_ERROR("Compilation Error"),
    OUT_OF_MEMORY("Out Of Memory"),
    TIME_LIMIT_EXCEEDED("Time Limit Exceeded"),
    RUNTIME_ERROR("Runtime Error");

    @Getter
    String value;
}
