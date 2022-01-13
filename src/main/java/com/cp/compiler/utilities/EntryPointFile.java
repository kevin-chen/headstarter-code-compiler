package com.cp.compiler.utilities;

import com.cp.compiler.models.Language;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Slf4j
public class EntryPointFile {

    private static final String TIMEOUT_CMD = "timeout --signal=SIGTERM ";
    private static final String BASH_HEADER = "#!/usr/bin/env bash\n";

    private EntryPointFile() {
    }

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