package Gestion_Biblio;

public class Contrat {
	
	private Editeur editeur ;
	private Auteur auteur ;
	private double pourcentageRoyalty;
    private double ventesTotales;
    
    
    public Contrat(Auteur auteur, Editeur editeur, double pourcentageRoyalty) {
        this.setAuteur(auteur);
        this.setEditeur(editeur);
        this.pourcentageRoyalty = pourcentageRoyalty;
        this.ventesTotales = 0.0;
    }

    public void ajouterVentes(double montant) {
        this.ventesTotales += montant;
    }

    public double calculerRoyalties() {
        return ventesTotales * (pourcentageRoyalty / 100);
    }

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

    /*@Override
    public String toString() {
        return "Contrat entre " + auteur.getNom() + " et " + editeur.getNom() + 
               ", Royalties: " + pourcentageRoyalty + "%" + 
               ", Ventes totales: " + ventesTotales + " €";
    }*/
}


