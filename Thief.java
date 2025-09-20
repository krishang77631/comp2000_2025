import java.awt.Color;
import java.awt.Graphics;

public class Thief extends Villain implements Power {
  public Thief(Cell inLoc) {
    super("Thief", Color.BLACK, inLoc);
  }

  @Override
  public void paint(Graphics g) {
    // Mask rectangle
    g.setColor(color);
    g.fillRect(loc.x + 8, loc.y + 12, 20, 10);

    // Eyes
    g.setColor(Color.WHITE);
    g.fillOval(loc.x + 10, loc.y + 14, 5, 5);
    g.fillOval(loc.x + 20, loc.y + 14, 5, 5);
    g.setColor(Color.BLACK);
    g.fillOval(loc.x + 12, loc.y + 16, 2, 2);
    g.fillOval(loc.x + 22, loc.y + 16, 2, 2);

    // Outline
    g.setColor(Color.BLACK);
    g.drawRect(loc.x + 8, loc.y + 12, 20, 10);
  }

  @Override
  public void usePower(Actor target) {
    if (target instanceof Hero) {
      ((Hero) target).takeDamage(5);
    }
  }
}
