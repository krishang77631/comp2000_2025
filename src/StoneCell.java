import java.awt.Color;

public class StoneCell extends Cell {
  public StoneCell(char inCol, int inRow, int x, int y) {
    super(inCol, inRow, x, y);
  }

  @Override
  public Color getBaseColor() {
    return Color.LIGHT_GRAY;
  }
}
