package com.tka.service;

import com.tka.entity.Course;
import com.tka.dao.CourseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Course> getAllCourses() {
		return courseDAO.getAllCourses();
	}

	@Override
	@Transactional(readOnly = true)
	public Course getCourseById(Long id) {
		return courseDAO.getCourseById(id);
	}

	@Override
	@Transactional
	public void saveCourse(Course course) {
		courseDAO.saveCourse(course);
	}

	@Override
	@Transactional
	public void deleteCourse(Long id) {
		courseDAO.deleteCourse(id);
	}
}
