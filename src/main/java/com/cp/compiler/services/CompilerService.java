package com.cp.compiler.services;

import com.cp.compiler.exceptions.CompilerServerException;
import com.cp.compiler.models.Language;
import com.cp.compiler.models.Response;
import org.springframework.http.ResponseEntity;

public interface CompilerService {

    ResponseEntity<Response> compile(String sourceCode,
                                     int timeLimit, int memoryLimit, Language language) throws CompilerServerException;

}
