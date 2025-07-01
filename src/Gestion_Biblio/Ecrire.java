package Gestion_Biblio;

public class Ecrire {
	private Ouvrage ouvrage;
	private Auteur auteur;
	private String role ;
	private static String []optionRole= {"Auteur","Traducteur"};
	
	public Ecrire (Ouvrage ouvrage , Auteur auteur , String role)
	{
		try {
			if((role.equals(optionRole[0])==false) && (role.equals(optionRole[1])==false)) throw new Exception("L'Auteur doit etre un auteur original ou un traducteur !!");
			this.role=role;
			this.auteur=auteur;
			this.ouvrage=ouvrage;
			if(this.role.equals(optionRole[0])==true)
			{
				ouvrage.getAuteurs().add(auteur);
				auteur.getOuvragesEcrits().add(ouvrage);
			}
			if(this.role.equals(optionRole[1])==true)
			{
				ouvrage.getTraducteurs().add(auteur);
				auteur.getOuvragesTraduits().add(ouvrage);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public Auteur getAuteur() {
		return auteur;
	}

}
