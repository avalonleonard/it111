import javax.swing. *;
import java.awt.*;
public class ShowWindow2 extends JFrame {
    JPanel panel;

    JLabel messageLabel;
    JLabel labelMessage;

    JTextField textField;
    JTextField Fieldtext;
    

    public static void main(String[] args) {

        final int WINDOW_WIDTH = 375;
        final int WINDOW_HEIGHT = 550;

        JFrame window = new JFrame();
        window.setTitle("A Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.getContentPane().setBackground(Color.RED);


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


    }

    public void buildPanel(){
        messageLabel = new JLabel("Enter a distance in kilometers");
        labelMessage = new JLabel("Another text field");

        textField = new JTextField(10);
        Fieldtext = new JTextField(10);
        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(textField);
        panel.add(Fieldtext);

    }

    }


