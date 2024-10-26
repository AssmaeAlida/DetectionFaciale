package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DashoboardAdminController implements Initializable{
	  @FXML
	    private Pane btn_create;

	    @FXML
	    private ImageView btn_return;
	    @FXML
	    private Pane btn_liste;
	    @FXML
	    private AnchorPane contentPane;
	    
	    private void loadFXML(String fxmlFileName) {
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

	            // Ferme la fenêtre actuelle si nécessaire
	            Stage currentStage = (Stage) contentPane.getScene().getWindow();
	            currentStage.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    @FXML
	    void AfficherListe() {
	    	
	        loadFXML("/interfaces/InterfaceListeEmp.fxml");

	    }
	    @FXML
	    void AjouterEmploye() {
	        loadFXML("/interfaces/DetectionClient.fxml");

	    }

	    @FXML
	     void back() {
	        loadFXML("/interfaces/SignIn.fxml");

	    }
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
}
