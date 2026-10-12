package com.example.tp;

public class Mains {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		zoo.ajouterAnimal(new Mammifere("Lion", 5, "Dorée"));
		zoo.ajouterAnimal(new Oiseau("Aigle", 3, 2.3));
		zoo.ajouterAnimal(new Reptile("Crocodile", 12, "Épaisse"));
		zoo.ajouterAnimal(new Mammifere("Girafe", 7, "Tachetée"));
		zoo.ajouterAnimal(new Oiseau("Perroquet", 2, 0.4));
		zoo.ajouterAnimal(new Reptile("Serpent", 4, "Lisse"));

		zoo.afficherTous();
		System.out.println();

		Animal elephant = new Mammifere("Éléphant", 10, "Grise");
		zoo.ajouterAnimal(elephant);
		((Mammifere) elephant).allaiter();

		Animal autruche = new Oiseau("Autruche", 6, 1.8);
		zoo.ajouterAnimal(autruche);
		((Oiseau) autruche).voler();
	}
}
