package com.learning;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
/*	@GetMapping(value = "/details",produces = MediaType.APPLICATION_XML_VALUE)
	public Student call(@RequestParam("sno") int sno, @RequestParam("sname") String sname ) {
		System.out.println("hi am from controller");
		Student s1= new Student();
		s1.setSno(sno);
		s1.setSname(sname);
		return s1;
		
	}*/
	
	@RestController
	public class SourceController
	{
		@PostMapping(value="/calcy",consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
		public Student getWish(@RequestBody Student s1 )
		{
			
			return s1;
		}
	}

}
