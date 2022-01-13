package com.cp.compiler.utilities;

import com.cp.compiler.models.Verdict;

public class StatusUtil {
    private StatusUtil() {}

    public static String statusResponse(int status) {
        switch (status) {
            case 0:
                return Verdict.NO_ERROR.getValue();
            case 2:
                return Verdict.COMPILATION_ERROR.getValue();
            case 139:
                return Verdict.OUT_OF_MEMORY.getValue();
            case 124:
                return Verdict.TIME_LIMIT_EXCEEDED.getValue();
            default:
                return Verdict.RUNTIME_ERROR.getValue();
        }
    }
}
