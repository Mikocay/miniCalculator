
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.model;
import view.view;

public class controller implements ActionListener{

    private view view;

    public controller(view view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")) {
            this.view.sum();
        }
        else if(button.equals("-")) {
            this.view.muni();
        }
        else if(button.equals("*")) {
            this.view.mul();
        }
        else if(button.equals("/")) {
            this.view.div();
        }
        else if(button.equals("^")) {
            this.view.pow();
        }
        else if(button.equals("%")) {
            this.view.mod();
        }
    }
    
}
