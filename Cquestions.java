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

public class Cquestions {
    private String str="Programming languages";
    private String to="C";
    @FXML
    Button cpagebackbutton;
    @FXML
    private ToggleGroup tg1, tg2, tg3, tg4, tg5, tg6, tg7, tg8, tg9, tg10;
    @FXML
    private RadioButton q1r1, q1r2, q1r3,  q2r1, q2r2, q2r3,  q3r1, q3r2, q3r3, q4r1, q4r2, q4r3, q5r1, q5r2, q5r3,  q6r1, q6r2, q6r3,  q7r1, q7r2, q7r3,  q8r1, q8r2, q8r3,  q9r1, q9r2, q9r3,  q10r1, q10r2, q10r3;
    private  String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10;
    @FXML
    void cpageback(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Subsection.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) cpagebackbutton.getScene().getWindow();
        stage.setScene(scene2);
    }

    @FXML
    private Button Submit_button;
    int mark1 = 0, temp = 0;

    @FXML
    void handler_submit(ActionEvent event) throws IOException {
        Window owner = Submit_button.getScene().getWindow();
        if (q1r1.isSelected()) {
            str1=q1r1.getText();
            temp = 1;
            mark1++;
        } else if (q1r2.isSelected()) {
            str1=q1r2.getText();
            temp = 1;
        } else if (q1r3.isSelected()) {
            str1=q1r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-1");
            return;
        }
        temp = 0;
        if (q2r1.isSelected()) {
            str2=q2r1.getText();
            temp = 1;
        } else if (q2r2.isSelected()) {
            str2=q2r2.getText();
            temp = 1;
            mark1++;
        } else if (q2r3.isSelected()) {
            str2=q2r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-2");
            return;
        }
        temp = 0;
        if (q3r1.isSelected()) {
            str3=q3r1.getText();
            temp = 1;
        } else if (q3r2.isSelected()) {
            str3=q3r2.getText();
            temp = 1;
        } else if (q3r3.isSelected()) {
            str3=q3r3.getText();
            temp = 1;
            mark1++;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-3");
            return;
        }
        temp = 0;
        if (q4r1.isSelected()) {
            str4=q4r1.getText();
            temp = 1;
        } else if (q4r2.isSelected()) {
            str4=q4r2.getText();
            temp = 1;
            mark1++;
        } else if (q4r3.isSelected()) {
            str4=q4r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-4");
            return;
        }
        temp = 0;
        if (q5r1.isSelected()) {
            str5=q5r1.getText();
            temp = 1;
        } else if (q5r2.isSelected()) {
            str5=q5r2.getText();
            temp = 1;
        } else if (q5r3.isSelected()) {
            str5=q5r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-5");
            return;
        }
        temp = 0;
        if (q6r1.isSelected()) {
            str6=q6r1.getText();
            temp = 1;

        } else if (q6r2.isSelected()) {
            str6=q6r2.getText();
            temp = 1;
        } else if (q6r3.isSelected()) {
            str6=q6r3.getText();
            temp = 1;
            mark1++;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-6");
            return;
        }
        temp = 0;
        if (q7r1.isSelected()) {
            str7=q7r1.getText();
            temp = 1;
        } else if (q7r2.isSelected()) {
            str7=q7r2.getText();
            temp = 1;
        } else if (q7r3.isSelected()) {
            str7=q7r3.getText();
            temp = 1;
            mark1++;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-7");
            return;
        }
        temp = 0;
        if (q8r1.isSelected()) {
            str8=q8r1.getText();
            temp = 1;
            mark1++;
        } else if (q8r2.isSelected()) {
            str8=q8r2.getText();
            temp = 1;
        } else if (q8r3.isSelected()) {
            str8=q8r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-8");
            return;
        }
        temp = 0;
        if (q9r1.isSelected()) {
            str9=q9r1.getText();
            temp = 1;
        } else if (q9r2.isSelected()) {
            str9=q9r2.getText();
            temp = 1;
            mark1++;
        } else if (q9r3.isSelected()) {
            str9=q9r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-9");
            return;
        }
        temp = 0;
        if (q10r1.isSelected()) {
            str10=q10r1.getText();
            temp = 1;
        } else if (q10r2.isSelected()) {
            str10=q10r2.getText();
            temp = 1;
        } else if (q10r3.isSelected()) {
            str10=q10r3.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-10");
            return;
        }

        if (temp == 1) {
            Connection con=null;
            String inserttable="INSERT INTO onlinequiz.canswers"+"(topic,topic2,answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,mark) VALUES"+"(?,?,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?)";

            try {

                String databaseName="onlinequiz";
                String databaseUser="root";
                String databasePassword="";
                String url="jdbc:mysql://localhost/"+databaseName;

                Class.forName("com.mysql.cj.jdbc.Driver");

                //Connection con= DriverManager.getConnection(url,databaseUser,databasePassword);
                con=(Connection) DriverManager.getConnection(url,databaseUser,databasePassword);
                // databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);

                Statement statement = (Statement)con.createStatement();
                // ResultSet queryResult = statement.executeQuery(verifyLogin);

                //statement.executeUpdate("INSERT INTO onlinequiz.canswers (answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,Mark) VALUES ('"+str1+"','"+str2+"','"+str3+"','"+str4+"','"+str5+"','"+str6+"','"+str7+"','"+str8+"','"+str9+"','"+str10+"','"+mark+"');");
                PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(inserttable);
                //preparedStmt.setInt(1,rn);
                //rn++;
                preparedStmt.setString(1,str);
                preparedStmt.setString(2,to);
                preparedStmt.setString(3,(str1));
                preparedStmt.setString(4,(str2));
                preparedStmt.setString(5,(str3));
                preparedStmt.setString(6,(str4));
                preparedStmt.setString(7,(str5));
                preparedStmt.setString(8,(str6));
                preparedStmt.setString(9,(str7));
                preparedStmt.setString(10,(str8));
                preparedStmt.setString(11,(str9));
                preparedStmt.setString(12,(str10));
                preparedStmt.setInt(13, Integer.parseInt(String.valueOf((mark1))));
                preparedStmt.executeUpdate();
                con.close();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("resultofc.fxml"));
                Parent root = loader.load();
                Scene scene2 = new Scene(root);
                Stage stage = (Stage) Submit_button.getScene().getWindow();
                stage.setScene(scene2);
            }
            catch (Exception e) {
                System.err.println("Got an exception!");
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
}
