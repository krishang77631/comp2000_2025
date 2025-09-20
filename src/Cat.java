import java.awt.Color;
import java.awt.Graphics;

public class Cat extends Actor {
  public Cat(Cell inLoc) {
    loc = inLoc;
    color = Color.ORANGE;
  }

  @Override
  public void paint(Graphics g) {
    // Head
    g.setColor(color);
    g.fillOval(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);

    // Ears
    g.setColor(color.darker());
    int[] x1 = {loc.x + 8, loc.x + 15, loc.x + 12};
    int[] y1 = {loc.y + 15, loc.y + 15, loc.y + 3};
    g.fillPolygon(x1, y1, 3);

    int[] x2 = {loc.x + 20, loc.x + 27, loc.x + 23};
    int[] y2 = {loc.y + 15, loc.y + 15, loc.y + 3};
    g.fillPolygon(x2, y2, 3);

    // Eyes
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 12, loc.y + 15, 5, 5);
    g.fillOval(loc.x + 20, loc.y + 15, 5, 5);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 14, loc.y + 17, 2, 2);
    g.fillOval(loc.x + 22, loc.y + 17, 2, 2);

    // Nose
    g.setColor(Color.PINK);
    g.fillOval(loc.x + 17, loc.y + 22, 4, 4);
  }
}
