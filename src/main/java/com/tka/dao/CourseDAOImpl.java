package com.tka.dao;

import com.tka.entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Course> getAllCourses() {
        Session session = null;
        List<Course> courses;
        try {
            session = sessionFactory.openSession();
            courses = session.createQuery("FROM Course", Course.class).getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return courses;
    }

    @Override
    public Course getCourseById(Long id) {
        Session session = null;
        Course course = null;
        try {
            session = sessionFactory.openSession();
            course = session.get(Course.class, id);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return course;
    }

    @Override
    public void saveCourse(Course course) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(course);
            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void deleteCourse(Long id) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Course course = session.get(Course.class, id);
            session.delete(course);
            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
