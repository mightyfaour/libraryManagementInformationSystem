package com.example.librarymanagementinformationsystem.data.models;


import com.example.librarymanagementinformationsystem.data.models.enums.RoleType;
import lombok.*;

import javax.persistence.*;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Role Data")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Enumerated(value = EnumType.STRING)
    private RoleType roleType;

}
