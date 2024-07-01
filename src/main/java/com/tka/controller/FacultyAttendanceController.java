package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tka.entity.FacultyAttendance;
import com.tka.service.FacultyAttendanceService;

@RestController
@RequestMapping("/api/faculty-attendances")
public class FacultyAttendanceController {

	@Autowired
	private FacultyAttendanceService facultyAttendanceService;

	@GetMapping
	public List<FacultyAttendance> getAllFacultyAttendances() {
		return facultyAttendanceService.getAllFacultyAttendances();
	}

	@GetMapping("/{id}")
	public FacultyAttendance getFacultyAttendanceById(@PathVariable Long id) {
		return facultyAttendanceService.getFacultyAttendanceById(id);
	}

	@PostMapping
	public FacultyAttendance createFacultyAttendance(@RequestBody FacultyAttendance facultyAttendance) {
		facultyAttendanceService.saveFacultyAttendance(facultyAttendance);
		return facultyAttendance;
	}

	@PutMapping("/{id}")
	public FacultyAttendance updateFacultyAttendance(@PathVariable Long id,
			@RequestBody FacultyAttendance facultyAttendanceDetails) {
		FacultyAttendance facultyAttendance = facultyAttendanceService.getFacultyAttendanceById(id);
		if (facultyAttendance != null) {
			facultyAttendance.setFaculty(facultyAttendanceDetails.getFaculty());
			facultyAttendance.setClassSchedule(facultyAttendanceDetails.getClassSchedule());
			facultyAttendance.setDate(facultyAttendanceDetails.getDate());
			facultyAttendance.setStatus(facultyAttendanceDetails.getStatus());
			facultyAttendanceService.saveFacultyAttendance(facultyAttendance);
			return facultyAttendance;
		} else {
			return null;
		}
	}

	@DeleteMapping("/{id}")
	public void deleteFacultyAttendance(@PathVariable Long id) {
		facultyAttendanceService.deleteFacultyAttendance(id);
	}
}
