package org.example.relationship_practice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.print.Paper;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wardName;
    private int maxCapacity;

    @OneToMany(mappedBy = "ward",cascade = CascadeType.ALL)
    private List <Patient> patients;
}
