package com.example.tp;

public class Flotte {
	private Vehicule[] parc;
	private int nbVehicules;

	public Flotte() {
		this.parc = new Vehicule[5];
		this.nbVehicules = 0;
	}

	public void ajouter(Vehicule v) {
		if (nbVehicules == parc.length) {
			Vehicule[] temp = new Vehicule[parc.length * 2];
			for (int i = 0; i < parc.length; i++) {
				temp[i] = parc[i];
			}
			parc = temp;
		}
		parc[nbVehicules] = v;
		nbVehicules++;
	}

	public void afficherTous() {
		System.out.println("Flotte (" + nbVehicules + " véhicules) :");
		for (int i = 0; i < nbVehicules; i++) {
			System.out.println("  • " + parc[i]);
		}
	}

	public double distanceTotale() {
		double total = 0;
		for (int i = 0; i < nbVehicules; i++) {
			if (parc[i] instanceof Motorise) {
				total += ((Motorise) parc[i]).kmTotal;
			}
		}
		return total;
	}
}
