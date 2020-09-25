import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class NamesGui {

    int counter = 0, i = 0;

    String names[] = new String[3];
    String longestName = " ", message;

    JFrame jFrameWindow;
    JLabel infoLabel;
    JTextField nameField;
    JButton searchButton, longestButton;


    public NamesGui() {
        jFrameWindow = new JFrame("student names");
        FlowLayout flowLayout = new FlowLayout();
        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(500, 500);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name");
        jFrameWindow.add(nameLabel);
        nameField = new JTextField(20);
        jFrameWindow.add(nameField);
        infoLabel = new JLabel("Enter first name");
        jFrameWindow.add(infoLabel);

        EventHandler handler = new EventHandler();
        nameField.addActionListener(handler);
        jFrameWindow.setVisible(true);

    }

    public static void main(String[] args) {

        NamesGui guiApp = new NamesGui();

    }

    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == nameField && i <= 2) {
                names[i] = nameField.getText();
                infoLabel.setText("Name Added : " + (3 - i) + "slots empty");
                nameField.setText("");
                i++;
            }

            if (i == 3) {
                JOptionPane.showMessageDialog(null, "Array now full");
                infoLabel.setVisible(false);
                searchButton = new JButton("Search");
                jFrameWindow.add(searchButton);
                longestButton = new JButton("longest name");
                jFrameWindow.add(longestButton);

            }
        }
    }
}