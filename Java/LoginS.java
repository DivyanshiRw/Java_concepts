import javax.swing.*;

// public class LoginS {
//     public static void main(String[] args) {
//         JFrame j1= new JFrame("WELCOME");
//         j1.setSize(500, 500);
//         j1.setVisible(true);
//         j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     }
// }

public class LoginS extends JFrame {
    LoginS(String s1){
        super(s1);
    }

    LoginS(){

    }

    void setComponents(){
        JLabel l1= new JLabel("Hello");
        JTextField t1= new JTextField();
        setLayout(null);

        l1.setBounds(200, 100, 100, 30);
        t1.setBounds(200, 200, 100, 30);
        add(t1);
        add(l1);

    }

    public static void main(String[] args) {
        LoginS s1= new LoginS("WELCOME");
        s1.setVisible(true);
        s1.setSize(700, 700);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        s1.setComponents();
    }

}





// GUI (Graphical User Interface)
//---- using AWT (Abstract Windowing Toolkit)
//---- using Swing

//GUI---(container, frame, panel)
//components---(label, textarea, radiobutton, checkbox, button)






// LoginScreen.java