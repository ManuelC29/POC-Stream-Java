package eni.fr.testPerso;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private String nom;
	private List<Clients> lstClient = new ArrayList<>();

	public List<Clients> getLstClient() {
		return lstClient;
	}

	public void setLstClient(List<Clients> lstClient) {
		this.lstClient = lstClient;
	}

	public Restaurant(List<Clients> lstClient) {
		super();
		this.lstClient = lstClient;
	}
	public Restaurant(String nom) {
		super();
		this.nom = nom;
	}
	public Restaurant() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", lstClient=" + lstClient + "]";
	}

	
}
