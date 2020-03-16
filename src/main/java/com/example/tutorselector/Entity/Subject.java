package com.example.tutorselector.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Subject {
    @Id
    private String subName;
    private Double grade;
    private int subWeight;//课程权重
    @OneToMany(mappedBy = "subject")
    private List<Elective> electives;
}
