package Gestion_Biblio;

import java.util.ArrayList;

public class Auteur {
	private Integer code ;
	private String nom ;
	private String prenom;
	private Integer CIN ;
	private static Integer codeInitial=2000 ;
	private ArrayList <Ouvrage>ouvragesTraduits;
	private ArrayList <Ouvrage>ouvragesEcrits;
	
	
	public Auteur(String nom , String prenom , Integer CIN )
	{
		this.nom=nom;
		this.prenom=prenom;
		this.CIN=CIN;
		codeInitial++;
		this.code=codeInitial;
		this.ouvragesTraduits = new ArrayList <Ouvrage>();
		this.ouvragesEcrits = new ArrayList <Ouvrage>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public ArrayList <Ouvrage> getOuvragesTraduits() {
		return ouvragesTraduits;
	}
	public ArrayList <Ouvrage> getOuvragesEcrits() {
		return ouvragesEcrits;
	}

	public Integer getCIN() {
		return CIN;
	}
	
	
}
