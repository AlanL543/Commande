package edu.commandes.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String id;
	private List<Commande> lesCommandes;

	public Client(String id) {
		this.id = id;
		lesCommandes = new ArrayList<>();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String newId) {
		this.id = newId;
	}
}
