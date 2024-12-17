import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    // JPasswordField t2;
    JButton b1, b2, b3;


    LoginScreen(String s1){
        super(s1);
    }

    LoginScreen(){

    }

    void setComponents(){
        // cursor
        Cursor c1= new Cursor(Cursor.HAND_CURSOR);
        Cursor c2= new Cursor(Cursor.WAIT_CURSOR);
        Cursor c3= new Cursor(Cursor.CROSSHAIR_CURSOR);

        // font
        Font f1= new Font("Times New Roman", Font.BOLD, 28);
        Font f2= new Font("Calibri", Font.ITALIC, 16);

        
        l1= new JLabel("Welcome to Login Screen");
        l1.setFont(f1);
        l1.setForeground(Color.RED);

        l2= new JLabel("USERNAME");
        l3= new JLabel("PASSWORD");
        l3.setFont(f2);

        l4= new JLabel();

        t1= new JTextField();
        t2= new JTextField();

        b1= new JButton("Login");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);

        b2= new JButton("Clear");
        b3= new JButton("Add");

        b1.setCursor(c1);
        b2.setCursor(c2);
        b3.setCursor(c3);

        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);

        l1.setBounds(100, 50, 400, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 300, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());

        l1.addMouseListener(new MouseL());
    }

    class MouseL implements MouseListener{
        public void mouseClicked(MouseEvent e1){
           // l2.setText("Mouse Clicked");
        }
        public void mouseEntered(MouseEvent e1){
            l1.setForeground(Color.GREEN);
        }
        public void mouseExited(MouseEvent e1){
            l1.setForeground(Color.RED);
        }
        public void mousePressed(MouseEvent e1){
            l1.setText("");
        }
        public void mouseReleased(MouseEvent e1){
            l1.setText("Welcome to Login Screen");
        }
    }

    public static void main(String[] args) {
        LoginScreen s1= new LoginScreen("WELCOME");
        s1.setVisible(true);
        s1.setSize(700, 700);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        s1.setComponents();
    }


    class Log implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            String s1= t1.getText();
            String s2= t2.getText();
            if(s1.equals("Divyanshi Rawat")&& s2.equals("2004")){
                JOptionPane.showMessageDialog(null, "Login Successful!");
                l4.setText("Login Successful!");
            }
            else{
                l4.setText("Login Unsuccessful...");
            }

        }
    }

    class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            t1.setText("");
            t2.setText("");

        }
    }

    class Add implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            try{
            int a= Integer.parseInt(t1.getText());
            int b= Integer.parseInt(t2.getText());
            int c= a+b;
            l4.setText("Addition is: "+c);
            }
            catch(Exception e){
                l4.setText("Please enter numbers only!");
            }


        }
    }

}




// interface MouseListener{
// public abstract void mouseClicked(MouseEvent e1);
//                 void mouseEntered(MouseEvent e1);
//                 void mouseExited(MouseEvent e1);
//                 void mousePressed(MouseEvent e1);
//                 void mouseReleased(MouseEvent e1);
//}




// FileH1.java