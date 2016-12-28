package com.trantor.leavesys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.business.IUserLeave;
import com.trantor.leavesys.entity.Leave;
import com.trantor.leavesys.entity.User;
import com.trantor.leavesys.entity.UserLeave;
import com.trantor.leavesys.entity.adapter.IEntityConverter;
import com.trantor.leavesys.model.UserLeaveModel;
import com.trantor.leavesys.repository.JpaLeaveRepository;
import com.trantor.leavesys.repository.UserLeaveRepository;
import com.trantor.leavesys.repository.UserRepository;
import com.trantor.leavesys.service.logic.IUserLeaveService;

/**
 * @author rajni.ubhi
 *
 */
@Service("userLeaveServcie")
@Transactional
public class UserLeaveService implements IUserLeaveService {
	@Autowired
	@Qualifier("userLeaveRepository")
	private UserLeaveRepository userLeaveRepository;
	
	@Autowired
	@Qualifier("leaveRepository")
	private JpaLeaveRepository leaveRepository;
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Autowired
	private IEntityConverter<UserLeaveModel, UserLeave> userLeaveConverter;
	
	public IUserLeave saveAppliedLeave(IUserLeave model) {
		UserLeave userLeave = userLeaveConverter.convertModelToEntity((UserLeaveModel) model);
		System.out.println(model);
		
		Leave leave = leaveRepository.findOne(model.getLeave().getLeaveId());
		userLeave.setLeave(leave);
		
		User user = userRepository.findOne(model.getUser().getUserId());
		userLeave.setUser(user);
		
//		Set<IUserLeave> set1 = new HashSet<>();
//		set1.add(userLeave);
//		user.setUserLeaves(set1);
//		leave.setUserLeaves(set1);
		
		userLeaveRepository.save(userLeave);
		return userLeaveConverter.convertEntityToModel(userLeave);
	}
}
