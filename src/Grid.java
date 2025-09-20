import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;

public class Grid {
  Cell[][] cells = new Cell[20][20];

  public Grid() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        int rand = (int)(Math.random() * 4); // pick 0–3 for terrain
        if (rand == 0) {
          cells[i][j] = new GrassCell(colToLabel(i), j, 10 + Cell.size * i, 10 + Cell.size * j);
        } else if (rand == 1) {
          cells[i][j] = new WaterCell(colToLabel(i), j, 10 + Cell.size * i, 10 + Cell.size * j);
        } else if (rand == 2) {
          cells[i][j] = new DirtCell(colToLabel(i), j, 10 + Cell.size * i, 10 + Cell.size * j);
        } else {
          cells[i][j] = new StoneCell(colToLabel(i), j, 10 + Cell.size * i, 10 + Cell.size * j);
        }
      }
    }
  }

  private char colToLabel(int col) {
    return (char) (col + Character.valueOf('A'));
  }

  private int labelToCol(char col) {
    return (int) (col - Character.valueOf('A'));
  }

  public void paint(Graphics g, Point mousePos) {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }

    // Thick outer border around the whole grid
    int gridWidth = cells.length * Cell.size;
    int gridHeight = cells[0].length * Cell.size;
    int startX = cells[0][0].x;
    int startY = cells[0][0].y;

    g.setColor(Color.BLACK);
    for (int i = 0; i < 3; i++) {
      g.drawRect(startX - i, startY - i, gridWidth + (i * 2), gridHeight + (i * 2));
    }
  }

  public Optional<Cell> cellAtColRow(int c, int r) {
    if (c >= 0 && c < cells.length && r >= 0 && r < cells[c].length) {
      return Optional.of(cells[c][r]);
    } else {
      return Optional.empty();
    }
  }

  public Optional<Cell> cellAtColRow(char c, int r) {
    return cellAtColRow(labelToCol(c), r);
  }

  public Optional<Cell> cellAtPoint(Point p) {
    if (p == null) {
      return Optional.empty();
    }
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        if (cells[i][j].contains(p)) {
          return Optional.of(cells[i][j]);
        }
      }
    }
    return Optional.empty();
  }
}
