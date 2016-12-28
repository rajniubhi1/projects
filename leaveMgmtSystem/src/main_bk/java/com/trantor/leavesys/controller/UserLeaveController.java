package com.trantor.leavesys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.trantor.leavesys.model.UserLeaveModel;
import com.trantor.leavesys.model.UserModel;
import com.trantor.leavesys.service.logic.IUserLeaveService;

/**
 * @author rajni.ubhi
 *
 */

@RestController
@RequestMapping("/applyleave")
public class UserLeaveController {

	@Resource(name = "userLeaveServcie")
	private IUserLeaveService userLeaveService;
	
	@RequestMapping(value="/create/apply",method = RequestMethod.POST)
	public String applyLeave(@ModelAttribute("userLeaveModel") UserLeaveModel model) {
		System.out.println("Inside Controller");
		UserLeaveModel returnedModel = (UserLeaveModel) userLeaveService.saveAppliedLeave(model);
		if(returnedModel != null) {
			//return new ResponseEntity<UserLeaveModel>(returnedModel,HttpStatus.ACCEPTED);
			return "created!!!!!!!!!!!!";
		}
	//	return new ResponseEntity<UserLeaveModel>(HttpStatus.NOT_FOUND);
		return null;
	}
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public ModelAndView createUserLeave(@ModelAttribute("userModal") UserModel model) {
		System.out.println("Inside Controller");
		ModelAndView mav = new ModelAndView("applyLeave");
		UserLeaveModel userLeaveModel = new UserLeaveModel();
		userLeaveModel.setUser(model);
		mav.addObject("userLeaveModel", userLeaveModel);
		
		return mav;
	}
	
	@RequestMapping(value="/create/{id}",method = RequestMethod.GET)
	public ModelAndView createUserLeaveGet(@PathVariable("id") Long id) {
		System.out.println("Inside Controller for get request");
		ModelAndView mav = new ModelAndView("applyLeave");
		UserLeaveModel userLeaveModel = new UserLeaveModel();
		UserModel model = new UserModel();
		model.setUserId(id);
		userLeaveModel.setUser(model);
		mav.addObject("userLeaveModel", userLeaveModel);
		List<String> myList = new ArrayList<>();
		myList.add("CL");
		myList.add("EL");
		mav.addObject("myList", myList);
		return mav;
	}
}
