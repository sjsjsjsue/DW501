package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;


public class EmpVO extends BaseVO {
	private int empno; // 사원번호
	private String ename; // 사원이름
	private String job; // 직업
	private String sal; // 급여
	private String hiredate; // 입사날짜 
	// 여기 있는 변수 이름이 바뀌면 sql.xml 의 변수의 insert의 변수도 변경해야함
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
}
