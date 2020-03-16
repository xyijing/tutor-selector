package com.example.tutorselector.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    private String id;
    private String name;
    @ManyToOne
    private Tutor tutor;
    @OneToMany(mappedBy = "student")
    private List<Elective> electives;
}
