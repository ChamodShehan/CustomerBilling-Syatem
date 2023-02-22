package controller;

import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillingStstem {
    public AnchorPane root;
    public TextField txtSirName;
    public TextField txtFirstName;
    public TextField txtAddress;
    public TextField txtPostCode;
    public TextField txtMobile;
    public TextField txtEmail;
    public TextField txtNationality;
    public TextField txtGender;
    public static String name;


    public void btnNtOnActon(ActionEvent actionEvent) throws IOException {

        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/foods.fxml"));
        Scene scene=new Scene(parent);

        Stage primaryStage = (Stage) root.getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Foods Details");
        primaryStage.centerOnScreen();


        name= txtFirstName.getText();

        register();

    }
        public void register(){

        String firstName = txtFirstName.getText();
        String sirName=txtSirName.getText();
        String address=txtAddress.getText();
        int postCode= Integer.parseInt(txtPostCode.getText());
        int mobile= Integer.parseInt(txtMobile.getText());
        String email=txtEmail.getText();
        String nationality=txtNationality.getText();
        String gender=txtGender.getText();

        Connection connection= DBConnection.getInstance().getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customer_details values (?,?,?,?,?,?,?,?)");
            preparedStatement.setObject(1,firstName);
            preparedStatement.setObject(2,sirName);
            preparedStatement.setObject(3,address);
            preparedStatement.setObject(4,postCode);
            preparedStatement.setObject(5,mobile);
            preparedStatement.setObject(6,email);
            preparedStatement.setObject(7,nationality);
            preparedStatement.setObject(8,gender);
            int i = preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
