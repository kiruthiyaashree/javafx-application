package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Registration {
    @FXML
    Button loginhandler;
    @FXML
    private TextField l_firstname,l_lastname;
    @FXML
    private TextField tf_emailid;
    @FXML
    private PasswordField pf_password;

    @FXML
    void loginhandleraction(ActionEvent event) throws IOException {

        try {

            String databaseName="onlinequiz";
            String databaseUser="root";
            String databasePassword="";
            String url="jdbc:mysql://localhost/"+databaseName;

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(url,databaseUser,databasePassword);
            // databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);

            Statement statement = con.createStatement();
            // ResultSet queryResult = statement.executeQuery(verifyLogin);

            String verifyLogin ="INSERT INTO onlinequiz.details (firstname,lastname,username,password) VALUES ('"+l_firstname.getText()+"','"+l_lastname.getText()+"','"+tf_emailid.getText()+"','"+pf_password.getText()+"');";


            statement.executeUpdate(verifyLogin);
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            //PaintRenderJob button;
            Stage stage = (Stage) loginhandler.getScene().getWindow();
            stage.setScene(scene2);
        }
        catch(Exception e)
        {

            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid Username!");
            alert.show();

        }



    }
}
