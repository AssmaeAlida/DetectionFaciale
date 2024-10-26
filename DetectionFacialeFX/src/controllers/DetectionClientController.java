package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class DetectionClientController implements Initializable{
    @FXML
    private ImageView btn_return;

    @FXML
    private Button btn_valider;

    @FXML
    private AnchorPane contentPane;

    @FXML
    private TextField txt_NumTelephon;

    @FXML
    private TextField txt_deparetement;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_fonction;

    @FXML
    private TextField txt_nom;

    @FXML
    private TextField txt_prenom;

    @FXML
    private VBox vbox;
     
    
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
        loadFXML("/interfaces/DashoboardAdmin.fxml");

    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		   Canvas canvas = new Canvas(640, 480); // Création d'un Canvas pour afficher la sortie de la caméra
	        vbox.getChildren().add(canvas); // Ajout du Canvas à votre VBox
	}

}
