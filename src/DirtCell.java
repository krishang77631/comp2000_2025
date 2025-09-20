import java.awt.Color;

public class DirtCell extends Cell {
  public DirtCell(char inCol, int inRow, int x, int y) {
    super(inCol, inRow, x, y);
  }

  @Override
  public Color getBaseColor() {
    return new Color(139, 69, 19); // brown
  }
}
