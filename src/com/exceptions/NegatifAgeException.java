package com.exceptions;

public class NegatifAgeException extends RuntimeException { // non control�e donc pas d'obligation de throws
	
	static String message = "Cette Exception est lev�e quand tu passe un age n�gatif !";

	public NegatifAgeException() {
		
		System.out.println(message);
	}
}
