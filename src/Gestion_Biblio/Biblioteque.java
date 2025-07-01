package Gestion_Biblio;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap ;

public class Biblioteque {
	private String nom ;
	
	private String adresse ;
	private HashMap <Ouvrage,Integer> stock;
	private ArrayList <Commande> HistoriqueCommande ;
	private ArrayList <Emprunte> HistoriqueEmprunte;
	private ArrayList <Lecteur> lecteurs;
	
	static Catalogue catalogue ;
	
	
	
	public Biblioteque(String nom ,String adresse)
	{
		this.nom=nom;
		this.adresse=adresse ;
		this.stock=new HashMap <Ouvrage,Integer>();
		this.HistoriqueCommande= new ArrayList <Commande> () ;
		this.HistoriqueEmprunte= new ArrayList <Emprunte>();
		this.lecteurs=new ArrayList <Lecteur> ();
	}
	
	public void ajouterLecteur(Lecteur l)
	{
		lecteurs.add(l);
	}
	
	public void transfert(Biblioteque biblioteque,Ouvrage ouvrage,Integer quantite)
	{
		
		if(this.stock.containsKey(ouvrage)==true) {
			if(0<quantite && quantite<this.stock.get(ouvrage))
				if(this.stock.containsKey(ouvrage)==true)
				{
					if(biblioteque.stock.containsKey(ouvrage)==true) {
						biblioteque.stock.put(ouvrage, stock.get(ouvrage)+quantite);}
					else
					{
						biblioteque.stock.put(ouvrage,quantite);
					}
					System.out.println("Transfert d'ouvrage \""+ouvrage.getTitre()+" \" vers la bibliotheque \""+biblioteque.getNom()+"\" effectuee avec success !!" );
			}
			else
				System.out.println("Eche de transfert !! ");
			}
		else {
			System.out.println("Eche de transfert !! ");
		}
		
		
		
		
	}
	
	
	
	public void commander( Date date , Integer quantite,Ouvrage ouvrage)
	{
		
		try {
			int i=0 ;
			Boolean test=false ;
			while(i< catalogue.getOuvrages().size() && test==false)
			{
				if(catalogue.getOuvrages().get(i).equals(ouvrage))
					test=true;
				i++;
			}
			if(test==false)throw new Exception("Ouvrage n' existe pas dans le Catalogue ");
			test=true ;
			i=0;
			while(i< HistoriqueCommande.size() && test==true)
			{
				
				if((HistoriqueCommande.get(i).getOuvrage().getISBN().equals(ouvrage.getISBN())==true) && ((HistoriqueCommande.get(i).getDate().getDay()+HistoriqueCommande.get(i).getDate().getMonth()+HistoriqueCommande.get(i).getDate().getYear()) == (date.getDay()+date.getMonth()+date.getYear())))
					test=false;
				i++;
			}
			if(test==false)throw new Exception("Vous ne peuvez pas passer une deuxieme commande sur le meme livre dans le meme jour !! ");
			
			
			Commande c = new Commande(date,quantite,ouvrage);
			
			HistoriqueCommande.add(c);
			if(stock.containsKey(ouvrage)==true)
				stock.put(ouvrage, stock.get(ouvrage)+quantite);
			else
			{
				stock.put(ouvrage,quantite);
			}
			System.out.println("La commande d'ouvrage : \""+ouvrage.getTitre() +"\" effectee ! "+ "Le cout : "+c.getCout()+"$");
		}catch(Exception e)
		{
			System.out.println(e);	
		}
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}






	public ArrayList <Emprunte> getHistoriqueEmprunte() {
		return HistoriqueEmprunte;
	}






	public String getAdresse() {
		return adresse;
	}






	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public ArrayList <Lecteur> getLecteurs()
	{
		return lecteurs;	
	}
	public HashMap <Ouvrage,Integer> getStock()
	{
		return stock;
	}

}
