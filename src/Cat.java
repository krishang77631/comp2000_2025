import java.awt.Color;
import java.awt.Graphics;

public class Cat extends Actor {
  public Cat(Cell inLoc) {
    loc = inLoc;
    color = Color.ORANGE;
  }

  @Override
  public void paint(Graphics g) {
    // Face
    g.setColor(color);
    g.fillOval(loc.x + 6, loc.y + 6, 20, 20);

    // Ears
    g.setColor(color);
    g.fillPolygon(new int[]{loc.x + 8, loc.x + 14, loc.x + 10},
                  new int[]{loc.y + 6, loc.y, loc.y + 6}, 3);
    g.fillPolygon(new int[]{loc.x + 18, loc.x + 24, loc.x + 20},
                  new int[]{loc.y + 6, loc.y, loc.y + 6}, 3);

    // Eyes
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 10, loc.y + 12, 5, 5);
    g.fillOval(loc.x + 18, loc.y + 12, 5, 5);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 12, loc.y + 14, 2, 2);
    g.fillOval(loc.x + 20, loc.y + 14, 2, 2);

    // Nose
    g.setColor(Color.PINK);
    g.fillOval(loc.x + 15, loc.y + 18, 4, 4);

    // Outline
    g.setColor(Color.BLACK);
    g.drawOval(loc.x + 6, loc.y + 6, 20, 20);
  }
}
