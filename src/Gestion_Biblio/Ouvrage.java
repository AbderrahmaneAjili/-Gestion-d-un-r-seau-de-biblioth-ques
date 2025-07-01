package Gestion_Biblio;
import java.util.ArrayList;



public class Ouvrage {
	
	private String ISBN ;
	private String titre ;
	private String langue ; 
	private double prix ;
	private Boolean estUnOriginal ;
	private Boolean estUneTraduction ;
	private ArrayList<Auteur>auteurs ;
	private ArrayList<Auteur> traducteurs;
	private ArrayList <Publication>publications;
	private ArrayList <Integer> notes;
	private ArrayList <String> evaluations;
	
	
	public Ouvrage(String ISBN ,String titre ,String langue, double prix)
	{		
			this.ISBN=ISBN;
			this.titre=titre;
			this.langue=langue;
			this.estUnOriginal=true;
			this.estUneTraduction=false;
			this.setPrix(prix) ;
			this.auteurs=new ArrayList<Auteur>() ;
			this.traducteurs = new ArrayList<Auteur>();
			this.publications=new ArrayList <Publication>();
			this.notes=new ArrayList <Integer>() ;
			this.evaluations=new ArrayList <String> ();
	}
	
	public void attribueEvaluation(String evaluation) {
        evaluations.add(evaluation);
    }

	public void attribueNote(int note) {
        if (note >= 1 && note <= 5) {
            notes.add(note);
        } else {
            System.out.println("la note doit etre entre 1 et 5.");
        }
    }
	
	
	public String getISBN() {
		return ISBN;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public String getLangue() {
		return langue;
	}
	
	public Boolean getEstUnOriginal() {
		return estUnOriginal;
	}
	public void setEstUnOriginal(Boolean estUnOriginal) {
		this.estUnOriginal = estUnOriginal;
	}
	public Boolean getEstUneTraduction() {
		return estUneTraduction;
	}
	public void setEstUneTraduction(Boolean estUneTraduction) {
		this.estUneTraduction = estUneTraduction;
	}
	@Override
    public int hashCode() {
        return java.util.Objects.hash(ISBN,titre);
    }
	
	public boolean equals(Ouvrage ouvrage) {
		return ouvrage.hashCode()==this.hashCode();
	}

	public ArrayList<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(ArrayList<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	public ArrayList<Auteur> getTraducteurs() {
		return traducteurs;
	}

	public void setTraducteurs(ArrayList<Auteur> traducteurs) {
		this.traducteurs = traducteurs;
	}

	public ArrayList <Publication> getPublications() {
		return publications;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		if(prix >0)
			this.prix = prix;
		else
			this.prix = (prix*(-1));
			
	}
	@Override
	public String toString() {
	    return "Ouvrage { " +
	           "ISBN: '" + ISBN + '\'' +
	           ", Titre: '" + titre + '\'' +
	           ", Langue: '" + langue + '\'' +
	           ", Prix: " + prix +
	           ", Est un Original: " + estUnOriginal +
	           ", Est une Traduction: " + estUneTraduction +
	           ", Nombre d'Auteurs: " + (auteurs != null ? auteurs.size() : 0) +
	           ", Nombre de Traducteurs: " + (traducteurs != null ? traducteurs.size() : 0) +
	           ", Nombre de Publications: " + (publications != null ? publications.size() : 0) +
	           " }";
	}

	
}

