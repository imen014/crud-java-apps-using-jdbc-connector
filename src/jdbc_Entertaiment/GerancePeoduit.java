package jdbc_Entertaiment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GerancePeoduit {
	String nom_produit;
	int id, quantitee;
	PreparedStatement preparedStatement;
	Produit product;
	
	
	void insertion_donnes(produit.nom_produit, produit.quantitee ) {
		
		try {
			//connection à la bd
			ConnectionClass connect = new ConnectionClass();
			connect.openConnection();
			
			//instanciation produit
			Produit product1 = new Produit(0,"myproduct",10);
			
			//inserer des données
			String monrequete = "INSERT INTO products(id,nom_produit,quantitee)VALUES(?,?,?)";
			PreparedStatement preparedStatement = connect.connection.prepareStatement(monrequete);
			
			//definieser les valeurs de paramétres dans le requete
			preparedStatement.setInt(1, product1.getId());
			preparedStatement.setString(2, product1.getNom_produit());
			preparedStatement.setInt(3, product1.getQuantitee());

			
			//executer la requete d'insertion
			preparedStatement.executeUpdate();
			
			//message de reussite
			System.out.println("insertion de données avec succées !");
			
			//fermer la preparedStatement
			preparedStatement.close();
			
			
		}catch(SQLException e) {
			System.out.println("code interrompu ! " + e.getMessage());
		}
		
	}
	
	void afficher_donnes() {
		
		try {
			ConnectionClass connect = new ConnectionClass();
			connect.openConnection();
			 String monrequete = "SELECT * FROM products";
			 Statement statement = connect.connection.createStatement();
			 ResultSet resultSet = statement.executeQuery(monrequete);
			 
			 while(resultSet.next()) {
				 int id = resultSet.getInt("id");
				 String nom_produit = resultSet.getString("nom_produit");
				 int quantitee = resultSet.getInt("quantitee");
				 
				 System.out.println("id:" + id + " nom_produit:" + nom_produit + " quanitee:" + quantitee);
			 }
			
		}catch(SQLException e) {
			System.out.println("erreur x : " + e.getMessage());
		}
		
		
	}
	

}
