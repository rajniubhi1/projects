package com.trantor.leavesys.business;

/**
 * @author rajni.ubhi
 *
 */
public interface IUser {
	public Long getUserId();
	
	public void setUserId(Long id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getCompany();
	
	public void setCompany(String company);
}
