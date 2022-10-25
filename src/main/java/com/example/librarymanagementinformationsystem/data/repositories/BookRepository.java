package com.example.librarymanagementinformationsystem.data.repositories;

import com.example.librarymanagementinformationsystem.data.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
 Optional<Book> findBookByName(String name);
}
