package com.example.librarymanagementinformationsystem.exceptions;

public class BookAlreadyExistException extends RuntimeException {
    public BookAlreadyExistException(String message) {
        super(message);
    }
}
