package com.tka.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public class ClassroomDAOImpl implements ClassroomDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Classroom> getAllClassrooms() {
		Session session = null;
		List<Classroom> classrooms;
		try {
			session = sessionFactory.openSession();
			classrooms = session.createQuery("FROM Classroom", Classroom.class).getResultList();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return classrooms;
	}

	@Override
	public Classroom getClassroomById(Long id) {
		Session session = null;
		Classroom classroom = null;
		try {
			session = sessionFactory.openSession();
			classroom = session.get(Classroom.class, id);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return classroom;
	}

	@Override
	public void saveClassroom(Classroom classroom) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(classroom);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deleteClassroom(Long id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Classroom classroom = session.get(Classroom.class, id);
			session.delete(classroom);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
