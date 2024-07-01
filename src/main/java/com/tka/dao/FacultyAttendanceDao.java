package com.tka.dao;

import com.tka.entity.FacultyAttendance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacultyAttendanceDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<FacultyAttendance> getAllFacultyAttendances() {
        Session session = sessionFactory.openSession();
        List<FacultyAttendance> facultyAttendances = session.createQuery("from FacultyAttendance", FacultyAttendance.class).list();
        session.close();
        return facultyAttendances;
    }

    public FacultyAttendance getFacultyAttendanceById(Long id) {
        Session session = sessionFactory.openSession();
        FacultyAttendance facultyAttendance = session.get(FacultyAttendance.class, id);
        session.close();
        return facultyAttendance;
    }

    public void saveFacultyAttendance(FacultyAttendance facultyAttendance) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(facultyAttendance);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteFacultyAttendance(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        FacultyAttendance facultyAttendance = session.get(FacultyAttendance.class, id);
        if (facultyAttendance != null) {
            session.delete(facultyAttendance);
        }
        session.getTransaction().commit();
        session.close();
    }
}
