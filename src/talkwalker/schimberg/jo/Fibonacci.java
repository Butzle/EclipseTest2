package talkwalker.schimberg.jo;

import java.util.ArrayList;

public class Fibonacci {
	
	public ArrayList<Integer> fibonacciNumbers;
	
	
	public Fibonacci() {
		fibonacciNumbers = new ArrayList<>();
	}
	
	public int calculateFibonacci() {
		fibonacciNumbers.add(1);
		fibonacciNumbers.add(2);
		
		int fibonacciSum = 0;
		
		while(true) {
			fibonacciNumbers.add(fibonacciNumbers.get(fibonacciNumbers.size()-1)+fibonacciNumbers.get(fibonacciNumbers.size()-2));
			if(fibonacciNumbers.get(fibonacciNumbers.size()-1) > 4000000) {
				break;
			}else if(fibonacciNumbers.get(fibonacciNumbers.size()-1) % 2 == 0) {
				fibonacciSum += fibonacciNumbers.get(fibonacciNumbers.size()-1);
			}
			
		}
		return fibonacciSum+2;
		
		
	}
}
