import javax.swing.*;

public class PerimeterCalculator{
    private JPanel panel1;
    private JTextField widthText;
    private JButton button1;
    private JLabel perimeterLabel;
    private JTextField heightText;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ignored){}
        JFrame frame = new JFrame("PerimeterCalculator");
        frame.setContentPane(new PerimeterCalculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("");
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public PerimeterCalculator() {
        button1.addActionListener(e -> {
            double width, height;
            String text = widthText.getText();
            String text1 = heightText.getText();
            width= Double.parseDouble(text);
            height= Double.parseDouble(text1);
            double perimeter = 2 * (width + height);
            perimeterLabel.setText("Perimeter = " + perimeter);
        });
    }
}