package UI;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;

public class ResultPanel implements AppPanel {
    private JPanel resultPanel = new JPanel();
    private JLabel label = new JLabel();
    private JTextField textField = new JTextField(5);

    public ResultPanel(String text) {
        resultPanel.setLayout(new GridBagLayout());

        label.setText(text);
        resultPanel.add(label);
        resultPanel.add(Box.createHorizontalStrut(35));
        resultPanel.add(textField);
    }

    public JPanel getPanel() {
        return resultPanel;
    }

    public void setValue(String value) {
        textField.setText(value);
    }
}
