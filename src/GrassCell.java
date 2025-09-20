import java.awt.Color;

public class GrassCell extends Cell {
  public GrassCell(char inCol, int inRow, int x, int y) {
    super(inCol, inRow, x, y);
  }

  @Override
  public Color getBaseColor() {
    return new Color(124, 252, 0); // bright green
  }
}
