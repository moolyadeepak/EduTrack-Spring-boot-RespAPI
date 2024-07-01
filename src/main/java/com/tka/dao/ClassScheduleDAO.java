package com.tka.dao;

import com.tka.entity.ClassSchedule;

import java.util.List;

public interface ClassScheduleDAO {

    List<ClassSchedule> getAllClassSchedules();

    ClassSchedule getClassScheduleById(Long id);

    void saveClassSchedule(ClassSchedule classSchedule);

    void deleteClassSchedule(Long id);
}
