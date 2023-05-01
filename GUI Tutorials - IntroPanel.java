//********************************************************************
// IntroPanel.java Java Foundations
//
// Represents the introduction panel for the LayoutDemo program.
//********************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
public class IntroPanel extends JPanel
{
    //-----------------------------------------------------------------
// Sets up this panel with two labels.
//-----------------------------------------------------------------
    public IntroPanel()
    {
        setBackground (Color.green);
        JLabel l1 = new JLabel ("Layout Manager Demonstration");
        JLabel l2 = new JLabel ("Choose a tab to see an example of " +
                "a layout manager.");
        add (l1);
        add (l2);
    }
}
//********************************************************************
// FlowPanel.java Java Foundations
//
// Represents the panel in the LayoutDemo program that demonstrates
// the flow layout manager.
//********************************************************************

class FlowPanel extends JPanel
{
    //-----------------------------------------------------------------
// Sets up this panel with some buttons to show how flow layout
// affects their position.
//-----------------------------------------------------------------
    public FlowPanel ()
    {
        setLayout (new FlowLayout());
        setBackground (Color.green);
        JButton b1 = new JButton ("BUTTON 1");
        JButton b2 = new JButton ("BUTTON 2");
        JButton b3 = new JButton ("BUTTON 3");
        JButton b4 = new JButton ("BUTTON 4");
        JButton b5 = new JButton ("BUTTON 5");
        add (b1);
        add (b2);
        add (b3);
        add (b4);
        add (b5);
    }
}


class BorderPanel extends JPanel
{
    //-----------------------------------------------------------------
// Sets up this panel with a button in each area of a border
// layout to show how it affects their position, shape, and size.
//-----------------------------------------------------------------
    public BorderPanel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.green);
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");
        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.NORTH);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.WEST);
    }
}

class GridPanel extends JPanel
{
    //-----------------------------------------------------------------
// Sets up this panel with some buttons to show how grid
// layout affects their position, shape, and size.
//-----------------------------------------------------------------
    public GridPanel()
    {
        setLayout(new GridLayout(2, 3));
        setBackground(Color.green);
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}


class BoxPanel extends JPanel
{
    //-----------------------------------------------------------------
// Sets up this panel with some buttons to show how a vertical
// box layout (and invisible components) affects their position.
//-----------------------------------------------------------------
    public BoxPanel()
    {
        setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));
        setBackground(Color.green);
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");
        add(b1);
        add(Box.createRigidArea(new Dimension (0, 10)));
        add(b2);
        add(Box.createVerticalGlue());
        add(b3);
        add(b4);
        add(Box.createRigidArea(new Dimension (0, 20)));
        add(b5);
    }
}