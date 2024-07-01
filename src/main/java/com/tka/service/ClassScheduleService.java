package com.tka.service;

import com.tka.entity.ClassSchedule;

import java.util.List;

public interface ClassScheduleService {

	List<ClassSchedule> getAllClassSchedules();

	ClassSchedule getClassScheduleById(Long id);

	void saveClassSchedule(ClassSchedule classSchedule);

	void deleteClassSchedule(Long id);
}
