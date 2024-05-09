package com.promineotech;

import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		
if (a > 0 && b > 0) {
	return a + b;
} else {
	throw new IllegalArgumentException("Both parameters must be positive!");

	// this method checks is a & b are positive numbers and if they are, it returns the sum of the numbers
	// if they are not positive it throws an exception
} 
	}

public static int multiplyNumbers(int c, int d) {
	return c * d;
	
	// this method takes two numbers and returns the product of the numbers
}
	
public int randomNumberSquared() {
	int result = getRandomInt();
	return result * result;

	// this method generates a random int and squares the number and returns the result
	
}
public int getRandomInt() {
	Random random = new Random();
	return random.nextInt(10) + 1;
}

// this method generates a random int between 1 and 10 
}

