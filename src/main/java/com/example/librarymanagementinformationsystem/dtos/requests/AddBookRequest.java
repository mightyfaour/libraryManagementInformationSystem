package com.example.librarymanagementinformationsystem.dtos.requests;

import com.example.librarymanagementinformationsystem.data.models.enums.BookType;
import com.example.librarymanagementinformationsystem.data.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddBookRequest {
    private String author;
    private String name;
    private String price;
    private String rackNo;
    private Status status;
    private String edition;
    private String bookType;
}
