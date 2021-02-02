package com.Lesson1;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
