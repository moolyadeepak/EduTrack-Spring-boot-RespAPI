package com.tka.service;

import com.tka.entity.Faculty;

import java.util.List;

public interface FacultyService {

    List<Faculty> getAllFaculties();

    Faculty getFacultyById(Long id);

    void saveFaculty(Faculty faculty);

    void deleteFaculty(Long id);
}
