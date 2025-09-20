import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JFrame {
    public static void main(String[] args) {
        Main window = new Main();
        window.run();
    }

    class Canvas extends JPanel {
        Stage stage = new Stage();

        public Canvas() {
            setPreferredSize(new Dimension(1024, 720));
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g); // clears background properly
            stage.paint(g, getMousePosition());
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        // Use a Swing Timer to repaint at ~60 FPS (every 16ms)
        Timer timer = new Timer(16, e -> repaint());
        timer.start();
    }
}
