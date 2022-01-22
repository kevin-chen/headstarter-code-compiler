package com.cp.compiler.controllers;

import com.cp.compiler.models.Response;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class Root {
    @GetMapping(value = "/")
    @ApiOperation(value = "Target Group Health Check", notes = "Health Check", response = Response.class)
    public ResponseEntity<String> compilePython() {
        log.info("Root health check passed");
        return ResponseEntity.ok().body("Health check passed");
    }
}
