package MyInputForm;

/**
 *
 * @author muhammadFikrulHaqi
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1941723005Fikrul extends JFrame {

    private static final int FRAME_WIDTH = 700;
    private static final int FRAME_WEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public MyInputForm1941723005Fikrul() {
        createTextField();
        createButton1();
        createButton2();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }

    private void createTextField() {
        aLabel = new JLabel("Niali A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton1() {
        button1 = new JButton("Calculate");//untuk membuat tombol "Calculate"
        class AddInterestListener implements ActionListener {

            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil perkalian: " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button1.addActionListener(listener);

    }

    private void createButton2() {
        button2 = new JButton("Jumlah");//untuk membuat tombol "Jumlah"
        class AddInterestListener implements ActionListener {

            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int d = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int e = Integer.valueOf(bField.getText());
                int f = d + e;
                cLabel.setText("Hasil penjumlahan: " + f);
            }
        }
        ActionListener listener = new AddInterestListener();
        button2.addActionListener(listener);

    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button1);
        panel.add(button2);
        panel.add(cLabel);
        add(panel);
    }

}
