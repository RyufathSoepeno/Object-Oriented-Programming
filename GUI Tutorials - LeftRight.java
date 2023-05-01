//********************************************************************
// LeftRight.java Java Foundations
//
// Demonstrates the use of one listener for multiple buttons.
//********************************************************************
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LeftRight {
    //-----------------------------------------------------------------
// Creates and displays the main program frame.
//-----------------------------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Left Right");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var classInstance = new LeftRight();
        frame.getContentPane().add(new LeftRightPanel());
        frame.pack();
        frame.setVisible(true);
    }
}