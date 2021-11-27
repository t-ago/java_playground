import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App implements ActionListener {
    private int count = 0;

    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public App() {
        frame = new JFrame("example");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(3, 1));

        JButton button = new JButton("Button");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("One Simple Title");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}