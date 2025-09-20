import java.awt.Color;

public class WaterCell extends Cell {
  public WaterCell(char inCol, int inRow, int x, int y) {
    super(inCol, inRow, x, y);
  }

  @Override
  public Color getBaseColor() {
    return new Color(30, 144, 255); // blue
  }
}
