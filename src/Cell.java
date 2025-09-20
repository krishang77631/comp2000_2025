import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
  static int size = 30;
  char col;
  int row;

  public Cell(char inCol, int inRow, int x, int y) {
    super(x, y, size, size);
    col = inCol;
    row = inRow;
  }

  public void paint(Graphics g, Point mousePos) {
  // Background color (checkerboard)
  if ((row + col) % 2 == 0) {
    g.setColor(new Color(230, 230, 230)); // light gray
  } else {
    g.setColor(new Color(255, 255, 255)); // white
  }

  // Highlight if mouse is over
  if (contains(mousePos)) {
    g.setColor(new Color(200, 200, 255));
  }

  g.fillRect(x, y, size, size);

  // Border
  g.setColor(Color.GRAY);
  g.drawRect(x, y, size, size);
}


  public boolean contains(Point p) {
    if(p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}
