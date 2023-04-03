package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Resultofc {
     int mark_c;
    @FXML
     Label display_label1;
    @FXML
    private Button backhandler,display_button2;
    /* @FXML
     private AnchorPane page1Anchor;*/
    @FXML
    void backofanaction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Subsection.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) backhandler.getScene().getWindow();
        stage.setScene(scene2);
    }
    @FXML

    void display_action2(ActionEvent event) throws IOException {
        String databaseName="onlinequiz";
        String databaseUser="root";
        String databasePassword="";
        String url="jdbc:mysql://localhost/"+databaseName;
        ResultSet is1=null;
        String me;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
//            throw new RuntimeException(e);
        }
        Connection connection=null;
        try{
            connection=(Connection) DriverManager.getConnection(url,databaseUser,databasePassword);
            Statement smte = (Statement)connection.createStatement();
            is1=smte.executeQuery("select * FROM canswers where mark");
            while(is1.next())
            {
                me=is1.getString(14);
                mark_c=Integer.parseInt(me);
                display_label1.setText(String.valueOf("C SCORE: "+mark_c+" out of 10"));
            }
            is1.close();
//            smt.close();
            // Mark= "SELECT Mark FROM javaanswers";

        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());

        }
    }
}
