package com.cp.compiler.utilities;

import com.cp.compiler.models.Language;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Slf4j
public class EntryPointFile {

  private static final String TIMEOUT_CMD = "timeout --signal=SIGTERM ";
  private static final String BASH_HEADER = "#!/usr/bin/env bash\n";

  private EntryPointFile() {
  }

  /**
   * Create python entrypoint file.
   *
   * @param timeLimit   the expected time limit that execution must not exceed
   * @param memoryLimit the expected memory limit
   * @param inputFile   the input file that contains input data (can be null)
   */
  @SneakyThrows
  public static void createPythonEntrypointFile(int timeLimit, int memoryLimit) {
    String executionCommand = TIMEOUT_CMD + timeLimit + "s " + Language.PYTHON.getCommand() + " main.py" + "\n";

    String content = BASH_HEADER +
        "ulimit -s " + memoryLimit + "\n" +
        executionCommand +
        "exit $?\n";

    try (OutputStream os = new FileOutputStream(new File(Language.PYTHON.getFolder() + "/entrypoint.sh"))) {
      os.write(content.getBytes(), 0, content.length());
    }
  }
}