package org.example.relationship_practice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CourseCode;
    private String title;
    private int credits;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    List<Student> students;
}
