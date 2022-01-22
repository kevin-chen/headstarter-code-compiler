package com.cp.compiler.controllers;

import com.cp.compiler.exceptions.CompilerServerException;
import com.cp.compiler.models.Language;
import com.cp.compiler.models.PostBody;
import com.cp.compiler.models.Response;
import com.cp.compiler.services.CompilerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Root {
    @GetMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Target Group Health Check", notes = "Health Check", response = Response.class)
    public ResponseEntity<String> compilePython() {
        return ResponseEntity.ok().body("Health check passed");
    }
}
