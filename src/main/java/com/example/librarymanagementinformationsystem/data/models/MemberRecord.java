package com.example.librarymanagementinformationsystem.data.models;

import com.example.librarymanagementinformationsystem.data.models.enums.Type;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Member Data")
public class MemberRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long memberId;
    @Enumerated(value = EnumType.STRING)
    private Type type;
    private LocalDate dateOfMembership;
    private  int noOfBooksIssued;
    private int maxBooksLimit;
    private  String name;
    private String address;
    private  String phoneNo;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    Set<Role> roles;

}
