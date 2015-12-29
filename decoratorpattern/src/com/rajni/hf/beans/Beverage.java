/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:33:13 pm
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();
}
