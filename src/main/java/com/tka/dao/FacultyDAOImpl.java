package com.tka.dao;

import com.tka.entity.Faculty;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacultyDAOImpl implements FacultyDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Faculty> getAllFaculties() {
		Session session = null;
		List<Faculty> faculties;
		try {
			session = sessionFactory.openSession();
			faculties = session.createQuery("FROM Faculty", Faculty.class).getResultList();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return faculties;
	}

	@Override
	public Faculty getFacultyById(Long id) {
		Session session = null;
		Faculty faculty = null;
		try {
			session = sessionFactory.openSession();
			faculty = session.get(Faculty.class, id);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return faculty;
	}

	@Override
	public void saveFaculty(Faculty faculty) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(faculty);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deleteFaculty(Long id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Faculty faculty = session.get(Faculty.class, id);
			session.delete(faculty);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
