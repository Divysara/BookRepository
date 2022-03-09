package com.learning;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {

//	@RequestMapping("home")
//	public String home(HttpServletRequest req) {
//		
//		HttpSession session =req.getSession(); 
//		String s = req.getParameter("name");
//		session.setAttribute("username", s);
//		System.out.println("Hi");
//		return "index";
	
	/*the above is old way way of doing , that can be achieved by below method too.i.e in Spring MVC way.
	 * 
	 */
	
/*	@RequestMapping("home")
	public String home(String name,HttpSession session) {
		
		
		session.setAttribute("username", name);
		System.out.println("Hi");
		return "index";
	*/	
		
	/*	@RequestMapping("home")
		public String home(@RequestParam("uname") String name,HttpSession session) {
			
			
			session.setAttribute("uname", name);
			System.out.println("Hi");
			return "index";*/
			
	/*		@RequestMapping("home")
			public ModelAndView home(@RequestParam("uname") String name,HttpSession session) {
				
				ModelAndView mav = new ModelAndView();
				mav.addObject("uname", name);
				mav.setViewName("index");
				session.setAttribute("uname", name);
				System.out.println("Hi");
				return mav;*/
				
				@RequestMapping("home")
				public ModelAndView home(Employee emp) {
					
					ModelAndView mav = new ModelAndView();
					mav.addObject("details", emp);
					mav.setViewName("index");
					
					System.out.println("Hi");
					return mav;
	}
	
}
