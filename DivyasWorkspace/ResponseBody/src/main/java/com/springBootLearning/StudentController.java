package com.springBootLearning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class StudentController {
	
	@GetMapping("/students")
	public  @ResponseBody StudentClass getDetails(){
		
		StudentClass student = new StudentClass();
		student.setName ("Dhivya");
		student.setRollno (2020);
		student.setDept ("Csc");
		return student;
		
	}
}

//we can also use @RestController in the place of @Controller and skip @ResponseBody in the method, it works fine too
	/*
@RestController
public class StudentController {
	
	@GetMapping("/students")
	public  StudentClass getDetails(){
		
		StudentClass student = new StudentClass();
		student.setName ("Dhivya");
		student.setRollno (2020);
		student.setDept ("Csc");
		return student;
		
	}
	

}*/


/*http://localhost:2017/students - postman Get 
 * o/P: 
 * {
"name": "Dhivya",
"rollno": 2020,
"dept": "Csc"
}*/
