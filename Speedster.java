import java.awt.Color;
import java.awt.Graphics;

public class Speedster extends Hero implements Power {
  public Speedster(Cell inLoc) {
    super("Speedster", Color.RED, inLoc);
  }

  @Override
  public void paint(Graphics g) {
    // Body (red circle)
    g.setColor(color);
    g.fillOval(loc.x + 8, loc.y + 8, 20, 20);

    // Outer outline
    g.setColor(Color.BLACK);
    g.drawOval(loc.x + 8, loc.y + 8, 20, 20);

    // Diagonal lightning bolt (yellow)
    g.setColor(Color.YELLOW);
    int[] x = {
      loc.x + 12, loc.x + 18, loc.x + 16,
      loc.x + 22, loc.x + 20, loc.x + 26
    };
    int[] y = {
      loc.y + 10, loc.y + 14, loc.y + 16,
      loc.y + 20, loc.y + 22, loc.y + 26
    };
    g.fillPolygon(x, y, x.length);

    // Black outline for bolt
    g.setColor(Color.BLACK);
    g.drawPolygon(x, y, x.length);
  }

  @Override
  public void usePower(Actor target) {
    if (target instanceof Villain) {
      ((Villain) target).takeDamage(20); // super fast strike
    }
  }
}
