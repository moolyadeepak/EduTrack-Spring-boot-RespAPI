package com.tka.dao;

import com.tka.entity.Course;

import java.util.List;

public interface CourseDAO {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    void saveCourse(Course course);

    void deleteCourse(Long id);
}
