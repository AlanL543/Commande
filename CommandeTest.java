package edu.commandes.models;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandeTest {
	private Commande laCommande;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		laCommande = new Commande(new Client("Bob"));

	}
	
	@Test
	void testAddProduit() {
	    assertEquals(0,laCommande.getMontant(), 0);
	    laCommande.addProduit(new Produit("Pain", 2.0f), 2);
	    assertEquals(2, laCommande.getQuantiteProduits());
	    
	    laCommande.addProduit(new Produits)
	}

	@Test
	void testGetMontant() {
		assertEquals(0, laCommande.getMontant(), 0);
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(4.0f, laCommande.getMontant(), 0);
		laCommande.addProduit(new Produit("Croissant", 1.0f), 10);
		assertEquals(14.0f, laCommande.getMontant(), 0);
	}

	@Test
	void testGetQuantiteProduits() {
		assertEquals(0, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(2, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Croissant", 1.0f), 10);
		assertEquals(12, laCommande.getQuantiteProduits());
	}

	@Test
	void testRetireLigneDetail() {
		assertEquals(0, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(2, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Croissant", 1.0f), 10);
		assertEquals(12, laCommande.getQuantiteProduits());
		laCommande.retireLigneDetail("Pain");
		assertEquals(10, laCommande.getQuantiteProduits());

		laCommande.retireLigneDetail("xxx");
		assertEquals(10, laCommande.getQuantiteProduits());

		laCommande.retireLigneDetail("Croissant");
		assertEquals(0, laCommande.getQuantiteProduits());

	}
	
	@Test
	void testIncProduit() {
	    assertEquals(0,laCommande.getQuantiteProduits());
	    laCommande.add
	}

}
