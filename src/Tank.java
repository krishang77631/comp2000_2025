import java.awt.Color;
import java.awt.Graphics;

public class Tank extends Hero implements Power {
  public Tank(Cell inLoc) {
    super("Tank", new Color(0, 128, 0), inLoc); // dark green
  }

  @Override
  public void paint(Graphics g) {
    // Fist palm (rectangle block)
    g.setColor(color);
    g.fillRect(loc.x + 10, loc.y + 14, 20, 14);

    // Knuckles (four bumps on top of fist)
    g.fillOval(loc.x + 10, loc.y + 8, 6, 8);
    g.fillOval(loc.x + 16, loc.y + 8, 6, 8);
    g.fillOval(loc.x + 22, loc.y + 8, 6, 8);
    g.fillOval(loc.x + 28, loc.y + 8, 6, 8);

    // Thumb on the side
    g.fillOval(loc.x + 6, loc.y + 16, 8, 10);

    // Black outlines for clarity
    g.setColor(Color.BLACK);
    g.drawRect(loc.x + 10, loc.y + 14, 20, 14);
    g.drawOval(loc.x + 10, loc.y + 8, 6, 8);
    g.drawOval(loc.x + 16, loc.y + 8, 6, 8);
    g.drawOval(loc.x + 22, loc.y + 8, 6, 8);
    g.drawOval(loc.x + 28, loc.y + 8, 6, 8);
    g.drawOval(loc.x + 6, loc.y + 16, 8, 10);

    // Detail lines inside fist
    g.drawLine(loc.x + 12, loc.y + 18, loc.x + 12, loc.y + 24);
    g.drawLine(loc.x + 18, loc.y + 18, loc.x + 18, loc.y + 24);
    g.drawLine(loc.x + 24, loc.y + 18, loc.x + 24, loc.y + 24);
  }

  @Override
  public void usePower(Actor target) {
    if (target instanceof Villain) {
      ((Villain) target).takeDamage(20); // heavy smash
    }
  }
}
