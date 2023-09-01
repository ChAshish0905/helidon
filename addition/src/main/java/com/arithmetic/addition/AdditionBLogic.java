package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdditionBLogic {
	public int execute(int a, int b) {
		System.out.println(" AdditionBLogic.execute(" + a + "," + b + ")");
		return a + b;
	}

	public Object execute(Object num1, Object num2) {
		// TODO Auto-generated method stub
		return null;
	}
}
