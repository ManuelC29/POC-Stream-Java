package eni.fr.testPerso;

public class Clients {
	private String nom;
	private Integer montantCmd;

	public Clients(String nom, Integer montantCmd) {
		super();
		this.nom = nom;
		this.montantCmd = montantCmd;
	}

	public Clients() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getMontantCmd() {
		return montantCmd;
	}

	public void setMontantCmd(Integer montantCmd) {
		this.montantCmd = montantCmd;
	}

	@Override
	public String toString() {
		return "Clients [nom=" + nom + ", montantCmd=" + montantCmd + "]";
	}



}
