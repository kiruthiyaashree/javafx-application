package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class Section {
    @FXML
    private Button PLACTION;
    //String str=PLACTION.getText();
    @FXML
    void PLHANDLER(ActionEvent event) throws IOException {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Subsection.fxml"));
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            //PaintRenderJob button;
            Stage stage = (Stage) PLACTION.getScene().getWindow();
            stage.setScene(scene2);

//        }
//        catch(Exception e)
//        {
//            Alert alert=new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Invalid !");
//            alert.show();
//
//        }
//        } catch (SQLException e) {
//            System.err.println("Got an exception!");
//            System.err.println(e.getMessage());
//
//        }


    }
}
