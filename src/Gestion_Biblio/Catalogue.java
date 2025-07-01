package Gestion_Biblio;

import java.util.ArrayList;

public class Catalogue {
	private ArrayList<Ouvrage> ouvrages;
	public Catalogue()
	{
		this.ouvrages=new ArrayList<Ouvrage> ();
	}
	public void ajouterOuvrage(Ouvrage ouvrage)
	{
		try
		{
		int i=0 ;
		Boolean test=true ;
		while(i< ouvrages.size() && test==true)
		{
			if(ouvrages.get(i).getISBN().equals(ouvrage.getISBN()))
				test=false;
			i++;
		}
		if(test==false)throw new Exception("le ISBN doit être unique !! ");
		
		ouvrages.add(ouvrage);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	public ArrayList<Ouvrage> getOuvrages()
	{
		return ouvrages ;
	}
	
	public void afficherCatalogue() {
    if (ouvrages == null || ouvrages.isEmpty()) {
        System.out.println("Le catalogue est vide.");
        return;
    }
    
    System.out.println("Catalogue des ouvrages :");
    for (Ouvrage ouvrage : ouvrages) {
        System.out.println(ouvrage.toString());
    }
}

}
