package com.wipro.model;

import java.time.LocalDate;

public class Employee {
	private Integer empno;
	private String ename;
	private LocalDate hiredate;
	private String job;
	private Double sal;
	private Integer deptno;
	
	public Employee()
	{}	
	public Employee(Integer empno, String ename, LocalDate hiredate, String job, Double sal, Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.job = job;
		this.sal = sal;
		this.deptno = deptno;
	}
	
	
	public Employee(Integer empno, String ename, String hiredate, String job, Double sal, Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = LocalDate.parse(hiredate);
		this.job = job;
		this.sal = sal;
		this.deptno = deptno;
	}
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public void setCustomHiredate(String hiredate) {
		this.hiredate = LocalDate.parse(hiredate);
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", job=" + job + ", sal="
				+ sal + ", deptno=" + deptno + "]";
	}
	
	
	
	

}
