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
    g.fillOval(loc.x + 10, loc.y + 10, 15, 15);

    // Wings
    g.setColor(color.darker());
    g.fillOval(loc.x + 5, loc.y + 12, 8, 10);
    g.fillOval(loc.x + 22, loc.y + 12, 8, 10);

    // Eye
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 15, loc.y + 12, 4, 4);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 16, loc.y + 13, 2, 2);

    // Beak
    g.setColor(Color.ORANGE);
    g.fillPolygon(
      new int[]{loc.x + 20, loc.x + 25, loc.x + 20},
      new int[]{loc.y + 18, loc.y + 20, loc.y + 22}, 3
    );
  }
}
