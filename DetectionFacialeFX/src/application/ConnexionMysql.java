package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMysql {
	
	 public static Connection connexionDB() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/detectonfacial", "root", "");
	            System.out.println("Connexion réussie");
	            return cn;
	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("Connexion échouée : " + e.getMessage()); // Afficher le message d'erreur spécifique
	            e.printStackTrace();
	            return null;
	        }
	    }

}
