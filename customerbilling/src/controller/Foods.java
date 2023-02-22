package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Foods {
    public AnchorPane root;
    public Label lblWelcome;
    public TextField txtcChocalte;
    public TextField txtCake;
    public TextField txtBiscuit;
    public TextField txtYoghurt;
    public TextField txtIceCream;
    public Label lblTotal;
    int total=0;

    public void initialize(){
        lblWelcome.setText("Have a nice day "+ BillingStstem.name);

    }


    public void btnPrintOnAction(ActionEvent actionEvent) {

        String chocalate= txtcChocalte.getText();
        String cake = txtCake.getText();
        String biscuit = txtBiscuit.getText();
        String youghurt = txtYoghurt.getText();
        String icecream=txtIceCream.getText();

        if(!chocalate.isEmpty()){
            int intchocalate=Integer.parseInt(chocalate);
            total+=(intchocalate*50);
        }
        if(!cake.isEmpty()){
            int intcake=Integer.parseInt(cake);
            total+=(intcake*200);
        }
        if(!biscuit.isEmpty()){
            int intbiscuit=Integer.parseInt(biscuit);
            total+=(intbiscuit*100);
        }
        if(!youghurt.isEmpty()){
            int intyoghurt=Integer.parseInt(youghurt);
            total+=(intyoghurt*40);
        }
        if(!icecream.isEmpty()){
            int inticecream=Integer.parseInt(icecream);
            total+=(inticecream*150);
        }

        lblTotal.setText("Total: "+total);
    }
}
