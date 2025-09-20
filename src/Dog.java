import java.awt.Color;
import java.awt.Graphics;

public class Dog extends Actor {
  public Dog(Cell inLoc) {
    loc = inLoc;
    color = new Color(139, 69, 19); // brown
  }

  @Override
  public void paint(Graphics g) {
    // Head
    g.setColor(color);
    g.fillOval(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);

    // Ears
    g.setColor(color.darker());
    g.fillOval(loc.x, loc.y + 8, 8, 15);
    g.fillOval(loc.x + 25, loc.y + 8, 8, 15);

    // Eyes
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 12, loc.y + 15, 5, 5);
    g.fillOval(loc.x + 20, loc.y + 15, 5, 5);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 14, loc.y + 17, 2, 2);
    g.fillOval(loc.x + 22, loc.y + 17, 2, 2);

    // Tongue
    g.setColor(Color.PINK);
    g.fillOval(loc.x + 16, loc.y + 28, 6, 6);
  }
}
