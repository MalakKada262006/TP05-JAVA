package com.example.tp;

public class Main {
	public static void main(String[] args) {
		Compte c1 = new Compte(1000.0);
		c1.afficherDetails();
		c1.deposer(200);
		c1.retirer(1500);
		c1.afficherDetails();

		System.out.println();

		CompteEpargne ce = new CompteEpargne(500.0, 3.0);
		ce.afficherDetails();
		ce.appliquerInterets();
		ce.afficherDetails();
		ce.retirer(100);
		ce.afficherDetails();

		System.out.println();

		CompteCourant cc = new CompteCourant(200.0, 300.0);
		cc.afficherDetails();
		cc.retirer(400);
		cc.afficherDetails();
		cc.retirer(200);
		cc.afficherDetails();

		System.out.println();

		Compte poly = new CompteEpargne(100, 5);
		poly.afficherDetails();
	}
}
