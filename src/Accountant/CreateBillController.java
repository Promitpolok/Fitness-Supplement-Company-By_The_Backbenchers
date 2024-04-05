/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Accountant;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mainpkg.createBill;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CreateBillController implements Initializable {

    @FXML
    private ComboBox<String> buyerIdComboBox;
    @FXML
    private ComboBox<String> productNameComboBox;
    @FXML
    private ComboBox<Integer> quantityComboBox;
    @FXML
    private TextField priceTextFile;
    @FXML
    private DatePicker todayDateDatePicker;
    @FXML
    private TextArea showAllTextArea;
    
    private ArrayList <createBill> cartList;

    /**
     * Initializes the controller class.
     */
    @Override 
    public void initialize(URL url, ResourceBundle rb) { 
        cartList = new ArrayList<>(); 
        productNameComboBox.getItems().addAll(
               "Nitrotech",
                "100% Gold Standard Whey Protein"
                
                
                
                );
        

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

    @FXML
    private void productComboBoxOnSelect(ActionEvent event) {
    }
    
}
