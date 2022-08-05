package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.springjdbc.Student;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) 
	{
		String query ="insert into student(id , anme , city) values(?,?,?)";
		this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());		
		return 0;
	}

	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

}
