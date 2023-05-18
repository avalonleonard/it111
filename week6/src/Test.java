import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    JPanel panel;

    JLabel messageLabel;
    JLabel labelMessage;

    JTextField kiloTextField;
    JTextField fieldText;

    JButton calcButton;

    final int WINDOW_WIDTH= 350;
    final int WINDOW_HEIGHT= 450;

    public Test(){
        setTitle("Tester File");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);

    }
    public void buildPanel(){
        messageLabel = new JLabel("Enter a distance in kilometers");
        labelMessage = new JLabel("Another text field");

        kiloTextField = new JTextField(10);
        fieldText = new JTextField(10);
        calcButton = new JButton("Calculate");
        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(labelMessage);
        panel.add(fieldText);
        panel.add(kiloTextField);
        panel.add(calcButton);
           }
    public static void main(String[] args){
        new Test();
    }
}

