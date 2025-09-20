import java.awt.Color;
import java.awt.Graphics;

public class Bird extends Actor {
  public Bird(Cell inLoc) {
    loc = inLoc;
    color = Color.GREEN;
  }

  @Override
  public void paint(Graphics g) {
    // Body
    g.setColor(color);
    g.fillOval(loc.x + 8, loc.y + 10, 16, 14);

    // Wing
    g.setColor(new Color(0, 150, 0));
    g.fillOval(loc.x + 12, loc.y + 12, 8, 10);

    // Beak
    g.setColor(Color.ORANGE);
    g.fillPolygon(new int[]{loc.x + 24, loc.x + 28, loc.x + 24},
                  new int[]{loc.y + 16, loc.y + 18, loc.y + 20}, 3);

    // Eye
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 10, loc.y + 12, 4, 4);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 12, loc.y + 14, 2, 2);

    // Outline
    g.setColor(Color.BLACK);
    g.drawOval(loc.x + 8, loc.y + 10, 16, 14);
  }
}
