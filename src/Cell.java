import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class Cell extends Rectangle {
  static int size = 32;
  char col;
  int row;

  public Cell(char inCol, int inRow, int x, int y) {
    super(x, y, size, size);
    col = inCol;
    row = inRow;
  }

  // Each terrain decides its base color
  public abstract Color getBaseColor();

  public void paint(Graphics g, Point mousePos) {
    g.setColor(getBaseColor());

    // Darker shade if mouse is hovering
    if (contains(mousePos)) {
      g.setColor(getBaseColor().darker());
    }

    g.fillRect(x, y, size, size);

    // Grid border
    g.setColor(Color.GRAY);
    g.drawRect(x, y, size, size);
  }

  @Override
  public boolean contains(Point p) {
    if (p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}
