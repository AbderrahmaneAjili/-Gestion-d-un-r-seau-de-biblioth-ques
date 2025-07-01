package Gestion_Biblio;

import java.util.Date;

public class Emprunte {
	private Date dateEmprunt ;
	private Date dateRetour ;
	private Lecteur emprunteur ;
	private Ouvrage ouvrage ;
	private Integer DureeMax=15 ;//15 jours 
	
	public Emprunte(Date dateEmprunt, Date dateRetour, Lecteur emprunteur,Ouvrage ouvrage) 
	{
		
			
			//condition sur la duree limitee ....	
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.emprunteur = emprunteur;
        this.ouvrage=ouvrage;
        
    }
	
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Date getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	public Lecteur getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(Lecteur emprunteur) {
		this.emprunteur = emprunteur;
	}


	public Ouvrage getOuvrage() {
		return ouvrage;
	}

}
