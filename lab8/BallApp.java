import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class BallApp extends JFrame implements Runnable {
    private Thread th;
    private JLabel label = new JLabel();
    private ImageIcon ballIcon = new ImageIcon("soccer-ball-variant.png");

    public BallApp() {
        setTitle("Marquee Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon originalIcon = new ImageIcon("soccer-ball-variant.png");
        Image resizedImage = originalIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ballIcon = new ImageIcon(resizedImage);

        label.setIcon(ballIcon);
        add(label, BorderLayout.NORTH);

        th = new Thread(this);
        th.start();

   
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
              
                frameWidth = getWidth();
                frameHeight = getHeight();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BallApp app = new BallApp();
            app.setBounds(50, 50, 500, 500);
            app.setVisible(true);
        });
    }

     int frameWidth;
     int frameHeight;

    @Override
    public void run() {
          frameWidth = getWidth(); 
            frameHeight = getHeight(); 
        int ballWidth = ballIcon.getIconWidth();
        int ballHeight = ballIcon.getIconHeight();

        int x = 0;
        int y = 0;
        int deltaX = 3;
        int deltaY = 5;

        while (true) {
            try {
          
                x += deltaX;
                y += deltaY;

                if (x <= 0 || x+ballWidth >=frameWidth) {
                    deltaX = -deltaX;
                }
                if (y <= 0 || y +ballHeight>= frameHeight) {
                    deltaY = -deltaY;
                }

                label.setLocation(x, y);
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

