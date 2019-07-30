import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;

    public MainWindow() {
        this.getContentPane().add(panel);
        this.button1.addActionListener(new MyButtonListener());
        this.textField1.addFocusListener(new MyFieldListener());
        this.button2.setSize(new Dimension(100, 100));
    }

    public void far() {
        JFrame frame = new JFrame("FrameDemo");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private class MyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Действие совершено");
            if (textField1.getText().equals(passwordField1.getText())) {
                JOptionPane.showMessageDialog(null, "Success");
            }else {
                JOptionPane.showMessageDialog(null, "Failure");
            }
        }
    }

    private class MyFieldListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Фокус!");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Фокус снят !");
        }
    }


}
