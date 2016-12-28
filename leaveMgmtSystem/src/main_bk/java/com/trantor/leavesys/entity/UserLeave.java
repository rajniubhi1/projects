package com.trantor.leavesys.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.trantor.leavesys.business.ILeave;
import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserLeave;

/**
 * @author rajni.ubhi
 *
 */

@Entity
@Table(name = "USER_APPLIED_LEAVE")
public class UserLeave implements IUserLeave {
	@Id
	@GeneratedValue
	@Column(name = "USER_APPLIED_LEAVE_ID")
	private Long id;
	
	@OneToOne(targetEntity = User.class)
	@JoinColumn(name = "USER_ID")
	private IUser user;
	
	@OneToOne(targetEntity = Leave.class)
	@JoinColumn(name = "LEAVE_ID")
	private ILeave leave;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE")
	private Date startDate;
	
	@Column(name = "END_DATE")
	private Date endDate;
	
	@Column(name = "LEAVE_STATUS", columnDefinition = "varchar(32) default 'NOT_APPROVED'", insertable = false)
	@Enumerated(EnumType.STRING)
	private LeaveStatus leaveStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IUser getUser() {
		return user;
	}

	public void setUser(IUser user) {
		this.user = user;
	}

	public ILeave getLeave() {
		return leave;
	}

	public void setLeave(ILeave leave) {
		this.leave = leave;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus status) {
		this.leaveStatus = status;
	}

}
