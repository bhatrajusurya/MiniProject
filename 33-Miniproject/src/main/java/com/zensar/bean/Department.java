
package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	private int departId;
	private String departName;

	public Department(int departId, String departName) {
		super();
		this.departId = departId;
		this.departName = departName;
	}

	public Department() {
		super();
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public String toString() {
		return "Department [departId=" + departId + ", departName=" + departName + "]";
	}
}
