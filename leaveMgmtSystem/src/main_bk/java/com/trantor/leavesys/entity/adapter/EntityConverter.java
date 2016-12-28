package com.trantor.leavesys.entity.adapter;

import com.trantor.leavesys.entity.Leave;
import com.trantor.leavesys.entity.User;
import com.trantor.leavesys.entity.UserLeave;
import com.trantor.leavesys.model.LeaveModel;
import com.trantor.leavesys.model.UserLeaveModel;
import com.trantor.leavesys.model.UserModel;

/**
 * @author rajni.ubhi
 *
 */

public class EntityConverter {
	
	public static UserConverter getUserConverter() {
		return new UserConverter();
	}
	
	public static LeaveConverter getLeaveConverter() {
		return new LeaveConverter();
	}
	
	private static class UserConverter implements IEntityConverter<UserModel, User>{

		@Override
		public User convertModelToEntity(UserModel m) {
			// TODO Auto-generated method stub
			System.out.println("Model inside Converter:::"+m);
			User user = new User();
			user.setCompany(m.getCompany());
			user.setName(m.getName());
			return user;
		}

		@Override
		public UserModel convertEntityToModel(User e) {
			// TODO Auto-generated method stub
			UserModel model = new UserModel();
			model.setUserId(e.getUserId());
			model.setCompany(e.getCompany());
			model.setName(e.getName());
			return model;
		}

		@Override
		public User convertModelToEntityUsingId(UserModel m) {
			// TODO Auto-generated method stub
			User user = convertModelToEntity(m);
			user.setUserId(m.getUserId());
			return user;
		}
		
	}
	
	private static class UserLeaveConverter implements IEntityConverter<UserLeaveModel, UserLeave>{

		@Override
		public UserLeave convertModelToEntity(UserLeaveModel m) {
			// TODO Auto-generated method stub
			UserLeave userLeave = new UserLeave();
			userLeave.setEndDate(m.getEndDate());
			userLeave.setStartDate(m.getStartDate());
			userLeave.setLeaveStatus(m.getLeaveStatus());
			return userLeave;
		}

		@Override
		public UserLeaveModel convertEntityToModel(UserLeave e) {
			// TODO Auto-generated method stub
			UserLeaveModel model = new UserLeaveModel();
			model.setEndDate(e.getEndDate());
			model.setStartDate(e.getStartDate());
			model.setId(e.getId());
			model.setLeaveStatus(e.getLeaveStatus());
			return model;
		}

		@Override
		public UserLeave convertModelToEntityUsingId(UserLeaveModel m) {
			// TODO Auto-generated method stub
			UserLeave userLeave = convertModelToEntity(m);
			userLeave.setId(m.getId());
			return userLeave;
		}
		
	}
	private static class LeaveConverter implements IEntityConverter<LeaveModel, Leave>{

		@Override
		public Leave convertModelToEntity(LeaveModel m) {
			// TODO Auto-generated method stub
			Leave leave = new Leave();
			leave.setLeaveType(m.getLeaveType());
			//leave.setUserLeaves(m.getUSerLeaveModel());
			return leave;
		}

		@Override
		public LeaveModel convertEntityToModel(Leave e) {
			// TODO Auto-generated method stub
			LeaveModel leave = new LeaveModel();
			leave.setLeaveType(e.getLeaveType());
			leave.setLeaveId(e.getLeaveId());
			return leave;
		}

		@Override
		public Leave convertModelToEntityUsingId(LeaveModel m) {
			// TODO Auto-generated method stub
			Leave leave = convertModelToEntity(m);
			leave.setLeaveId(m.getLeaveId());
			return leave;
		}
		
	}
	public static IEntityConverter<UserLeaveModel, UserLeave> getUserLeaveConverter() {
		// TODO Auto-generated method stub
		return new UserLeaveConverter();
	}
}
