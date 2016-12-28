package com.trantor.leavesys.business;

import com.trantor.leavesys.entity.LeaveType;

/**
 * @author rajni.ubhi
 *
 */
public interface ILeave {
	public Long getLeaveId();
	
	public void setLeaveId(Long leaveId);
	
	public LeaveType getLeaveType();
	
	public void setLeaveType(LeaveType leaveType);
	
//	public String reasonFoeLeave();
//	
//	public void setReasonForLeave(String reason);
}
