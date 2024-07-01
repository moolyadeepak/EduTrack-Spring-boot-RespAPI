package com.tka.service;

import com.tka.entity.Classroom;
import com.tka.dao.ClassroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {

	@Autowired
	private ClassroomDAO classroomDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Classroom> getAllClassrooms() {
		return classroomDAO.getAllClassrooms();
	}

	@Override
	@Transactional(readOnly = true)
	public Classroom getClassroomById(Long id) {
		return classroomDAO.getClassroomById(id);
	}

	@Override
	@Transactional
	public void saveClassroom(Classroom classroom) {
		classroomDAO.saveClassroom(classroom);
	}

	@Override
	@Transactional
	public void deleteClassroom(Long id) {
		classroomDAO.deleteClassroom(id);
	}
}
