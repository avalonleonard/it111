import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class ShowWindow2 extends JFrame {
    JPanel panel;

    JLabel messageLabel;
    JLabel labelMessage;

    JTextField textField;
    JTextField Fieldtext;


    public static void main(String[] args) {
       new ShowWindow2();

    }
    public  ShowWindow2(){
        final int WINDOW_WIDTH = 375;
        final int WINDOW_HEIGHT = 550;

        setTitle("A Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(260,100);

        buildPanel();

        add(panel);

        setVisible(true);



    }

    public void buildPanel(){
        messageLabel = new JLabel("My First Label");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        labelMessage = new JLabel("Another text field");
        labelMessage.setFont(new Font("Arial", Font.BOLD, 30));

        textField = new JTextField(10);
        Fieldtext = new JTextField(10);
        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(textField);
        panel.add(labelMessage);
        panel.add(Fieldtext);
        panel.setBackground(Color.RED);

    }

    }


