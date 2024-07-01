package com.tka.dao;

import com.tka.entity.Subject;

import java.util.List;

public interface SubjectDAO {

    List<Subject> getAllSubjects();

    Subject getSubjectById(Long id);

    void saveSubject(Subject subject);

    void deleteSubject(Long id);
}
