package jdbc_Entertaiment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*1. Connexion à une base de données :
   Écrivez un programme Java qui se connecte à une base de données à l'aide de JDBC.
    Assurez-vous que la connexion fonctionne correctement en affichant
 un message de réussite lorsque la connexion est établie.*/

public class ConnectionClass {
	Connection connection;

	
	String username="root";
	String password="root";
	String db_name="gerance1";
	
	public void openConnection() {
		try {
			//charger le pilote JDBC pour mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//etablir la connexion à la base de données
			connection = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name , username , password);
			
			if(connection != null) {
				System.out.println("connexion établie avec succés !");
			}
				
		}catch(ClassNotFoundException e) {
			System.out.println("Driver JDBC introuvable !" + e.getMessage());
			
		}catch(SQLException e) {
			System.out.println("erreur de connection à la base de données " + e.getMessage());
			
		}
	
}
	
	public void closeConnection() {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("connexion fermée avec succées !");
				
			}
			
		}catch(SQLException e) {
			System.out.println("erreur lors de dermeture de connection  " + e.getMessage());
			
		}
	}
	
	
}
