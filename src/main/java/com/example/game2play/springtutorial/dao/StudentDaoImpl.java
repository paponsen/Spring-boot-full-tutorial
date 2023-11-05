package com.example.game2play.springtutorial.dao;

import com.example.game2play.springtutorial.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{

    EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);

    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
        List<Student> listStudent = theQuery.getResultList();
        return listStudent;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student where lastName=:thedata",Student.class);
        theQuery.setParameter("thedata", lastName);
        List<Student> listStudent = theQuery.getResultList();
        return listStudent;
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteByLastName(String lastName) {
        TypedQuery query = (TypedQuery) entityManager.createQuery("DELETE FROM Student where lastName=:theName");
        query.setParameter("theName", lastName);
        int numOfRows = query.executeUpdate();
        System.out.println("Number of rows deleted: "+numOfRows);
    }
}
