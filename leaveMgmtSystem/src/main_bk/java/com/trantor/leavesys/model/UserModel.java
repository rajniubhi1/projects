package com.trantor.leavesys.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.trantor.leavesys.business.IUser;

/**
 * @author rajni.ubhi
 *
 */

@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserModel implements IUser {
	@XmlElement(name = "userId")
	private Long userId;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "company")
	private String company;
//	@XmlElement(required = false,name="userLeaves")
//	private UserLeaveModel serLeaveModel;
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
//	public UserLeaveModel getSerLeaveModel() {
//		return serLeaveModel;
//	}
//
//	public void setSerLeaveModel(UserLeaveModel serLeaveModel) {
//		this.serLeaveModel = serLeaveModel;
//	}
	
	public String toString() {
		return "User :\n"+"Id:"+userId+",name :"+name;
	}
}
