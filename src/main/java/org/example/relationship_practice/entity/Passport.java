package org.example.relationship_practice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String PassportNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    @OneToOne(mappedBy ="passport",cascade = CascadeType.ALL)
    private Person person;
}
