import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        // Instantiate the MyFrame class
        MyFrame frame = new MyFrame();
    }


    public static class MyFrame extends JFrame implements ActionListener {


        // Declare the buttons and labels
        private JButton btnSetName, btnSetDate, btnSetPrice;
        private JLabel lblSetName, lblSetDate, lblSetPrice;


        // Create the MyFrame constructor
        MyFrame() {
            JFrame frame = new JFrame();

            // Set default parameters for the frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(3, 2));
            frame.setTitle("Theater Ticket");

            //Instantiate and give value to buttons and labels
            btnSetName = new JButton("Set Show Name");
            btnSetDate = new JButton("Set Date");
            btnSetPrice = new JButton("Set Price");

            lblSetName = new JLabel("Show Name: Bilgi", SwingConstants.CENTER);
            lblSetDate = new JLabel("Show Date: 21.10.2022", SwingConstants.CENTER);
            lblSetPrice = new JLabel("Show Price: 50.0", SwingConstants.CENTER);

            // Add the labels and buttons to the frame
            frame.add(lblSetName);
            frame.add(btnSetName);
            frame.add(lblSetDate);
            frame.add(btnSetDate);
            frame.add(lblSetPrice);
            frame.add(btnSetPrice);

            // Add action listener to buttons
            btnSetName.addActionListener(this);
            btnSetDate.addActionListener(this);
            btnSetPrice.addActionListener(this);

            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            /* Pops up an input dialog when you click the Set Show Name
                after submitting your value it sets that value
                as your Show Name
            */
            if (e.getSource() == btnSetName) {
                String txtName = JOptionPane.showInputDialog(this, "Enter a Name");
                lblSetName.setText("Show Name: " + txtName);


            }

            /* Pops up an input dialog when you click the Set Date
                after submitting your value it sets that value
                as your Show date
            */
            else if (e.getSource() == btnSetDate) {
                String txtDate = JOptionPane.showInputDialog(this, "Enter a Date");
                lblSetDate.setText("Show Date: " + txtDate);
            }

            /* Pops up an input dialog when you click the Set Price
                after submitting your value it sets that value
                as your Show price
            */
            else if (e.getSource() == btnSetPrice) {
                String txtPrice = JOptionPane.showInputDialog(this, "Enter a Date");
                lblSetPrice.setText("Show Price: " + txtPrice);
            }


        }
    }


}