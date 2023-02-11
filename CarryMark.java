import javax.swing.*;
import java.awt.event.*;

public class CarryMark extends JFrame {
    JFrame frame;
    JButton calcBtn = new JButton("Calculate");
    JTextField carrMarkTF, finalMarkTF, totalMarkTF;
    JLabel carryMarkLB, finalMarkLB, totalMarkLB;

    public CarryMark() {
        initComponent();
        calcTotalMark();

        setTitle("Carry Mark Calculator");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    private void initComponent() {
        carryMarkLB = new JLabel("Enter Carry Marks");
        finalMarkLB = new JLabel("Enter Final Marks");
        totalMarkLB = new JLabel("Total Marks");

        carrMarkTF = new JTextField();
        finalMarkTF = new JTextField();
        totalMarkTF = new JTextField();

        carryMarkLB.setBounds(0, 1, 200, 24);
        finalMarkLB.setBounds(0, 30, 200, 24);
        carrMarkTF.setBounds(150, 1, 200, 24);
        finalMarkTF.setBounds(150, 30, 200, 24);

        calcBtn.setBounds(150, 60, 200, 24);
        totalMarkLB.setBounds(0, 90, 200, 24);
        totalMarkTF.setBounds(150, 90, 200, 24);

        // add component to frame
        add(calcBtn);
        add(carryMarkLB);
        add(finalMarkLB);
        add(totalMarkLB);
        add(carrMarkTF);
        add(finalMarkTF);
        add(totalMarkTF);

    }

    private void calcTotalMark() {
        calcBtn.addActionListener((ActionEvent e) -> {
            double carrMark = Double.parseDouble(carrMarkTF.getText());
            double finalMark = Double.parseDouble(finalMarkTF.getText());
            double totalMark;

            if (carrMark >= 40) {
                showPopUp("PASS CM, TOTAL ARE COUNT, YOU ARE PASS");
                totalMark = carrMark + finalMark;
                totalMarkTF.setText(Double.toString(totalMark));
            } else {
                showPopUp("NOT PASS CM, TOTAL NOT COUNT, YOU ARE FAIL");
                totalMarkTF.setText(carrMarkTF.getText());
            }
        });
    }

    private void showPopUp(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    public static void main(String[] args) {
        new CarryMark();
    }
}
