package com.trantor.leavesys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.trantor.leavesys.business.ILeave;

/**
 * @author rajni.ubhi
 *
 */

@Entity
@Table(name = "LEAVE")
public class Leave implements ILeave {
	@Id
	@GeneratedValue
	@Column(name = "LEAVE_ID")
	private Long leaveId;
	@Column(name = "LEAVE_TYPE", nullable = false)
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;
//	@OneToOne(mappedBy = "leave", targetEntity = UserLeave.class, optional = true)
//	private Set<IUserLeave> userLeaves = new HashSet<>();

	@Override
	public Long getLeaveId() {
		// TODO Auto-generated method stub
		return leaveId;
	}

	@Override
	public void setLeaveId(Long leaveId) {
		// TODO Auto-generated method stub
		this.leaveId = leaveId;
	}

	@Override
	public LeaveType getLeaveType() {
		// TODO Auto-generated method stub
		return leaveType;
	}

	@Override
	public void setLeaveType(LeaveType leaveType) {
		// TODO Auto-generated method stub
		this.leaveType = leaveType;
	}

//	public Set<IUserLeave> getUserLeaves() {
//		return userLeaves;
//	}
//
//	public void setUserLeaves(Set<IUserLeave> userLeaves) {
//		this.userLeaves = userLeaves;
//	}
	
}
