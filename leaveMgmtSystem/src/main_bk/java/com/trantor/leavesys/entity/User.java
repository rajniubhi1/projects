package com.trantor.leavesys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.trantor.leavesys.business.IUser;

/**
 * @author rajni.ubhi
 *
 */

@Entity
@Table(name = "USER_1")
public class User implements IUser {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String name;
	@Column(name = "COMPANY")
	private String company;
//	@OneToOne(mappedBy="user" , targetEntity = UserLeave.class , optional=true)
//	private Set<IUserLeave> userLeaves = new HashSet<>();
	
	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	@Override
	public void setUserId(Long id) {
		// TODO Auto-generated method stub
		this.userId = id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return company;
	}

	@Override
	public void setCompany(String company) {
		// TODO Auto-generated method stub
		this.company = company;
	}

//	public Set<IUserLeave> getUserLeaves() {
//		return userLeaves;
//	}
//
//	public void setUserLeaves(Set<IUserLeave> userLeaves) {
//		this.userLeaves = userLeaves;
//	}
	
}
