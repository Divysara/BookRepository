package ControllerPackage;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.User;

@RestController
public class UserController {

	
	@PostMapping("/users")
	public String getDetails(@RequestBody User user) {
		System.out.println("Printing User Object: " + user);
		return "success";
	}
}
