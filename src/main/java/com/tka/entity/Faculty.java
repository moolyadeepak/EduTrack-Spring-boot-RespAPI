package com.tka.entity;

import javax.persistence.*;


@Entity
@Table(name = "faculties")

public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "department_id", nullable = false)
    private Long departmentId;

	public Faculty(Long id, String name, String email, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.departmentId = departmentId;
	}

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", email=" + email + ", departmentId=" + departmentId + "]";
	}

    
}
