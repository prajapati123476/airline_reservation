package com.coforge.training.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.airlines.services.LoginService;
import com.coforge.training.airlines.model.User;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
//	@GetMapping("/login")
//	public ModelAndView login() {
//		ModelAndView mav = new ModelAndView("login");
//		mav.addObject("passenger", new Passenger() );
//		return mav;
//	}
	
	@PostMapping("/login")
	public Boolean login(@Validated @RequestBody User user  ) {
		
		String email = user.getEmail();
		String password = user.getPassword();
		
		User oauthUser = loginService.login(email);
		
		System.out.println(oauthUser);
		if(email.equals(oauthUser.getEmail()) && password.equals(oauthUser.getPassword()) )
		{
			return true;
		} else {
			return false;
		}
		
	}
	
//	@PostMapping("/login")
//	public Boolean login(@ModelAttribute("passenger") Passenger passenger  ) {
//		
//		Boolean a=false;;
//        String email=passenger.getEmail();
//        String password=passenger.getPassword();
//        //System.out.println(email+password);
//        Passenger d = loginService.login(email, password);
//    //    System.out.println(d.getEmail() +d.getPassword() );
//
//        if(email.equals(d.getEmail()) && password.equals(d.getPassword()))
//                {
//        //    System.out.println(d.getEmail() +d.getPassword() );
//            a=true;
//
//                }
//        return a;
//		
//	}
	
//	@PostMapping("/login")
//    public Boolean login(@Validated @RequestBody Passenger passenger)
//    {
//        Boolean a=false;;
//        String email=passenger.getEmail();
//        String password=passenger.getPassword();
//        Passenger d = loginService.loginService(email, password);
//
//        if(email.equals(d.getEmail()) && password.equals(d.getPassword()))
//                {
//            a=true;
//
//                }
//        return a;
//    }

	

}
