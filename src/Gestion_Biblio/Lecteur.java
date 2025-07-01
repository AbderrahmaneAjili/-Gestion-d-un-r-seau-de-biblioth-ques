package Gestion_Biblio;

import java.util.ArrayList;
import java.util.Date;

public class Lecteur {
	
	private String nom;
	private String prenom ;
	private Integer CIN ;
	private Integer id;
	private ArrayList<Emprunte>listeEmprunts ;
	private static Integer premierId=1000;
	private Integer point = 100 ; 
	public Lecteur(String nom,String prenom  , Integer CIN )
	{
		premierId++;
		this.setCIN(CIN);
		this.setId(premierId);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.listeEmprunts = new ArrayList<Emprunte>() ;
	}
	
	
	public void emprunt(Biblioteque biblio, Date dateEmprunt, Date dateRetour,Ouvrage ouvrage)
	{
		try {
			if(dateEmprunt.after(dateRetour)==true)throw new Exception(" Verifiez la date d'emprunte et la date de retour !! ");
			if(biblio.getLecteurs().contains(this)==false)throw new Exception("Lecteur inexistant !! ");
			if(biblio.getStock().containsKey(ouvrage)==false || biblio.getStock().get(ouvrage)==0)throw new Exception("Ouvrage n'est pas disponible !!");
		if(point>0)
		{
		
		Emprunte e = new Emprunte(dateEmprunt , dateRetour , this ,ouvrage);
		listeEmprunts.add(e);
		biblio.getStock().put(ouvrage, biblio.getStock().get(ouvrage)-1);
		System.out.println("Emprunte de \""+this.nom +" "+ this.prenom+"\" d'ouvrage \""+ouvrage.getTitre()+"\" effectuee avec success !! ");
		}
		else {
			System.out.println("Vous ne pouvez plus emprunter des ouvrage !! ");
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void retour(Biblioteque biblio,Date dateRetour ,Ouvrage ouvrage)
	{
		int i = 0;
		while((i<listeEmprunts.size() )&& (listeEmprunts.get(i).getOuvrage().equals(ouvrage)==false))
		{
			//System.out.println(listeEmprunts.size());
			i++;
		}
		if(i<listeEmprunts.size()) {
			biblio.getStock().put(ouvrage, biblio.getStock().get(ouvrage)+1);
			
			if(dateRetour.after(listeEmprunts.get(i).getDateRetour()))
			{
				System.out.println("Vous n'avez pas retourner l' ouvrage au temps :( '-10'  !!");
				this.point-=10;
			}
			else
			{
				
				System.out.println("Merci d'avoir retourner l' ouvrage au temps :) !!");
				
			}
			this.listeEmprunts.remove(i);
		}
		else
		{
			System.out.println("Vous ne pouvez pas retourner un ouvrage n'est pas deja emprunter !!");
		}
	}
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getCIN() {
		return CIN;
	}
	public void setCIN(Integer cIN) {
		CIN = cIN;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
	    return "Lecteur { " +
	           "ID: " + id +
	           ", Nom: '" + nom + '\'' +
	           ", Prénom: '" + prenom + '\'' +
	           ", CIN: " + CIN +
	           ", Nombre d'emprunts: " + (listeEmprunts != null ? listeEmprunts.size() : 0) +
	           " }";
	}


	public Integer getPointInitial() {
		return point;
	}


	public void setPointInitial(Integer pointInitial) {
		this.point = pointInitial;
	}



	

}
