package com.exception.exercices;

// NotANumberrException est une exception control�e (checked) (obligation de mettre throws)
public class NotANumberrException extends Exception {

	
	public NotANumberrException() {
		System.out.println(" contenu pas ad�quat le mauvais String est non convertible");
	}
}
