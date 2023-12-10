/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sgbdprojet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author molka
 */
public class FXMLDocumentController implements Initializable {
    
      
    
    @FXML
    private Button baseDeConnaissance;

    @FXML
    private Button groupes;

    @FXML
    private Button techniciens;

    @FXML
    private Button tickets;

    @FXML
    private Button utilisateur;
    
    private Stage stage ;
     private Scene scene;
     private Parent root;
      @FXML
    private Button sedeconnecter;
    @FXML
    private Button helpdesk;
    @FXML
    void openhelpdesk(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    @FXML
            
    void Opensedeconnecter(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void OpenBaseDeConnaissance(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/views/BaseDeConnaissance.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OpenGroupes(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("livraison.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
    @FXML
    void OpenTechniciens(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("commande.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void OpenTickets(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/views/TicketAdmin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void OpenUtilisateur(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("article.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
// Parent root = FXMLLoader.load(getClass().getResource("article.fxml"));
//        
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();

    }

      @FXML
    private void openNewInterface(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../views/AdminUser.fxml"));
            Parent root = fxmlLoader.load();
            
            Stage stage = new Stage();
          
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception appropriately
        }
    }
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}