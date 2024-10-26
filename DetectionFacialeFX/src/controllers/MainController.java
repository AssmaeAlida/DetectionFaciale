package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
	    @FXML
	    private ImageView Vbox;

	    @FXML
	    private Button btn_Client;

	    @FXML
	    private Button btn_Seconnecter;

	    @FXML
	    private VBox vbox;

        @FXML
         private AnchorPane contentPane; // L'AnchorPane (ou le conteneur approprié) où vous souhaitez afficher les vues

        // rediger pour connecter organisateur
    
       @FXML
      private void openSignIn(ActionEvent event) {
        loadFXML("/interfaces/SignIn.fxml");
      }
    
    //pour rediger vers l'inetrface client
    @FXML
    void DetectionFaceClient() {
        loadFXML("/interfaces/InterfaceScanEmp.fxml");
    }
  
    private void loadFXML(String fxmlFileName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent root = loader.load();
            contentPane.getChildren().setAll(root); // Remplacez le contenu actuel par la nouvelle vue chargée
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }
}
