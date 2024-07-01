package com.tka.service;

import com.tka.entity.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject getSubjectById(Long id);

    void saveSubject(Subject subject);

    void deleteSubject(Long id);
}
