package com.exceptions;

public class NegatifAgeException extends RuntimeException { // non controlée donc pas d'obligation de throws
	
	static String message = "Cette Exception est levée quand tu passe un age négatif !";

	public NegatifAgeException() {
		
		System.out.println(message);
	}
}
