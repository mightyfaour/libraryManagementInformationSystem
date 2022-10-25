package com.example.librarymanagementinformationsystem.data.models;

import com.example.librarymanagementinformationsystem.data.models.enums.BookType;
import com.example.librarymanagementinformationsystem.data.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Book Data")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    private String author;
    private String name;
    private String price;
    private String rackNo;
    private Status status;
    private String edition;
    @JsonDeserialize(using= LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD")
    private LocalDate dateAdded;
    @Enumerated(value = EnumType.STRING)
    private BookType bookType;
}
