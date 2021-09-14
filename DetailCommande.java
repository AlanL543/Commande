package edu.commandes.models;

public class DetailCommande {
	private int quantite;
	private Produit leProduit;

	public DetailCommande(Produit p, int quantite) {
		this.leProduit = p;
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Produit getLeProduit() {
		return leProduit;
	}

	public void setLeProduit(Produit leProduit) {
		this.leProduit = leProduit;
	}
	
	@Override
	public boolean equals(Object obj ) {
	    if (obj == null) {
		return false;
	    }
	    if (!(obj instanceof DetailCommande)) {
		return false;
	    }
	    return ((DetailCommande) obj).getLeProduit().equals(leProduit);
	}
	
	public static DetailCommande getRef
}
