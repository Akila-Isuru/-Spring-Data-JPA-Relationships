package org.example.relationship_practice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String employeeId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

}
