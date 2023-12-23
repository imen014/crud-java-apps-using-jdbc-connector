package jdbc_Entertaiment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*2. Insertion de données :
   Créez un programme qui insère une nouvelle entrée (par exemple, 
   un enregistrement de produit) dans une table de base 
de données. Vous pouvez demander
 à l'utilisateur d'entrer les données à insérer.*/

class Produit{
	public Produit(String nom_produit, int quantitee) {
		super();
		this.nom_produit = nom_produit;
		this.quantitee = quantitee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public int getQuantitee() {
		return quantitee;
	}

	public void setQuantitee(int quantitee) {
		this.quantitee = quantitee;
	}

	private int id;
	private String nom_produit;
	private int quantitee;
	
	public Produit(int id, String nom_produit, int quantitee) {
		this.id = id;
		this.nom_produit = nom_produit;
		this.quantitee = quantitee;
		
	}
	
}



	
	
	
	
	
	


public class Exercice1 {
	
	public static void main(String[] main) {
		GerancePeoduit gerer_produit1 = new GerancePeoduit();
		gerer_produit1.insertion_donnes("pasta", 20);
		//gerer_produit1.afficher_donnes();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer le nom de produit ");
		String nomProd = scanner.nextLine();
		
		System.out.println("Entrer la qantitee de produit ");
		int quantite = scanner.nextInt();
		
		Produit product2 = new Produit(nomProd, quantite);

		
		gerer_produit1.insertion_donnes(nomProd, quantite);

		gerer_produit1.afficher_donnes();
		
		scanner.close();
		
			
		}
		

}
