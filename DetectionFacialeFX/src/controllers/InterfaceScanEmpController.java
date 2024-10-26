package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;

import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.VBox;

public class InterfaceScanEmpController implements Initializable{
	@FXML
	private AnchorPane contentPane;
	@FXML
	private TextField txt_nom;
	@FXML
	private TextField txt_prenom;
	@FXML
	private VBox vbox;
	@FXML
	private TextField txt_deparetement;
	@FXML
	private TextField txt_fonction;
	@FXML
	private ImageView btn_return;

	   private void loadFXML(String fxmlFileName) {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
	            Parent root = loader.load();
	            contentPane.getChildren().setAll(root); // Remplacez le contenu actuel par la nouvelle vue chargée
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    //retourn à l'autre page
	    @FXML
	    void back() {
	        loadFXML("/interfaces/Main.fxml");

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
}
