package edu.commandes.models;

public class CommandeSpeciale extends Commande {
	private float promo;

	public CommandeSpeciale(Client client, float promo) {
		super(client);
		this.promo = promo;
	}

	@Override
	public float getMontant() {
		return super.getMontant() * (1 - this.promo);
	}
}
