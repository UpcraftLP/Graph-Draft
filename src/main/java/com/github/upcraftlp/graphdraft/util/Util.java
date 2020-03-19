package com.github.upcraftlp.graphdraft.util;

public class Util {

    public static RuntimeException unfinished(String message) {
        return new UnsupportedOperationException(message);
    }

    public static RuntimeException unfinished() {
        return new UnsupportedOperationException("not implemented yet");
    }
}
