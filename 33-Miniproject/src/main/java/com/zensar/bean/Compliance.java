
package com.zensar.bean;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compliances")
public class Compliance {
	@Id
	private int complianceId;
	private String rlType;
	private String details;
	private LocalDate createDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "departId", referencedColumnName = "departId")
	private Department department;
	private int empCount;
	private int stsCount;
	private String status;

	public Compliance(int complianceId, String rlType, String details, LocalDate createDate, Department department,
			int empCount, int stsCount, String status) {
		super();
		this.complianceId = complianceId;
		this.rlType = rlType;
		this.details = details;
		this.createDate = createDate;
		this.department = department;
		this.empCount = empCount;
		this.stsCount = stsCount;
		this.status = status;
	}

	public Compliance() {
		super();
	}

	public int getComplianceId() {
		return complianceId;
	}

	public void setComplianceId(int complianceId) {
		this.complianceId = complianceId;
	}

	public String getRlType() {
		return rlType;
	}

	public void setRlType(String rlType) {
		this.rlType = rlType;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public int getStsCount() {
		return stsCount;
	}

	public void setStsCount(int stsCount) {
		this.stsCount = stsCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Compliance [complianceId=" + complianceId + ", rlType=" + rlType + ", details=" + details
				+ ", createDate=" + createDate + ", department=" + department + ", empCount=" + empCount + ", stsCount="
				+ stsCount + ", status=" + status + ", getComplianceId()=" + getComplianceId() + ", getRlType()="
				+ getRlType() + ", getDetails()=" + getDetails() + ", getCreateDate()=" + getCreateDate()
				+ ", getDepartment()=" + getDepartment() + ", getEmpCount()=" + getEmpCount() + ", getStsCount()="
				+ getStsCount() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
