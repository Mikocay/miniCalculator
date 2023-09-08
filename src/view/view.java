
package view;

import controller.controller;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.model;

public class view extends JFrame{
    model model;
    JFrame frame;
    JLabel label1, label2, label3;
    JTextField textfield1, textfield2, answer;
    JPanel panel;
    JButton[] functionButton =new JButton[6];
    JButton sumBut, muniBut, mulBut, divBut, powBut, modBut;
    
    Font myFont =new Font("Time New Roman", Font.CENTER_BASELINE, 30);
    
    public view()  {
        model = new model();
        frame = new JFrame("Mini Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setFont(myFont);
        frame.setLayout(null);
        
        label1 =new JLabel("First Value");
        label1.setBounds(50, 25, 100, 50);
       
        label2 =new JLabel("Second Value");
        label2.setBounds(50, 75, 100, 50);
     
        label3 =new JLabel("Answer");
        label3.setBounds(50, 125, 100, 50);
  
        textfield1 =new JTextField();
        textfield1.setBounds(150, 25, 300, 50);
        textfield1.setFont(myFont);
        textfield1.setEditable(true);
        
        textfield2 =new JTextField();
        textfield2.setBounds(150, 75, 300, 50);
        textfield2.setFont(myFont);
        textfield2.setEditable(true);
        
        answer =new JTextField();
        answer.setBounds(150, 125, 300, 50);
        answer.setFont(myFont);
        answer.setEditable(true);
        
        sumBut = new JButton("+");
        muniBut = new JButton("-");
        mulBut = new JButton("*");
        divBut = new JButton("/");
        powBut = new JButton("^");
        modBut = new JButton("MOD");
        
        panel = new JPanel();
        panel.setFont(myFont);
        panel.setBounds(90, 250, 300, 150);
        panel.setLayout(new GridLayout(2, 3, 15, 15));
        
        controller listener = new controller(this);
        
        functionButton[0] = sumBut;
        functionButton[1] = muniBut;
        functionButton[2] = mulBut;
        functionButton[3] = divBut;
        functionButton[4] = powBut;
        functionButton[5] = modBut;
        
        for(int i=0;i<6;i++) {
            functionButton[i].addActionListener(listener);
            functionButton[i].setFont(myFont);
        }
        
        panel.add(sumBut);
        panel.add(muniBut);
        panel.add(mulBut);
        panel.add(divBut);
        panel.add(powBut);
        panel.add(modBut);
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(panel);
        frame.add(textfield1);
        frame.add(textfield2);
        frame.add(answer);
        frame.setVisible(true);
    }
    public void sum() {
        double firstValue = Double.valueOf(textfield1.getText());
        double secondValue = Double.valueOf(textfield2.getText());
        this.model.setFirstValue(firstValue);
        this.model.setSecondValue(secondValue);
        this.model.sum();
        this.answer.setText(this.model.getAnwser()+"");
    }
    public void muni() {
        double firstValue =Double.valueOf(textfield1.getText());
        double secondValue =Double.valueOf(textfield2.getText());
        this.model.setFirstValue(firstValue);
        this.model.setSecondValue(secondValue);
        this.model.muni();
        this.answer.setText(this.model.getAnwser()+"");
    }
    public void mul() {
        double firstValue =Double.valueOf(textfield1.getText());
        double secondValue =Double.valueOf(textfield2.getText());
        this.model.setFirstValue(firstValue);
        this.model.setSecondValue(secondValue);
        this.model.mul();
        this.answer.setText(this.model.getAnwser()+"");
    }
    public void div() {
        double firstValue =Double.valueOf(textfield1.getText());
        double secondValue =Double.valueOf(textfield2.getText());
        this.model.setFirstValue(firstValue);
        this.model.setSecondValue(secondValue);
        this.model.div();
        this.answer.setText(this.model.getAnwser()+"");
    }
    public void pow() {
        double firstValue =Double.valueOf(textfield1.getText());
        double secondValue =Double.valueOf(textfield2.getText());
        this.model.setFirstValue(firstValue);
        this.model.setSecondValue(secondValue);
        this.model.pow();
        this.answer.setText(this.model.getAnwser()+"");
    }
    public void mod() {
        double firstValue =Double.valueOf(textfield1.getText());
        double secondValue =Double.valueOf(textfield2.getText());
        this.model.setFirstValue(firstValue);
        this.model.setSecondValue(secondValue);
        this.model.mod();
        this.answer.setText(this.model.getAnwser()+"");
    }
    
}
