
package com.zensar.bean;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String email;
	@ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.ALL)
	@JoinColumn(name = "departId", nullable = false)
	private Department department;

	public Employee(int userId, String firstName, String lastName, LocalDate dob, String email, Department department) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", email=" + email + ", department=" + department + "]";
	}
}
