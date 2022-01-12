package com.cp.compiler.controllers;

import com.cp.compiler.exceptions.CompilerServerException;
import com.cp.compiler.models.Language;
import com.cp.compiler.models.Response;
import com.cp.compiler.services.CompilerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cp.compiler.models.SourceCodeBody;

@RestController
@RequestMapping("/compiler")
public class CompilerController {

  private CompilerService compiler;

  public CompilerController(CompilerService compiler) {
    this.compiler = compiler;
  }

  /**
   * Python Compiler Controller
   *
   * @param outputFile  Expected output
   * @param sourceCode  Python source code
   * @param inputFile   Input data (optional)
   * @param timeLimit   Time limit of the execution, must be between 0 and 15 sec
   * @param memoryLimit Memory limit of the execution, must be between 0 and 1000
   *                    MB
   * @return The verdict of the execution (Accepted, Wrong Answer, Time Limit
   *         Exceeded, Memory Limit Exceeded, Compilation Error, RunTime Error)
   * @throws CompilerServerException The compiler exception
   */
  @PostMapping("/python")
  @ApiOperation(value = "Python compiler", notes = "Provide source code, time limit and memory limit", response = Response.class)
  public ResponseEntity<Object> compilePython(
      @ApiParam(value = "Your source code") @RequestBody SourceCodeBody scb,
      @ApiParam(value = "The time limit that the execution must not exceed") @RequestParam(value = "timeLimit") int timeLimit,
      @ApiParam(value = "The memory limit that the running program must not exceed") @RequestParam(value = "memoryLimit") int memoryLimit)
      throws CompilerServerException {
    return compiler.compile(scb.getCode(), timeLimit, memoryLimit, Language.PYTHON);
  }
}
