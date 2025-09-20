import java.awt.Color;
import java.awt.Graphics;

public class Tank extends Hero implements Power {
  public Tank(Cell inLoc) {
    super("Tank", Color.BLUE, inLoc);
  }

  @Override
  public void paint(Graphics g) {
    // Shield body
    g.setColor(color);
    int[] x = {loc.x + 10, loc.x + 30, loc.x + 25, loc.x + 15};
    int[] y = {loc.y + 5, loc.y + 5, loc.y + 30, loc.y + 30};
    g.fillPolygon(x, y, x.length);

    // Shield border
    g.setColor(Color.WHITE);
    g.drawPolygon(x, y, x.length);
  }

  @Override
  public void usePower(Actor target) {
    if (target instanceof Villain) {
      ((Villain) target).takeDamage(10); // heavy smash
    }
  }
}
