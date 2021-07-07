package com.generecite;

public class Test {

	public static void main(String[] args) {
			
		Compte<String, Character> comp1 = new Compte<String, Character>();
		
		
		Compte<Long, String> comp2 = new Compte<Long, String>(265545l, 300, "euro");
				
		String devise2emeCompte = comp2.getDevise();
		
//		char devise1erCompte = comp1.getDevise();
		
		Client<String> cl = new Client<String>();
		Client<Integer> cl1 = new Client<Integer>();
		System.out.println(cl.foi2("ANis"));
		System.out.println(cl.foi22("ANis"));
		System.out.println(cl1.foi2(2));
		int k = cl1.foi2(2);
	}

}
