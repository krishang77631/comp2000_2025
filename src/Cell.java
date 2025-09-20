import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class Cell extends Rectangle {
  static int size = 35;
  char col;
  int row;

  public Cell(char inCol, int inRow, int x, int y) {
    super(x, y, size, size);
    col = inCol;
    row = inRow;
  }

  // Every subclass must define its base color
  public abstract Color getBaseColor();

  public void paint(Graphics g, Point mousePos) {
    if (contains(mousePos)) {
      g.setColor(Color.LIGHT_GRAY); // hover highlight
    } else {
      g.setColor(getBaseColor());   // use subclass color
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

  public boolean contains(Point p) {
    if (p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}
