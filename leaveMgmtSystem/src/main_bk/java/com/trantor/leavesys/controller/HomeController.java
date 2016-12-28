package com.trantor.leavesys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.model.UserModel;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		System.out.println("Inside the controller:: HomeController");
		IUser user = new UserModel();
		ModelAndView mav = new ModelAndView("createUser");
		mav.addObject("userModel", user);
		return mav;
	}
	
	@RequestMapping(value="/user/get",method=RequestMethod.POST)
	public ModelAndView getUserById(@RequestParam("userId") Long id, final RedirectAttributes redirectAttributes) {
		//IUser user = userService.getUser(id);
		ModelAndView mav = new ModelAndView("redirect:/applyleave/create/"+id);
	//	mav.addObject("userModal", user);
		return mav;
		// needs to use redirect attributes..
//		RedirectView rav = new RedirectView("redirect:/applyleave/create");
//		redirectAttributes.addFlashAttribute("userModal", user);
//		return rav;
	}
}
