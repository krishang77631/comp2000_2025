import java.awt.Color;
import java.awt.Graphics;

public class Dog extends Actor {
  public Dog(Cell inLoc) {
    loc = inLoc;
    color = new Color(160, 82, 45); // brown
  }

  @Override
  public void paint(Graphics g) {
    // Face
    g.setColor(color);
    g.fillOval(loc.x + 6, loc.y + 6, 20, 20);

    // Ears
    g.fillOval(loc.x, loc.y + 8, 8, 12);
    g.fillOval(loc.x + 24, loc.y + 8, 8, 12);

    // Eyes
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 10, loc.y + 12, 5, 5);
    g.fillOval(loc.x + 18, loc.y + 12, 5, 5);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 12, loc.y + 14, 2, 2);
    g.fillOval(loc.x + 20, loc.y + 14, 2, 2);

    // Nose
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 15, loc.y + 20, 5, 5);

    // Outline
    g.setColor(Color.BLACK);
    g.drawOval(loc.x + 6, loc.y + 6, 20, 20);
  }
}
