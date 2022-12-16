package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
// 테이블 이름은 소문자로!
@Table(name = "dw_member")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id; // PK
	@Column
	private String name; // 이름
	@Column
	private int age; // 나이

	@Column(length = 30)
	private String userId; // userid

	@Column(length = 40)
	private String userPassword; // user 비밀번호
	

	public String getUserPassword() {
		return this.userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	// JoinColumn : member 테이블에 dept_id 라는 컬럼(fk) 생성
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Dept dept; // one to many관계. 하지만 member 컬럼으로 보면 many to one 관계
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
