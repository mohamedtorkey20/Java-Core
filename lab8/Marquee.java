import javax.swing.*;
import java.awt.*;

public class Marquee extends JFrame implements Runnable {
    private Thread th;
    private JLabel label = new JLabel();
  

    public Marquee() {
        setTitle("Marquee Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("Java World");
        add(label, BorderLayout.CENTER);

        th = new Thread(this);
        th.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Marquee app = new Marquee();
            app.setBounds(50, 50, 400, 400); 
            app.setVisible(true);
        });
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                
                i++;
                if (i == getWidth()) {
                    i = 0;
                }
                
                label.setBounds(i, 200, label.getPreferredSize().width, label.getPreferredSize().height);
               
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

