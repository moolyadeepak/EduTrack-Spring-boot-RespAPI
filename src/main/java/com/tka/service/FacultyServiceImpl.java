package com.tka.service;

import com.tka.entity.Faculty;
import com.tka.dao.FacultyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyDAO facultyDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Faculty> getAllFaculties() {
        return facultyDAO.getAllFaculties();
    }

    @Override
    @Transactional(readOnly = true)
    public Faculty getFacultyById(Long id) {
        return facultyDAO.getFacultyById(id);
    }

    @Override
    @Transactional
    public void saveFaculty(Faculty faculty) {
        facultyDAO.saveFaculty(faculty);
    }

    @Override
    @Transactional
    public void deleteFaculty(Long id) {
        facultyDAO.deleteFaculty(id);
    }
}
