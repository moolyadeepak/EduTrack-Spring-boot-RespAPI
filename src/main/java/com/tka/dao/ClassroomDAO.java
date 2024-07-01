package com.tka.dao;

import com.tka.entity.Classroom;

import java.util.List;

public interface ClassroomDAO {

    List<Classroom> getAllClassrooms();

    Classroom getClassroomById(Long id);

    void saveClassroom(Classroom classroom);

    void deleteClassroom(Long id);
}
