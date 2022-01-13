package com.cp.compiler.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Language {
    PYTHON("utility_py", "main.py", "python3");

    String folder;
    String file;
    String command;
}