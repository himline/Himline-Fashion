package com.himline.fashion.exception;

public class HimlineFashionException extends Exception {
	
	public HimlineFashionException(String message) {
        super(message);
    }

    public HimlineFashionException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
