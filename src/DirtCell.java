import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class DirtCell extends Cell {
  public DirtCell(char inCol, int inRow, int x, int y) {
    super(inCol, inRow, x, y);
  }

  @Override
  public Color getBaseColor() {
    return new Color(139, 69, 19); // brown
  }

  @Override
  public void paint(Graphics g, Point mousePos) {
    g.setColor(getBaseColor());
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }
}
