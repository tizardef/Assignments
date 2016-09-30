package com.ssa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssa.dao.*;
import com.ssa.entity.*;





@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudentDAO studentDAO;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentDAO.getStudentById(id);
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

}
