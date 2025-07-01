package Gestion_Biblio;
import java.util.ArrayList ;
import java.util.Date;

public class Evenement {
	private String nom ;
	private Date date;
	private ArrayList <Ouvrage> ouvrages;
	private ArrayList <Auteur> auteurs ;
	private ArrayList <Lecteur> lecteurs;
	
	public Evenement (String nom , Date date )
	{
		this.nom=nom;
		this.date=date;
		this.ouvrages=new ArrayList <Ouvrage> ();
		this.auteurs=new ArrayList <Auteur> () ;
		this.lecteurs=new ArrayList <Lecteur> ();
		
	}
	
	public void ajouteOuvrage(Ouvrage ouvrage)
	{
		ouvrages.add(ouvrage);
		System.out.println("Vous avez ajouter l'ouvrage : "+ouvrage.getTitre());
	}
	
	public void invitation(Lecteur lecteur)
	{
		lecteurs.add(lecteur);
		System.out.println("Vous avez invite le lecteur : "+lecteur.getNom() + " "+lecteur.getPrenom());
	}
	
	
	public void invitation(Auteur auteur)
	{
		auteurs.add(auteur);
		System.out.println("Vous avez invite l'auteur : "+auteur.getNom() + " "+auteur.getPrenom());
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public void afficherOuvrages() {
        System.out.println("Liste des ouvrages pour l'événement '" + nom + "':");
        for (Ouvrage ouvrage : ouvrages) {
            System.out.println("- " + ouvrage.getTitre());
        }
    }

    public void afficherAuteurs() {
        System.out.println("Liste des auteurs invités pour l'événement '" + nom + "':");
        for (Auteur auteur : auteurs) {
            System.out.println("- " + auteur.getNom() + " " + auteur.getPrenom());
        }
    }

    public void afficherLecteurs() {
        System.out.println("Liste des lecteurs invités pour l'événement '" + nom + "':");
        for (Lecteur lecteur : lecteurs) {
            System.out.println("- " + lecteur.getNom() + " " + lecteur.getPrenom());
        }
    }
	
	
	

}
