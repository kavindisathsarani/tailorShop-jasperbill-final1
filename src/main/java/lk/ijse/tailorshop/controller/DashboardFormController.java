package lk.ijse.tailorshop.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.tailorshop.db.DbConnection;
import lk.ijse.tailorshop.repository.DashboardRepo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DashboardFormController {
    @FXML
    private Label lblCustomerCount;

    @FXML
    private Label lblGarmentCount;

    @FXML
    private AnchorPane rootNode;

    private int customerCount;

    private int garmentCount;


    public void initialize() {
        try {
            customerCount = DashboardRepo.getCustomerCount();
            garmentCount=DashboardRepo.getGarmentCount();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        setCustomerCount(customerCount);
        setGarmentCount(garmentCount);
    }

    private void setGarmentCount(int garmentCount) {
        lblGarmentCount.setText(String.valueOf(garmentCount));

    }


    private void setCustomerCount(int customerCount) {
        lblCustomerCount.setText(String.valueOf(customerCount));

    }



    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/customer_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Customer Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnEmployeeOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/employee_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Employee Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Login Form");
    }

    @FXML
    void btnGarmentOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/garment_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Garment Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnMaterialOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/material_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Material Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnMeasurementOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/measurement_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Measurement Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnOrderOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/order_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Order Form");
        stage.centerOnScreen();
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/dashboard_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Dashboard Form");
        stage.centerOnScreen();
    }

}
