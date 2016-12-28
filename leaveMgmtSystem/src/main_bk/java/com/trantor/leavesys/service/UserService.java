package com.trantor.leavesys.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.entity.User;
import com.trantor.leavesys.entity.adapter.IEntityConverter;
import com.trantor.leavesys.model.UserModel;
import com.trantor.leavesys.repository.UserRepository;
import com.trantor.leavesys.service.logic.IUserService;

/**
 * @author rajni.ubhi
 *
 */
@Service("userService")
@Transactional
public class UserService implements IUserService {
	
	@Resource(name = "userRepository")
	private UserRepository userRepository;
	
	@Autowired
	private IEntityConverter< UserModel, User> userConverter;
	@Override
	public IUser getUser(Long id) {
		// TODO Auto-generated method stub
		User user = userRepository.findOne(id);
		return userConverter.convertEntityToModel(user);
	}

}
