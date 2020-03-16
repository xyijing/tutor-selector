package com.example.tutorselector.Entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class EntityTest {
    @Autowired
    private EntityManager manager;

    @Test
    public void test_addStudent(){
        Student s1 = new Student();
        s1.setId("201722444x");
        s1.setName("xu");
        manager.persist(s1);

        Student s2 = new Student();
        s2.setId("201722444y");
        s2.setName("xu");
        manager.persist(s2);


        Tutor tutor = new Tutor();
        tutor.setTutorId("BO");
        tutor.setPassword("111");
        manager.persist(tutor);
    }

    @Test
    public void test_rel(){
        Tutor t1 = manager.find(Tutor.class,"BO");

        Student s1 = manager.find(Student.class,"201722444x");
        Student s2 = manager.find(Student.class,"201722444y");
        s1.setTutor(t1);
        s2.setTutor(t1);
    }

    @Test
    public void test_elective(){
        Student s1 = new Student();
        s1.setId("201722444x");
        s1.setName("xu");
        manager.persist(s1);

        Student s2 = new Student();
        s2.setId("201722444y");
        s2.setName("xu");
        manager.persist(s2);


        Subject sub1 = new Subject();
        sub1.setSubName("web");
        manager.persist(sub1);

        Subject sub2 = new Subject();
        sub2.setSubName("java");
        manager.persist(sub2);
    }

    @Test
    public void test_addelection(){
        Student s1 = manager.find(Student.class,"201722444x");
        Subject sub1 = manager.find(Subject.class,"web");
        Elective elective = new Elective();
        elective.setStudent(s1);
        elective.setSubject(sub1);
        elective.setDetail("test");
        manager.persist(elective);
    }
}
