package com.trantor.leavesys.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.entity.Leave;
import com.trantor.leavesys.entity.adapter.IEntityConverter;
import com.trantor.leavesys.model.LeaveModel;
import com.trantor.leavesys.repository.JpaLeaveRepository;
import com.trantor.leavesys.service.logic.ILeaveService;
/**
 * @author rajni.ubhi
 *
 */
@Service("leaveService")
public class LeaveService implements ILeaveService {
	@Autowired
	private JpaLeaveRepository leaveRepository;
	
	@Resource(name="leaveConverter")
	private IEntityConverter<LeaveModel, Leave> leaveConverter;
	
	@Override
	@Transactional
	public LeaveModel addLeave(LeaveModel iLeave) {
		// TODO Auto-generated method stub
		Leave leave = leaveConverter.convertModelToEntity(iLeave);
		System.out.println(leave.getLeaveType());
		leaveRepository.save(leave);
		System.out.println("Leave Added");
		return leaveConverter.convertEntityToModel(leave);
	}
	
}
