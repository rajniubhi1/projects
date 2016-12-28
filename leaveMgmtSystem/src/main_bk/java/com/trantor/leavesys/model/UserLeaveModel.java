package com.trantor.leavesys.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.trantor.leavesys.business.ILeave;
import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserLeave;
import com.trantor.leavesys.entity.LeaveStatus;
import com.trantor.leavesys.entity.User;

/**
 * @author rajni.ubhi
 *
 */

@XmlRootElement(name="UserAppliedLeave")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserLeaveModel implements IUserLeave {
	@XmlElement(name = "id")
	private Long id;
	@XmlElement(name="User",type=UserModel.class)
	private IUser user;
	@XmlElement(name = "Leave",type=LeaveModel.class)
	private ILeave leave;
	@XmlElement(name="userId")
	private Long userId;
	@XmlElement(name="leaveId")
	private Long leaveId;
	@XmlElement(name = "startDate")
	private Date startDate;
	@XmlElement(name = "endDate")
	private Date endDate;
	@XmlElement(name = "leaveStatus")
	private LeaveStatus leaveStatus;
	
	public UserLeaveModel() {
		// TODO Auto-generated constructor stub
		this.leave = new LeaveModel();
		this.user = new User();
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	public void setUser(Long user) {
		// TODO Auto-generated method stub
		this.userId = user;
	}

	public Long getLeaveId() {
		// TODO Auto-generated method stub
		return leaveId;
	}

	public void setLeave(Long leave) {
		// TODO Auto-generated method stub
		this.leaveId = leave;
	}

	public Date getStartDate() {
		// TODO Auto-generated method stub
		return startDate;
	}

	public void setStartDate(Date startDate) {
		// TODO Auto-generated method stub
		this.startDate = startDate;
	}

	public Date getEndDate() {
		// TODO Auto-generated method stub
		return endDate;
	}

	public void setEndDate(Date endDate) {
		// TODO Auto-generated method stub
		this.endDate = endDate;
	}
	
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

	public String toString() {
		return "UserLeaveModel\n"
				+ "Id:"+id+",startDate :"+startDate+",endDate:"+endDate+"\nLeave :"+leaveId+"\nUser:"+userId;
	}

	@Override
	public IUser getUser() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void setUser(IUser user) {
		// TODO Auto-generated method stub
		this.user = user;
	}

	@Override
	public ILeave getLeave() {
		// TODO Auto-generated method stub
		return leave;
	}

	@Override
	public void setLeave(ILeave leave) {
		// TODO Auto-generated method stub
		this.leave = leave;
	}

}
