import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Frame extends JFrame implements ActionListener {


    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JMenuItem item;
    JMenuItem item1;
    JMenuItem item2;
    JMenuItem item3;
    JMenuItem item4;

   // The constructor that creates the JFrame where the binary conversion is displayed on and the chart.
    public Frame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        ImageIcon image = new ImageIcon("src/image.jpg");
        JLabel label = new JLabel(image);






        JMenuBar b = new JMenuBar();

        JMenu m  = new JMenu("Binary Conversion");
        item = new JMenuItem("Binary to Integer");
        item1 = new JMenuItem("Binary to Sum");
        item2 = new JMenuItem("Integer to Binary");
        item3 = new JMenuItem("Binary to Text");
        item4 = new JMenuItem("Binary to Integer Conversion table");

        m.add(item);
        m.add(item1);
        m.add(item2);
        m.add(item3);
        m.add(item4);
        b.add(m);
        item.addActionListener(this :: actionPerformed);
        item1.addActionListener(this :: actionPerformed);
        item2.addActionListener(this :: actionPerformed);
        item3.addActionListener(this :: actionPerformed);
        item4.addActionListener(this :: actionPerformed);




        label1 = new JLabel("The table is just to be used for the conversion of binary to text (not the numbers)");
        label1.setForeground(Color.GREEN);
        label2 = new JLabel();
        label2.setForeground(Color.GREEN);
        label.setSize(250, 100);
        label3 = new JLabel();
        label3.setForeground(Color.GREEN);


        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setJMenuBar(b);
        frame.add(label , label.CENTER_ALIGNMENT);

        frame.setVisible(true);


    }
    // handles all the actions for buttons being clicked on and the menu.
    @Override
    public void actionPerformed(ActionEvent e) {
        Convert c = new Convert();
        if(e.getSource() == item1){
            label1.setText("");
            label2.setText("");
            label3.setText("");
            String temp = JOptionPane.showInputDialog(null, "Enter Binary Number to convert to Integer sum", "Binary Conversion", JOptionPane.OK_CANCEL_OPTION);
            label1.setText("Binary Number: " + temp);
            label2.setText("Binary Number converted to Integer: " + c.converts(Integer.parseInt(temp)));
            label2.setText("Sum of Binary Number: " + c.convertToBinary(temp));


        }
        if(e.getSource() == item2){
            label1.setText("");
            label2.setText("");
            label3.setText("");
            String temp2 = JOptionPane.showInputDialog(null, "Enter Integer to convert to Binary Number", "Binary Conversion", JOptionPane.OK_CANCEL_OPTION);
            label1.setText("Integer: " + temp2);
            label2.setText("1's Converted: " + c.converts(Integer.parseInt(temp2)));
            label3.setText("Binary Number: " + String.format("%8s", Integer.toBinaryString(Integer.parseInt(temp2))).replace(' ', '0'));
        }
        if(e.getSource() == item3){
            label1.setText("");
            label2.setText("");
            label3.setText("");
            String temp3 = JOptionPane.showInputDialog(null, "Enter Binary Number to convert to Text", "Binary Conversion", JOptionPane.OK_CANCEL_OPTION);
            label1.setText("Binary Number: " +  temp3);
            label3.setText("Binary Converted into letters: " + Convert.binaryToText(temp3));
        }
        if(e.getSource() == item){
            label1.setText("");
            label2.setText("");
            label3.setText("");
            String temp4 = JOptionPane.showInputDialog(null, "Enter Binary Number to convert to Integer", "Binary Conversion", JOptionPane.OK_CANCEL_OPTION);
            label1.setText("Binary Number: " +  temp4);
            label3.setText("Binary Converted into Integer: " + c.convertToNum(temp4));
        }
        if(e.getSource() == item4){
            JFrame frame2 = new JFrame();
            frame2.getContentPane().add(new JLabel(new ImageIcon("src/base.jpeg")));
            frame2.setSize(400,200);
            frame2.getContentPane().setBackground(Color.DARK_GRAY);
            frame2.setVisible(true);
        }
    }
}
