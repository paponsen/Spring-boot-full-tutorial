package com.example.game2play.springtutorial.dao;

import com.example.game2play.springtutorial.entity.Student;

import java.util.List;

public interface StudentDao {
    public void save(Student student);
    public Student findById(int id);

    public List<Student> findAll();

    public List<Student> findByLastName(String lastName);

    public void update(Student student);

    public void deleteByLastName(String lastName);
}
