package com.example.librarymanagementinformationsystem.services.bookservice;

import com.example.librarymanagementinformationsystem.dtos.requests.AddBookRequest;
import com.example.librarymanagementinformationsystem.dtos.responses.AddBookResponse;

public interface BookService {
    AddBookResponse addBook(AddBookRequest addBookRequest);
}
