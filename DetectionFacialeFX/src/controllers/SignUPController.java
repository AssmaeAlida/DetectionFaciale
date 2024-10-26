package controllers;

import java.io.IOException;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ResourceBundle;

import application.ConnexionMysql;
import javafx.fxml.Initializable;

public class SignUPController  implements Initializable{

	 @FXML
	    private ImageView Vbox1;

	    @FXML
	    private Button btn_Inscrire;

	    @FXML
	    private ImageView btn_return;

	    @FXML
	    private TextField txt_email;

	    @FXML
	    private PasswordField txt_password;

	    @FXML
	    private TextField txt_userName;

	    @FXML
	    private VBox vbox1;
        
	    private void loadFXML(String fxmlFileName, Node node) {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
	            Parent root = loader.load();

	            // Créer une nouvelle fenêtre sans décoration
	            Stage stage = new Stage();
	            stage.initStyle(StageStyle.UNDECORATED);

	            // Créer une scène avec le contenu chargé depuis le fichier FXML
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();

	            // Fermer la fenêtre actuelle si nécessaire
	            Stage currentStage = (Stage) node.getScene().getWindow();
	            currentStage.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }


	    
	    @FXML
	    void Back() {
	        loadFXML("/interfaces/Main.fxml", btn_return);
	    }

	    @FXML
	    void openLogin(ActionEvent event) {
	    	String login = txt_userName.getText();
	        String email = txt_email.getText();
	        String password = txt_password.getText();

	        String sql = "INSERT INTO admin (login, email, password) VALUES (?, ?, ?)";
	        try (
	            Connection connection = ConnexionMysql.connexionDB();
	            PreparedStatement preparedStatement = connection.prepareStatement(sql)
	        ) {
	            preparedStatement.setString(1, login);
	            preparedStatement.setString(2, email);
	            preparedStatement.setString(3, password);

	            int rowsInserted = preparedStatement.executeUpdate();
	            
	            if (rowsInserted > 0) {
	                afficherAlerte(AlertType.INFORMATION, "Inscription réussie", "Vous êtes inscrit avec succès!");
	                naviguerVersSignIn(event);
	            } else {
	                afficherAlerte(AlertType.ERROR, "Erreur", "Échec de l'inscription. Veuillez réessayer.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
               System.out.println("error");
	        }
	    }
	    private void afficherAlerte(AlertType type, String titre, String message) {
	        Alert alert = new Alert(type);
	        alert.setTitle(titre);
	        alert.setHeaderText(null);
	        alert.setContentText(message);
	        alert.showAndWait();
	    }
	    private void naviguerVersSignIn(ActionEvent event) {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaces/SignIn.fxml"));
	            Parent root = loader.load();
	            Scene scene = new Scene(root);

	            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Gérer l'exception de chargement de la nouvelle interface
	        }
	    }
	
	  @Override
	  public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}


