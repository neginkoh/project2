/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyhigh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Negin
 */
public class LoginController
{

    @FXML
    private Label lblMessage;
    @FXML
    private javafx.scene.control.TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button button;
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception
    {
        if (txtUserName.getText().equals("admin") && txtPassword.getText().equals("admin")) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("AdminDashboard Frame");
            stage.show();

        } else if (txtUserName.getText().equals("doctor") && txtPassword.getText().equals("doctor")) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("AdminDashboard Frame");
            stage.show();

        }
        if (txtUserName.getText().equals("nurse") && txtPassword.getText().equals("nurse")) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("AdminDashboard Frame");
            stage.show();

        } else {
            lblMessage.setText("Username or password invalid!");
        }

    }
}
