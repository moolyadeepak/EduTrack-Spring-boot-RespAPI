package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tka.dao.ClassScheduleDAO;
import com.tka.entity.ClassSchedule;

@Service
public class ClassScheduleServiceImpl implements ClassScheduleService {

	@Autowired
	private ClassScheduleDAO classScheduleDAO;

	@Override
	@Transactional(readOnly = true)
	public List<ClassSchedule> getAllClassSchedules() {
		return classScheduleDAO.getAllClassSchedules();
	}

	@Override
	@Transactional(readOnly = true)
	public ClassSchedule getClassScheduleById(Long id) {
		return classScheduleDAO.getClassScheduleById(id);
	}

	@Override
	@Transactional
	public void saveClassSchedule(ClassSchedule classSchedule) {
		classScheduleDAO.saveClassSchedule(classSchedule);
	}

	@Override
	@Transactional
	public void deleteClassSchedule(Long id) {
		classScheduleDAO.deleteClassSchedule(id);
	}
}
