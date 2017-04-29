/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AdvanGUI {
    public static void main(String args[])
    {
        //creates a new JFrame from the myjframe class
        MyJFrame newFrame = new MyJFrame();
        //sets the frame to be visible
        newFrame.setVisible(true);


    }
}

//this is a jFrame class the extends the JFrame class and implements the Action 
//Listener
class MyJFrame extends JFrame implements ActionListener
{
    //creates a question display
    JLabel question = new JLabel("What is your name?");
    //creates a text field to accept an answer
    JTextField answer = new JTextField(15);
    //creates a button
    JButton clickMe = new JButton("Click Here");
    //create an empty label that will output the users choice
    JLabel output = new JLabel("");
    
    public MyJFrame(){
        super("Hello");
        //sets the size to 300 x 200
        setSize(300,200);
        //sets the layout
        setLayout(new FlowLayout());
        //these following lines add the question, answer, button and output 
        //components to the JFrame
        add(question);
        add(answer);
        add(clickMe);
        add(output);
        //sets the program to close when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //makes the button an action listener
        clickMe.addActionListener(this);
    }
    //this is the action performed method that will override and perform the action
    @Override
    public void actionPerformed(ActionEvent a){
        //creates a string get the answer
        String name = answer.getText();
        //makes a greeting with the string
        String greeting = "Hello " + name;
        //displays the output to the user 
        output.setText(greeting);
    }
}



