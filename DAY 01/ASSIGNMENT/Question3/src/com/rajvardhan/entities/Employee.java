package com.rajvardhan.entities;

public class Employee {
	private int empId;
	private String empName;
	private String empDept;

	public Employee() {
		this(0, null, null);
	}

	public Employee(int empId, String empName, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}

}
