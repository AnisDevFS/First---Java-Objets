package com.junit4.FizzBuzz;

public class FizzBuzz {
	
	// le but de de créer une méthode avec TDD
	// la méthode doit recuperer un int n entre 0 et 100
	// et retourner "Fizz" si n est divisble par 3
	// "Buzz" si n est divisible par 5
	// "FizzBuzz" si n est divisble par 15
	// sinon "n"
	
	public static String fizbuz(int n) {
			if (n % 3 == 0 ) return "Fizz";
			else if (n % 5 == 0) return "Buzz";
			return String.valueOf(n);
	}

}
