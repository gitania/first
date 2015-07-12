import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;        
 
public class Cube4h {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Cube4h");
        frame.setMinimumSize(new Dimension(800, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "***" label.
        JLabel label = new JLabel("****", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.red);
        label.setPreferredSize(new Dimension(400, 400));
        frame.getContentPane().add(label);
        //new comment
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
