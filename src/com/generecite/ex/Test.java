package com.generecite.ex;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
			
		Prof<String> anis = new Prof<String>("Anis", "mail", 30, "HTML");
		
		ArrayList<String> mats = new ArrayList<String>();
		mats.add("HTML");		mats.add("CSS");        mats.add("Java");
		
		Prof<ArrayList<String>> ayoub = new Prof<ArrayList<String>>("Ayoub", "mail", 30, mats);
		
		anis.decrireMatieres();
		System.out.println("-----------");
		ayoub.decrireMatieres();
	}

}
