package com.tka.service;

import com.tka.entity.Classroom;

import java.util.List;

public interface ClassroomService {

    List<Classroom> getAllClassrooms();

    Classroom getClassroomById(Long id);

    void saveClassroom(Classroom classroom);

    void deleteClassroom(Long id);
}
