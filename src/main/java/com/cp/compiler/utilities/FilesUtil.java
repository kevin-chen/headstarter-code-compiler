package com.cp.compiler.utilities;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class FilesUtil {

    private FilesUtil() {}

    public static void saveUploadedFiles(String sourceCode, String name) throws IOException {
        byte[] bytes = sourceCode.getBytes();
        log.info("Written bytes to file {} and {}", bytes, new String(bytes));
        Path path = Paths.get(name);
        Files.write(path, bytes);
    }

    public static boolean deleteFile(String folder, String file) {
        if (folder != null && file != null) {
            String filePath = folder + "/" + file;
            return new File(filePath).delete();
        }
        return false;
    }
}
