import java.awt.Color;
import java.awt.Graphics;

public class Speedster extends Hero implements Power {
  public Speedster(Cell inLoc) {
    super("Speedster", Color.RED, inLoc);
  }

  @Override
  public void paint(Graphics g) {
    // Body
    g.setColor(color);
    g.fillOval(loc.x + 8, loc.y + 8, 20, 20);

    // Lightning bolt
    g.setColor(Color.YELLOW);
    int[] x = {loc.x + 15, loc.x + 20, loc.x + 18, loc.x + 25, loc.x + 15, loc.x + 18};
    int[] y = {loc.y + 10, loc.y + 15, loc.y + 15, loc.y + 25, loc.y + 20, loc.y + 20};
    g.fillPolygon(x, y, x.length);
  }

  @Override
  public void usePower(Actor target) {
    if (target instanceof Villain) {
      ((Villain) target).takeDamage(20); // fast strike
    }
  }
}
