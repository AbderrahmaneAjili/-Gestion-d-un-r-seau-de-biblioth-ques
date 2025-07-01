package Gestion_Biblio;
import java.util.ArrayList ;
import java.util.Date;
public class Editeur {
	private String nom ;
	private String DroitsPublication ; 
	private ArrayList <Publication>publications;
	
	public Editeur (String nom , String DroitsPublication)
	{
		this.nom=nom;
		this.DroitsPublication=DroitsPublication;
		this.publications= new ArrayList <Publication>();
	}
	
	
	public void  cederDroits(Editeur editeur)
	{
		editeur.DroitsPublication+="+++"+DroitsPublication;
		DroitsPublication="";
	}
	public void  reacquerirDroits(Editeur editeur)
	{
		DroitsPublication+="+++"+editeur.DroitsPublication;
		editeur.DroitsPublication="";
	}
	public void retirage(Date date , Ouvrage ouvrage)
	{
		if(publications.size()==0) {
		Publication p = new Publication(date, this,ouvrage); 
		publications.add(p);
		System.out.println("Retirage effectuer avec success !!");
		}
		else
			System.out.println("echec de Retirage !!");
	}
	public String getNom() {
		return nom;
	}
	
	public String DroitsPublication() {
		return DroitsPublication;
	}
	public ArrayList <Publication> getPublications()
	{
		return publications ;
	}
	
	
	

}
