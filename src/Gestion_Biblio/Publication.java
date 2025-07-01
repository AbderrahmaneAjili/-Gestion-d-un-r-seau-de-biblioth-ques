package Gestion_Biblio;

import java.util.Date;

public class Publication {
	private Date date;
	private Editeur editeur ;
	private Ouvrage ouvrage ;
	public Publication(Date date , Editeur editeur , Ouvrage ouvrage)
	{
		this.setDate(date);
		this.setEditeur(editeur);
		this.setOuvrage(ouvrage);
		editeur.getPublications().add(this);
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}

}
