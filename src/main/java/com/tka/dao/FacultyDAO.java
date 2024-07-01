package com.tka.dao;

import com.tka.entity.Faculty;

import java.util.List;

public interface FacultyDAO {

    List<Faculty> getAllFaculties();

    Faculty getFacultyById(Long id);

    void saveFaculty(Faculty faculty);

    void deleteFaculty(Long id);
}
