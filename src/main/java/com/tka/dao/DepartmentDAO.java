package com.tka.dao;

import com.tka.entity.Department;

import java.util.List;

public interface DepartmentDAO {

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    void saveDepartment(Department department);

    void deleteDepartment(Long id);
}
