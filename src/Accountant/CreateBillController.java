/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Accountant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CreateBillController implements Initializable {

    @FXML
    private ComboBox<?> buyerIdComboBox;
    @FXML
    private ComboBox<?> productNameComboBox;
    @FXML
    private ComboBox<Integer> quantityComboBox;
    @FXML
    private TextField priceTextFile;
    @FXML
    private DatePicker todayDateDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void totalBillButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void addButtonMouseOnClick(ActionEvent event) {
    }
    
}
