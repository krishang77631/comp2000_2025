import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
  static int size = 30; // fits better in the window
  char col;
  int row;

  public Cell(char inCol, int inRow, int x, int y) {
    super(x, y, size, size);
    col = inCol;
    row = inRow;
  }

  public void paint(Graphics g, Point mousePos) {
    // Checkerboard background
    if ((row + col) % 2 == 0) {
      g.setColor(new Color(240, 240, 240)); // light gray
    } else {
      g.setColor(new Color(220, 220, 220)); // darker gray
    }

    // Highlight if mouse is over this cell
    if (contains(mousePos)) {
      g.setColor(new Color(180, 200, 255)); // light blue highlight
    }

    g.fillRect(x, y, size, size);

    // Thin border for each cell
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
