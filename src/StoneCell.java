import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class StoneCell extends Cell {
  public StoneCell(char inCol, int inRow, int x, int y) {
    super(inCol, inRow, x, y);
  }

  @Override
  public Color getBaseColor() {
    return Color.GRAY;  // base terrain color
  }

  @Override
  public void paint(Graphics g, Point mousePos) {
    g.setColor(getBaseColor());
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }
}
