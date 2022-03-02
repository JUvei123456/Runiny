/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entitie.User;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.UserCRUD;

/**
 * FXML Controller class
 *
 * @author ACER EXTENSA 15
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField tfNom;
    @FXML
    private TextField tfPrenom;
    @FXML
    private TextField tfAdress;
    @FXML
    private TextField tfDn;
    @FXML
    private TextField tfRole;
    @FXML
    private TextField tfEmail;
    @FXML
    private PasswordField tfPwd;
    @FXML
    private Button btnajouter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterUser(ActionEvent event) {
        String Nom = tfNom.getText();
        String Prenom = tfPrenom.getText();
        String Adress = tfAdress.getText();
        String Date_naiss=tfDn.getText();
        String Role = tfRole.getText();
        String Email = tfEmail.getText();
        String Password = tfPwd.getText();
        User u = new User(Nom,Prenom,Adress,Email,Password,Role,Date_naiss);
        UserCRUD ud = new UserCRUD();
        ud.ajouterUser2(u);
    }
    
}
