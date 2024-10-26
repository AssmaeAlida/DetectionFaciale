package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.ConnexionMysql;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SignInController implements Initializable {
    
    Connection cnx;
    public PreparedStatement st;
    public ResultSet result;

    @FXML
    private Button btn_passwordForgoten;

    @FXML
    private ImageView btn_return;
    
    @FXML
    private Button btn_seconnecter;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_userName;

    @FXML
    private Button btn_inscription;
    
    @FXML
    private VBox vbox;

    private Parent fxml;
    @FXML
    private AnchorPane contentPane;
    
  /*  private String hashPassword(String password) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte aByte : bytes) {
                sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
*/
    @FXML 
    void openHome() {
        String username = txt_userName.getText();
        String password = txt_password.getText();
        String query = "SELECT * FROM admin WHERE login = ? AND password = ?";

        try {
            st = cnx.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            result = st.executeQuery();

            if (result.next()) {
                // Authentication successful for the provided username and password
                Stage currentStage = (Stage) btn_seconnecter.getScene().getWindow();
                currentStage.close();

                Stage home = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaces/DashoboardAdmin.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                // Rend la scène transparente
                scene.setFill(Color.TRANSPARENT);

                // Applique un style sans bordure
                home.initStyle(StageStyle.UNDECORATED);

                home.setScene(scene);
                home.show();
            } else {
                // Authentication failed: Incorrect username or password
                Alert alert = new Alert(AlertType.ERROR, "Nom d'utilisateur ou mot de passe incorrect", ButtonType.OK);
                alert.show();
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFXML(String fxmlFileName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent root = loader.load();
            
            Stage stage = new Stage(); // Crée une nouvelle fenêtre
            stage.initStyle(StageStyle.UNDECORATED); // Fenêtre sans décoration

            stage.setScene(new Scene(root));
            stage.show(); // Affiche la nouvelle fenêtre avec le contenu du fichier FXML
            
            // Ferme la fenêtre actuelle si nécessaire
            Stage currentStage = (Stage) btn_seconnecter.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //return à la page d'acceuil
    
    @FXML
    void Back() {
        loadFXML("/interfaces/Main.fxml");

    }
    // mot de passse oublié?
    @FXML
    void sendPassword() {
        // Logic for sending passwords if needed
    }
   // redigirer vers la page signUp
    @FXML
    void openSignUP() {
        loadFXML("/interfaces/SignUP.fxml");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Establish database connection
        cnx = ConnexionMysql.connexionDB();
    }
}
