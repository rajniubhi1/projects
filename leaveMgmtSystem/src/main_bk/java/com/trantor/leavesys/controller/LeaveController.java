package com.trantor.leavesys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trantor.leavesys.business.ILeave;
import com.trantor.leavesys.model.LeaveModel;
import com.trantor.leavesys.service.logic.ILeaveService;

/**
 * @author rajni.ubhi
 *
 */

@RestController
@RequestMapping("/rest")
public class LeaveController {
	@Autowired
	private ILeaveService leaveService;
	
	@RequestMapping(value="/addLeave",method=RequestMethod.POST)
	public ResponseEntity<ILeave> addLeave(@RequestBody LeaveModel leaveModel) {
		System.out.println("Adding leave");
		LeaveModel model = leaveService.addLeave(leaveModel);
		if(model != null) {
			return new ResponseEntity<ILeave>(model,HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<ILeave>(HttpStatus.NOT_FOUND);
	}
}
