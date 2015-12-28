/**
 * 
 */
package com.headfirst.classes;

import com.headfirst.behaviours.FlyBehaviour;
import com.headfirst.behaviours.QuackBehaviour;

/**
 * @author Rajni
 *
 * @date 10-Jan-2015 1:42:10 pm
 */
public abstract class Duck {
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;

	/**
	 * 
	 */
	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public abstract void display();

	/**
	 * @param quackBehaviour the quackBehaviour to set
	 */
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	/**
	 * @param flyBehaviour the flyBehaviour to set
	 */
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	
}
