package com.example.librarymanagementinformationsystem.services.bookservice;

import com.example.librarymanagementinformationsystem.data.repositories.BookRepository;
import com.example.librarymanagementinformationsystem.dtos.requests.AddBookRequest;
import com.example.librarymanagementinformationsystem.dtos.responses.AddBookResponse;
import com.example.librarymanagementinformationsystem.exceptions.BookAlreadyExistException;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public AddBookResponse addBook(AddBookRequest addBookRequest) {
        ValidThatBookDoesNotExist(addBookRequest.getName());

    }

    private void ValidThatBookDoesNotExist(String name) {
        if(bookRepository.findBookByName(name).isPresent()){
            throw new BookAlreadyExistException("Book already exist!");
        }
    }
}
