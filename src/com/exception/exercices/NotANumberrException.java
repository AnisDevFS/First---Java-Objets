package com.exception.exercices;

// NotANumberrException est une exception controlée (checked) (obligation de mettre throws)
public class NotANumberrException extends Exception {

	
	public NotANumberrException() {
		System.out.println(" contenu pas adéquat le mauvais String est non convertible");
	}
}
