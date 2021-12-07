package UI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class GradesPanel implements AppPanel {
    private JPanel gradesPanel = new JPanel();
    private JPanel gradesNumbersPanel = new JPanel();
    private GradeButtonPanel[] buttons = {
            new GradeButtonPanel("1", "Péssimo"),
            new GradeButtonPanel("2"),
            new GradeButtonPanel("3"),
            new GradeButtonPanel("4"),
            new GradeButtonPanel("5", "Excelente")
    };

    public GradesPanel(ActionListener listener) {
        FlowLayout fl = new FlowLayout();
        fl.setAlignOnBaseline(true);
        gradesNumbersPanel.setLayout(fl);

        for (GradeButtonPanel gradeButton : buttons) {
            gradeButton.addListener(listener);
            gradesNumbersPanel.add(gradeButton.getPanel());
        }

        gradesPanel.add(gradesNumbersPanel);
    }

    public JPanel getPanel() {
        return gradesPanel;
    }

    public void setValue(String value) {
    }
}
