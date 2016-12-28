package com.trantor.leavesys.business;

import java.util.Date;

import com.trantor.leavesys.entity.LeaveStatus;

/**
 * @author rajni.ubhi
 *
 */
public interface IUserLeave {
	public Long getId() ;

	public void setId(Long id);
	
	public IUser getUser() ;

	public void setUser(IUser user) ;

	public ILeave getLeave() ;

	public void setLeave(ILeave leave) ;

	public Date getStartDate() ;

	public void setStartDate(Date startDate) ;

	public Date getEndDate() ;

	public void setEndDate(Date endDate) ;
	
	public void setLeaveStatus(LeaveStatus leaveStatus);
	
	public LeaveStatus getLeaveStatus();
}
