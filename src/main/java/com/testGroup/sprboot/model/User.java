package com.testGroup.sprboot.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;


@Data
@Entity
@Table(name = "users")
public class User {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(name = "first_name")
    private String firstName;
    @Getter
    @Column(name = "last_name")
    private String lastName;
    @Getter
    @Column(name = "year")
    private int year;
    @Getter
    @Column(name = "employer")
    private boolean employer;

}
