package com.learning.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.Model.User;
import com.learning.dao.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	public String User(User user) {
		return "index.jsp";
	}
	
	@RequestMapping("adduser")
	public String addUser(User user) {
		
		userdao.save(user);
		return "index.jsp";
		
	}
		
	@RequestMapping("getuser")
		public ModelAndView getUser(@RequestParam int id) {
			
		ModelAndView mav = new ModelAndView("showUser.jsp");
		User user = userdao.findById(id).orElse(new User());
			mav.addObject(user);
			return mav;
	}
	@RequestMapping("deleteuser")
	public ModelAndView deleteUser(@RequestParam int id) {
		
	ModelAndView mav = new ModelAndView("deleteUser.jsp");
	User user = userdao.findById(id).orElse(new User());
	userdao.deleteById(id);
		mav.addObject(user);
		return mav;
}
	
	@RequestMapping("updateuser")
	public ModelAndView updateUser(@RequestParam int id) {
		
	ModelAndView mav = new ModelAndView("updateUser.jsp");
	User user = userdao.findById(id).orElse(new User());
	userdao.deleteById(id);
		mav.addObject(user);
		return mav;
}

}
