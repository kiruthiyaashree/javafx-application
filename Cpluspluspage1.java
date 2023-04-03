package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Cpluspluspage1 {
    private String str="Programming languages";
    private String top="C++";
    @FXML
    Button cpluspluspage2button;
    private String str1,str2,str3,str4,str5;
    @FXML
    private ToggleGroup tg1,tg2,tg3,tg4,tg5;
    @FXML
    private RadioButton q1r1,q1r2,q1r3,q1r4,q2r1,q2r2,q2r3,q2r4,q3r1,q3r2,q3r3,q3r4,q4r1,q4r2,q4r3,q4r4,q5r1,q5r2,q5r3,q5r4;
    private   int mark=0,temp=0;
    @FXML
    void cpluspluspage2(ActionEvent event) throws IOException {
        Window owner=cpluspluspage2button.getScene().getWindow();
        if(q1r1.isSelected()){
            str1=q1r1.getText();
            temp=1;
            mark++;
        }
        else if (q1r2.isSelected())
        {
            str1=q1r2.getText();
            temp=1;
        }
        else if (q1r3.isSelected())
        {
            str1=q1r3.getText();
            temp=1;
        }
        else if (q1r4.isSelected())
        {
            str1=q1r4.getText();
            temp=1;
        }
        if (temp==0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-1");
            return;
        }
        temp=0;
        if (q2r1.isSelected())
        {
            str2=q2r1.getText();
            temp=1;
        }
        else if (q2r2.isSelected())
        {
            str2=q2r2.getText();
            temp=1;
            mark++;
        }
        else if (q2r3.isSelected())
        {
            str2=q2r3.getText();
            temp=1;
        }
        else  if(q2r4.isSelected())
        {
            str2=q2r4.getText();
            temp=1;
        }
        if (temp==0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-2");
            return;
        }
        temp=0;
        if (q3r1.isSelected())
        {
            str3=q3r1.getText();
            temp=1;
        }
        else if (q3r2.isSelected())
        {
            str3=q3r2.getText();
            temp=1;
        }
        else if (q3r3.isSelected())
        {
            str3=q3r3.getText();
            temp=1;
            mark++;
        }
        else  if(q3r4.isSelected())
        {
            str3=q3r4.getText();
            temp=1;
        }
        if (temp==0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-3");
            return;
        }
        temp=0;
        if (q4r1.isSelected())
        {
            str4=q4r1.getText();
            temp=1;
        }
        else if (q4r2.isSelected())
        {
            str4=q4r2.getText();
            temp=1;
            mark++;
        }
        else if (q4r3.isSelected())
        {
            str4=q4r3.getText();
            temp=1;
        }
        else  if(q4r4.isSelected())
        { str4=q4r4.getText();
            temp=1;
        }
        if (temp==0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-4");
            return;
        }
        temp=0;
        if (q5r1.isSelected())
        {
            str5=q5r1.getText();
            temp=1;
            mark++;
        }
        else if (q5r2.isSelected())
        {
            str5=q5r2.getText();
            temp=1;
        }
        else if (q5r3.isSelected())
        {
            str5=q5r3.getText();
            temp=1;
        }
        else  if(q5r4.isSelected())
        { str5=q5r4.getText();
            temp=1;
        }
        if (temp==0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-5");
            return;
        }
        if(temp ==1)
        {

            Connection connection=null;
            String insertte="INSERT INTO onlinequiz.cppanswer1"+"(topic,topic2,answer1,answer2,answer3,answer4,answer5,markcpp) VALUES"+"(?,?,?,?,?,?,?,?)";
            try {
                String databaseName="onlinequiz";
                String databaseUser="root";
                String databasePassword="";
                String url="jdbc:mysql://localhost/"+databaseName;
                Class.forName("com.mysql.cj.jdbc.Driver");

                //Connection con= DriverManager.getConnection(url,databaseUser,databasePassword);
                connection=(Connection) DriverManager.getConnection(url,databaseUser,databasePassword);
                // databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);

                Statement statement = (Statement)connection.createStatement();
                // ResultSet queryResult = statement.executeQuery(verifyLogin);

                //statement.executeUpdate("INSERT INTO onlinequiz.canswers (answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,Mark) VALUES ('"+str1+"','"+str2+"','"+str3+"','"+str4+"','"+str5+"','"+str6+"','"+str7+"','"+str8+"','"+str9+"','"+str10+"','"+mark+"');");
                PreparedStatement preparedStmt = (PreparedStatement) connection.prepareStatement(insertte);
                preparedStmt.setString(1,str);
                preparedStmt.setString(2,top);
                preparedStmt.setString(3,str1);
                preparedStmt.setString(4,(str2));
                preparedStmt.setString(5,(str3));
                preparedStmt.setString(6,(str4));
                preparedStmt.setString(7,(str5));
                preparedStmt.setInt(8,Integer.parseInt(String.valueOf((mark))));
                preparedStmt.executeUpdate();
                connection.close();
                //preparedStmt.setInt(1,rn);
                //rn++;
                FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Cpluspluspage2.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        Stage stage = (Stage) cpluspluspage2button.getScene().getWindow();
        stage.setScene(scene2);
            }
            catch (Exception e)
            {System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
    }

    }

    private void showAlert(Alert.AlertType error, Window owner, String s, String s1) {

            Alert alert = new Alert(error);
            alert.setTitle(s);
            alert.setHeaderText(null);
            alert.setContentText(s1);
            alert.initOwner(owner);
            alert.show();
    }

    @FXML
    Button sspbackbutton;
    @FXML
    void ssphandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Subsection.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) sspbackbutton.getScene().getWindow();
        stage.setScene(scene2);
    }
}
