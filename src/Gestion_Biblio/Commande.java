package Gestion_Biblio;
import java.util.Date;

public class Commande {
	private static Integer c=0;
	private Integer numero ;
	private Date date;
	private Integer quantite;
	private Ouvrage ouvrage ;
	private Double cout;
	public Commande (Date date , Integer quantite , Ouvrage ouvrage)
	{
		
		try {
			if(quantite<0)throw new Exception("Verifier la quantitee !! "); 
			c++;
			this.date=date;
			this.ouvrage=ouvrage;
			this.quantite=quantite;
			this.numero=c;
			this.cout=quantite*ouvrage.getPrix();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public Integer getNumero() {
		return numero;
	}
	
	public Date getDate() {
		return date;
	}
	public Integer getQuantite() {
		return quantite;
	}
	
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public Double getCout()
	{
		return cout;
	}
	
}
