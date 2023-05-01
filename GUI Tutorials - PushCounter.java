//********************************************************************
//  PushCounter.java       Java Foundations
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PushCounter
{
    //-----------------------------------------------------------------
    //  Creates and displays the main program frame.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PushCounterPanel panel = new PushCounterPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}

//********************************************************************
// PushCounterPanel.java Java Foundations
//
// Demonstrates a graphical user interface and an event listener.
//********************************************************************

class PushCounterPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;

    //-----------------------------------------------------------------
// Constructor: Sets up the GUI.
//-----------------------------------------------------------------
    public PushCounterPanel() {
        count = 0;
        push = new JButton("Push Me!");
        push.addActionListener(new ButtonListener());
        label = new JLabel("Pushes: " + count);
        add(push);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 40));
    }

    //*****************************************************************
// Represents a listener for button push (action) events.
//*****************************************************************
    private class ButtonListener implements ActionListener {
        //--------------------------------------------------------------
// Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
        public void actionPerformed(ActionEvent event) {
            count++;
            label.setText("Pushes: " + count);
        }
    }
}