package com.example.tutorselector.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
public class Elective {
    @Id
    private String detail;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;

}
