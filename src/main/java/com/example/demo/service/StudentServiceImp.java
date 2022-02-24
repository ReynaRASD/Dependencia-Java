package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentServiceImp implements StudentService {

	private final List<Student> studentList = new ArrayList<Student>();
	//En la clase A, se necesita crear un objeto de la clase B.
	// aqui la clase B es la interfaz StudentService
	//objeto de una clase que implemente esta interfaz.
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
		
		
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(String id) {
		// TODO Auto-generated method stub
		return studentList.get(Integer.parseInt(id));
	}
}
