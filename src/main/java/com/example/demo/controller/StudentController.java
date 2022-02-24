package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    private final StudentService studentService;
    // Aqui usamos la interfaz como tipo de dato, no te casas a la clase
   

    public StudentController( @Autowired StudentService studentService )
    {
    	//esto es inyeccion por constructor
    	//this.nombre=nombre;
    	//todas las clases que implementen studentservice crea objetos validos
        this.studentService = studentService;
    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
    	//son datos de prueba por no tener base de datos
    	//creas objetos
    	//recordemos empieza desde 0 por eso si le pones 1 te lanza el segundo que es Raul.
    	Student student1 = new Student("1", 1, "Reyna", "Solis", 8);
    	Student student2 = new Student("2", 2, "Raul", "Jalisco", 8);
    	Student student3 = new Student("5", 5, "Rho", "Ciudad", 8);
    	
    	//agregas los objetos
    	studentService.add(student3);
    	studentService.add(student2);
    	studentService.add(student1);
    	
    	
    	
        return studentService.findById( id );
    }

}
