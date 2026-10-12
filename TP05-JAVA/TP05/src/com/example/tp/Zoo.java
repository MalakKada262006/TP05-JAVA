package com.example.tp;

public class Zoo {
	private Animal[] animaux;
	private int nbAnimaux;

	public Zoo() {
		this.animaux = new Animal[5];
		this.nbAnimaux = 0;
	}

	public void ajouterAnimal(Animal a) {
		if (nbAnimaux == animaux.length) {
			Animal[] temp = new Animal[animaux.length * 2];
			for (int i = 0; i < animaux.length; i++) {
				temp[i] = animaux[i];
			}
			animaux = temp;
		}
		animaux[nbAnimaux] = a;
		nbAnimaux++;
	}

	public void afficherTous() {
		System.out.println("Le zoo contient " + nbAnimaux + " animaux :");
		for (int i = 0; i < nbAnimaux; i++) {
			System.out.println("  - " + animaux[i]);
		}
	}
}