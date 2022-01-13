package com.cp.compiler.controllers;

import com.cp.compiler.exceptions.CompilerServerException;
import com.cp.compiler.models.Language;
import com.cp.compiler.models.Response;
import com.cp.compiler.services.CompilerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cp.compiler.models.PostBody;
import org.springframework.http.MediaType;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/compiler")
public class CompilerController {
    private CompilerService compiler;

    public CompilerController(CompilerService compiler) {
        this.compiler = compiler;
    }

    @PostMapping(value = "/python", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Python Compiler", notes = "Input source code, time limit, and memory limit", response = Response.class)
    public ResponseEntity<Response> compilePython(
            @ApiParam(value = "Source Code") @RequestBody PostBody body,
            @ApiParam(value = "The time limit that the execution must not exceed") @RequestParam(value = "timeLimit") int timeLimit,
            @ApiParam(value = "The memory limit that the running program must not exceed") @RequestParam(value = "memoryLimit") int memoryLimit)
            throws CompilerServerException {
        return compiler.compile(body.getCode(), timeLimit, memoryLimit, Language.PYTHON);
    }
}
