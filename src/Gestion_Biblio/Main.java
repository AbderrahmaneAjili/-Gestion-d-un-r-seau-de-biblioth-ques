package Gestion_Biblio;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /******************* catalogue *******************/
        Biblioteque.catalogue = new Catalogue();
        
        /******************* bibliothèques *******************/
        Biblioteque bibliotheque1 = new Biblioteque("Bibliothèque municipale de Monastir", "QR8G+4FF, Monastir");
        Biblioteque bibliotheque2 = new Biblioteque("Bibliothèque centrale de Tunis", "Tunis, Centre-ville");

        /******************* ouvrages *******************/
        Ouvrage ouvrage1 = new Ouvrage("978-1-61268-019-4", "Rich Dad Poor Dad", "Anglais", 12.99);
        Ouvrage ouvrage2 = new Ouvrage("978-2-07-036822-8", "Le Petit Prince", "Français", 8.50);
        Ouvrage ouvrage3 = new Ouvrage("978-0-7432-7356-5", "The 7 Habits of Highly Effective People", "Anglais", 14.99);
        Ouvrage ouvrage4 = new Ouvrage("978-3-16-148410-0", "Introduction à l'algorithmique", "Français", 25.99);
        Ouvrage ouvrage5 = new Ouvrage("978-0-452-28423-4", "1984", "Anglais", 10.75);
        Ouvrage ouvrage6 = new Ouvrage("978-2-290-33729-3", "L'Alchimiste", "Français", 9.99);
        
        /******************* auteurs *******************/
        Auteur auteur1 = new Auteur("Robert", "T. Kiyosaki", 12345678);
        Auteur auteur2 = new Auteur("Antoine", "de Saint-Exupéry", 22334455);
        Auteur auteur3 = new Auteur("Stephen", "R. Covey", 33445566);
        Auteur auteur4 = new Auteur("George", "Orwell", 44556677);
        Auteur auteur5 = new Auteur("Paulo", "Coelho", 55667788);
        
        /******************* traducteurs *******************/
        Auteur traducteur1 = new Auteur("John", "Doe", 66778899);
        Auteur traducteur2 = new Auteur("Marie", "Dubois", 77889900);
        Auteur traducteur3 = new Auteur("Laura", "Smith", 88990011);
        Auteur traducteur4 = new Auteur("Jean", "Martin", 99001122);
        
        /******************* lecteurs *******************/
        Lecteur lecteur1 = new Lecteur("Abderrahmane", "Ajili", 9876532);
        Lecteur lecteur2 = new Lecteur("Ali", "Ben Salem", 8765432);
        Lecteur lecteur3 = new Lecteur("Fatma", "Bouaziz", 7654321);
        Lecteur lecteur4 = new Lecteur("Sami", "Trabelsi", 6543210);
        Lecteur lecteur5 = new Lecteur("Leila", "Mansouri", 5432109);
        
        /******************* Ajout_ouvrages_au_catalogue *******************/
        Biblioteque.catalogue.ajouterOuvrage(ouvrage1);
        Biblioteque.catalogue.ajouterOuvrage(ouvrage2);
        Biblioteque.catalogue.ajouterOuvrage(ouvrage3);
        Biblioteque.catalogue.ajouterOuvrage(ouvrage4);
        Biblioteque.catalogue.ajouterOuvrage(ouvrage5);
        Biblioteque.catalogue.ajouterOuvrage(ouvrage6);
        
        /******************* Association_des_auteurs_et_traducteurs_aux_ouvrages *******************/
        Ecrire e1 = new Ecrire(ouvrage1, auteur1, "Auteur");
        Ecrire t1 = new Ecrire(ouvrage1, traducteur1, "Traducteur");
        Ecrire e2 = new Ecrire(ouvrage2, auteur2, "Auteur");
        Ecrire t2 = new Ecrire(ouvrage2, traducteur2, "Traducteur");
        Ecrire e3 = new Ecrire(ouvrage3, auteur3, "Auteur");
        Ecrire t3 = new Ecrire(ouvrage3, traducteur3, "Traducteur");
        Ecrire e4 = new Ecrire(ouvrage4, auteur3, "Auteur");
        Ecrire t4 = new Ecrire(ouvrage4, traducteur4, "Traducteur");
        Ecrire e5 = new Ecrire(ouvrage5, auteur4, "Auteur");
        Ecrire e6 = new Ecrire(ouvrage6, auteur5, "Auteur");
        
        /******************* Affichage_Catalogue *******************/ 
        
        Biblioteque.catalogue.afficherCatalogue();
        
        /******************* Affichage_informations_lecteurs *******************/
        System.out.println("\nListe des lecteurs :\n");
        System.out.println(lecteur1);
        System.out.println(lecteur2);
        System.out.println(lecteur3);
        System.out.println(lecteur4);
        System.out.println(lecteur5);
        
        
        
        /******************* Commandes *******************/ 
        System.out.println("\nLes commandes : \n");
        bibliotheque1.commander( new Date(), 5 , ouvrage1);
        bibliotheque1.commander( new Date(), 5 , ouvrage1);
        bibliotheque1.commander( new Date(), 6 , ouvrage2);
        bibliotheque1.commander( new Date(), 10 , ouvrage3);
        bibliotheque1.commander( new Date(), 8 , ouvrage4);
        bibliotheque1.commander( new Date(), 7 , ouvrage5);
        bibliotheque1.commander( new Date(), 9 , ouvrage6);
        
        /******************* inscription_Lecteur_dans_les_bibliotheques *******************/
        bibliotheque1.ajouterLecteur(lecteur1);
        bibliotheque1.ajouterLecteur(lecteur2);
        bibliotheque1.ajouterLecteur(lecteur3);
        bibliotheque1.ajouterLecteur(lecteur4);
        bibliotheque1.ajouterLecteur(lecteur5);

        bibliotheque2.ajouterLecteur(lecteur1);
        bibliotheque2.ajouterLecteur(lecteur2);
        bibliotheque2.ajouterLecteur(lecteur3);
        bibliotheque2.ajouterLecteur(lecteur4);
        bibliotheque2.ajouterLecteur(lecteur5);
        /******************* les empruntes *******************/

        System.out.println("\nListe des Emprunts : \n");
        lecteur1.emprunt(bibliotheque1, new Date(2024, 11, 1), new Date(2024, 12, 1), ouvrage1);
        lecteur2.emprunt(bibliotheque1, new Date(2024, 10, 15), new Date(2024, 11, 15), ouvrage2);
        lecteur3.emprunt(bibliotheque2, new Date(2024, 9, 10), new Date(2024, 10, 10), ouvrage3);
        lecteur4.emprunt(bibliotheque2, new Date(2024, 8, 20), new Date(2024, 9, 20), ouvrage4);
        lecteur5.emprunt(bibliotheque1, new Date(2024, 7, 25), new Date(2024, 8, 25), ouvrage5);
        lecteur1.emprunt(bibliotheque2, new Date(2024, 6, 5), new Date(2024, 7, 5), ouvrage6);

        
        /******************* les retours *******************/
        System.out.println("\nLes retours : \n");
        lecteur1.retour(bibliotheque1,new Date(2024, 11, 4) , ouvrage1);
        lecteur1.retour(bibliotheque1,new Date(2024, 11, 4) , ouvrage1);
        lecteur2.retour(bibliotheque1,new Date(2025, 11, 4) , ouvrage2);
        
        /******************* les editeurs *******************/
        
        System.out.println("\nLes editeurs : \n");
        Editeur editeur1 = new Editeur("Plata Publishing", "Tous droits réservés");
        Editeur editeur2 = new Editeur("Éditions Gallimard", "Tous droits réservés");
        Editeur editeur3 = new Editeur("Free Press", "Tous droits réservés");
        
        /******************* les contrats *******************/
        Contrat contrat1 = new Contrat(auteur1, editeur1, 15.0); 
        Contrat contrat2 = new Contrat(auteur2, editeur2, 10.0); 
        Contrat contrat3 = new Contrat(auteur3, editeur3, 12.5); 
        Contrat contrat4 = new Contrat(auteur4, editeur3, 18.0); 
        Contrat contrat5 = new Contrat(auteur5, editeur2, 8.0);  

        /******************* les publications *******************/
        Publication publication1 = new Publication(new Date(2023, 1, 15), editeur1, ouvrage1); 
        Publication publication2 = new Publication(new Date(1943, 4, 6), editeur2, ouvrage2); 
        Publication publication3 = new Publication(new Date(1989, 8, 15), editeur3, ouvrage3); 
        Publication publication4 = new Publication(new Date(1949, 6, 8), editeur3, ouvrage5);  
        Publication publication5 = new Publication(new Date(1988, 2, 15), editeur2, ouvrage6); 
        
        
        /******************* les événements *******************/
        Evenement evenement1 = new Evenement("Journée mondiale du livre", new Date(2024, 3, 23));
        Evenement evenement2 = new Evenement("Conférence sur l'intelligence artificielle", new Date(2024, 5, 10));
        Evenement evenement3 = new Evenement("Atelier d'écriture créative", new Date(2024, 7, 5));
        Evenement evenement4 = new Evenement("Séance de dédicaces avec Paulo Coelho", new Date(2024, 9, 15));
        Evenement evenement5 = new Evenement("Exposition : Les trésors littéraires", new Date(2024, 11, 1));
        Evenement evenement6 = new Evenement("Rencontre littéraire sur 'Le Petit Prince'", new Date(2024, 12, 10));
        
        
        /******************* Invitation Auteurs *******************/
        evenement1.invitation(auteur1);
        evenement1.invitation(auteur5);
        evenement2.invitation(auteur2);
        evenement3.invitation(auteur3);
        evenement4.invitation(auteur5);
        evenement5.invitation(auteur4);
        
        /******************* Invitation lecteurs *******************/
        evenement1.invitation(lecteur2);
        evenement3.invitation(lecteur1);
        evenement3.invitation(lecteur3);
        evenement4.invitation(lecteur4);
        evenement6.invitation(lecteur5);
        
        
        /******************* Ajout ouvrages *******************/
        evenement2.ajouteOuvrage(ouvrage6);
        evenement1.ajouteOuvrage(ouvrage2);
        evenement5.ajouteOuvrage(ouvrage5);
        evenement6.ajouteOuvrage(ouvrage4);
        evenement3.ajouteOuvrage(ouvrage3);
        
        
       /******************* Affichage Evenements *******************/
        System.out.println("\nListe des événements :\n");

        System.out.println("Evenement 1: " + evenement1.getNom() + " - " + evenement1.getDate());
        evenement1.afficherAuteurs();
        evenement1.afficherLecteurs();
        evenement1.afficherOuvrages();

        System.out.println("Evenement 2: " + evenement2.getNom() + " - " + evenement2.getDate());
        evenement2.afficherAuteurs();
        evenement2.afficherLecteurs();
        evenement2.afficherOuvrages();

        System.out.println("Evenement 3: " + evenement3.getNom() + " - " + evenement3.getDate());
        evenement3.afficherAuteurs();
        evenement3.afficherLecteurs();
        evenement3.afficherOuvrages();

        System.out.println("Evenement 4: " + evenement4.getNom() + " - " + evenement4.getDate());
        evenement4.afficherAuteurs();
        evenement4.afficherLecteurs();
        evenement4.afficherOuvrages();

        System.out.println("Evenement 5: " + evenement5.getNom() + " - " + evenement5.getDate());
        evenement5.afficherAuteurs();
        evenement5.afficherLecteurs();
        evenement5.afficherOuvrages();

        System.out.println("Evenement 6: " + evenement6.getNom() + " - " + evenement6.getDate());
        evenement6.afficherAuteurs();
        evenement6.afficherLecteurs();
        evenement6.afficherOuvrages();
        
        
        
        /******************* les transferts *******************/
        
        System.out.println("\nLes transfert inter-Bibliotheques :\n");
        bibliotheque1.transfert(bibliotheque2, ouvrage6, 3);
        bibliotheque1.transfert(bibliotheque2, ouvrage1, 2);
        bibliotheque1.transfert(bibliotheque2, ouvrage5, 4);
        

    }
    }