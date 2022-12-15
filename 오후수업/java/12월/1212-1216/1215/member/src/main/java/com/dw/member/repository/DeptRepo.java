package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Long> {

}
