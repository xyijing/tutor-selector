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
public class Tutor {
    @Id
    private String tutorId;
    private String password;
    private int maxNum;
    private int percent;//设置的默认学生成绩范围（低于将直接打回）
    @OneToMany(mappedBy = "tutor")
    private List<Student> students;

}
