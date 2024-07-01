package com.tka.service;

import com.tka.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    void saveDepartment(Department department);

    void deleteDepartment(Long id);
}
