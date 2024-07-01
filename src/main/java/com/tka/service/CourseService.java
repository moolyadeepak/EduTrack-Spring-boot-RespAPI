package com.tka.service;

import com.tka.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    void saveCourse(Course course);

    void deleteCourse(Long id);
}
