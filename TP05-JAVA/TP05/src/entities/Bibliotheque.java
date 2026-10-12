package entities;

public class Bibliotheque {
	private int capacite;
	private Document[] documents;
	private int nbDocuments;

	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		this.documents = new Document[capacite];
		this.nbDocuments = 0;
	}

	public boolean ajouter(Document doc) {
		if (nbDocuments < capacite) {
			documents[nbDocuments] = doc;
			nbDocuments++;
			return true;
		}
		return false;
	}

	public boolean supprimer(Document doc) {
		for (int i = 0; i < nbDocuments; i++) {
			if (documents[i].equals(doc) || documents[i].getNumEnreg() == doc.getNumEnreg()) {
				// Décalage pour combler le trou
				for (int j = i; j < nbDocuments - 1; j++) {
					documents[j] = documents[j + 1];
				}
				documents[nbDocuments - 1] = null;
				nbDocuments--;
				return true;
			}
		}
		return false;
	}

	public Document document(int numEnrg) {
		for (int i = 0; i < nbDocuments; i++) {
			if (documents[i].getNumEnreg() == numEnrg) {
				return documents[i];
			}
		}
		return null;
	}

	public void afficherDocuments() {
		if (nbDocuments == 0) {
			System.out.println("La bibliothèque est vide.");
			return;
		}
		System.out.println("--- Liste des documents ---");
		for (int i = 0; i < nbDocuments; i++) {
			System.out.println(documents[i]);
		}
	}

	public void afficherAuteurs() {
		System.out.println("--- Liste des auteurs ---");
		boolean trouve = false;
		for (int i = 0; i < nbDocuments; i++) {
			if (documents[i] instanceof Livre) {
				Livre l = (Livre) documents[i];
				System.out.println("- " + l.getAuteur() + " (Titre : " + l.getTitre() + ")");
				trouve = true;
			}
		}
		if (!trouve) {
			System.out.println("Aucun livre avec auteur dans la bibliothèque.");
		}
	}
}
