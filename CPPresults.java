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

public class CPPresults {
    @FXML
    private Label label_res;
    private int mcpp,cpp1,cpp2;
    @FXML
    private Button button_display,back_button;
    @FXML
    void actiondisplay(ActionEvent event)throws IOException{

        //code to be written
        String databaseName="onlinequiz";
        String databaseUser="root";
        String databasePassword="";
        String url="jdbc:mysql://localhost/"+databaseName;
        ResultSet resultSet=null,resultSet1=null;
        String se,se1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection=null;
        try{
            connection=(Connection) DriverManager.getConnection(url,databaseUser,databasePassword);
            Statement statement=connection.createStatement();
            Statement statement1=connection.createStatement();
            resultSet=statement.executeQuery("select * FROM cppanswer1 where markcpp");
            resultSet1=statement1.executeQuery("select * FROM cppanswer2 where score");
            while(resultSet.next() && resultSet1.next() )
            {
                se=resultSet.getString(9);
                cpp1=Integer.parseInt(se);
                se1=resultSet1.getString(7);
                cpp2=Integer.parseInt(se1);
                mcpp=cpp1+cpp2;
                label_res.setText("C++ SCORE : "+mcpp+"out of 10");
            }


            resultSet.close();
            resultSet1.close();

        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }
    @FXML
    void actionback(ActionEvent event)throws IOException{

        //code to be written
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Subsection.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage)back_button.getScene().getWindow();
        stage.setScene(scene2);
    }
}
