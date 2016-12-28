package com.trantor.leavesys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.trantor.leavesys.entity.Leave;
import com.trantor.leavesys.entity.User;
import com.trantor.leavesys.entity.UserLeave;
import com.trantor.leavesys.entity.adapter.EntityConverter;
import com.trantor.leavesys.entity.adapter.IEntityConverter;
import com.trantor.leavesys.model.LeaveModel;
import com.trantor.leavesys.model.UserLeaveModel;
import com.trantor.leavesys.model.UserModel;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@ComponentScan("com.trantor.leavesys")
public class AppConfig {
	@Bean
	public IEntityConverter<LeaveModel,Leave > leaveConverter() {
		return EntityConverter.getLeaveConverter();
	}
	@Bean
	public IEntityConverter<UserLeaveModel,UserLeave > userLeaveConverter() {
		return EntityConverter.getUserLeaveConverter();
	}
	@Bean
	public IEntityConverter<UserModel, User> userConverter() {
		return EntityConverter.getUserConverter();
	}
}
