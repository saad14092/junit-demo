package com.agh.service;

public class DemoService {

	public long factorial(int n) {
		if (n < 3) {
			return n == 0 ? 1l : n;
		}
		
		return n * factorial(n - 1);
	}
	
	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
