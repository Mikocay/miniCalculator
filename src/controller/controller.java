
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.model;
import view.view;

public class controller implements ActionListener{

    private view view;
    private model model;

    public controller(view view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")) {
            this.model.sum();
        }
        else if(button.equals("-")) {
            this.model.muni();
        }
        else if(button.equals("*")) {
            this.model.mul();
        }
        else if(button.equals("/")) {
            this.model.div();
        }
        else if(button.equals("^")) {
            this.model.pow();
        }
        else if(button.equals("%")) {
            this.model.mod();
        }
    }
    
}
