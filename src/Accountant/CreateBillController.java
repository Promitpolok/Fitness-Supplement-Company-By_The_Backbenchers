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
                "100% Gold Standard Whey Protein",
                "On Micronizen Creatine",
                "Nitrotech Whey Gold",
                "Warrior Protein Ber",
                "ISO Xp",
                "Dymatize Iso",
                "Seriousmass",
                "Mass Tech Extreme 2000",
                "Mass Gainer",
                "Hyper Mass Gainer",
                "Xtend BCAA",
                "Amino Energy",
                "BPI Best BCAA",
                "BCAA Energy",
                "Lipo 6 Black Ultra Concentrate",
                "Cuts",
                "Evll Carnitine",
                "HydeoXYCut Hardcore Elite",
                "Gold Creatine",
                "Applied Nutrition",
                "Plantinum Creatine"
                
                );
        quantityComboBox.getItems().addAll(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
                
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
        priceTextFile.clear();
        if (productNameComboBox.getValue()==null || quantityComboBox.getValue()==null )
            priceTextFile.clear();
            priceTextFile.setText("Please Select Product"); 
        
        if (checkDuplicate( productNameComboBox.getValue())){
        
        }
        else{ 
            createBill tempOBJ = new createBill(productNameComboBox.getValue(), Float.perseFloat(priceTextFile.getText(),quantityComboBox.getValue() ));
        
        }
    }

    @FXML
    private void productComboBoxOnSelect(ActionEvent event) { 
        switch (productNameComboBox.getValue()){
            case "Nitrotech":
                priceTextFile.setText("5299");
                break;
            case "100% Gold Standard Whey Protein":
                priceTextFile.setText("5999");
                break;  
            case "On Micronizen Creatine":
                priceTextFile.setText("3199");
                break;                 
            case "Nitrotech Whey Gold":
                priceTextFile.setText("5399");
                break;                 
            case "Warrior Protein Ber":
                priceTextFile.setText("4599");
                break; 
            case "ISO Xp":
                priceTextFile.setText("5399");
                break; 
            case "Dymatize Iso":
                priceTextFile.setText("11999");
                break; 
            case "Seriousmass":
                priceTextFile.setText("7799");
                break; 
            case "Mass Tech Extreme 2000":
                priceTextFile.setText("7699");
                break; 
            case "Mass Gainer":
                priceTextFile.setText("6799");
                break; 
            case "Hyper Mass Gainer":
                priceTextFile.setText("6699");
                break;                 
            case "Xtend BCAA":
                priceTextFile.setText("3199");
                break;                 
            case "Amino Energy":
                priceTextFile.setText("3499");
                break;                 
            case "BPI Best BCAA":
                priceTextFile.setText("2699");
                break;                 
            case "BCAA Energy":
                priceTextFile.setText("2999");
                break;                 
             case "Lipo 6 Black Ultra Concentrate":
                priceTextFile.setText("2899");
                break;                
            case "Cuts":
                priceTextFile.setText("5499");
                break;                 
            case "Evll Carnitine":
                priceTextFile.setText("2799");
                break; 
            case "HydeoXYCut Hardcore Elite":
                priceTextFile.setText("2599");
                break; 
            case "Gold Creatine":
                priceTextFile.setText("2699");
                break; 
            case "Applied Nutrition":
                priceTextFile.setText("2999");
                break;                 
            case "Plantinum Creatine":
                priceTextFile.setText("3499");
                break;                 
        } 
        
    } 
    private boolean checkDuplicate (String productName){ 
        if (cartList.isEmpty()){
            return false;
        
        }
        for (createBill c : cartList){
            if(c.getProductName().equals(productName)){
                return true;
            
            }        
        }
        return false; 
    
    }
    
}
