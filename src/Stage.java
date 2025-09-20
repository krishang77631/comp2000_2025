import java.awt.Color;
import java.awt.Graphics;

import java.awt.Point;
import java.util.ArrayList;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
<<<<<<< Updated upstream
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
    actors.add(new Cat(grid.cellAtColRow(0, 0).get()));
    actors.add(new Dog(grid.cellAtColRow(0, 15).get()));
    actors.add(new Bird(grid.cellAtColRow(12, 9).get()));    
=======
 List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();
    actors.add(new Cat(grid.cellAtColRow(0, 0)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));
>>>>>>> Stashed changes
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
<<<<<<< Updated upstream
    for(Actor a: actors) {
      a.paint(g);
    }
    Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if(underMouse.isPresent()) {
      Cell hoverCell = underMouse.get();
      g.setColor(Color.DARK_GRAY);
      g.drawString(String.valueOf(hoverCell.col) + String.valueOf(hoverCell.row), 740, 30);
=======
   for(Actor a : actors) {
      a.paint(g);
    }
    Optional<Cell> currentCell = grid.cellAtPoint(mouseLoc);
  grid.paint(g, mouseLoc);
    for(Actor a : actors) {
        a.paint(g);

    }
    Optional<Cell> currentCell = grid.cellAtPoint(mouseLoc);
    if (currentCell.isPresent()) {
     g.drawString(mouseLoc.x + "," + mouseLoc.y, mouseLoc.x, mouseLoc.y);
>>>>>>> Stashed changes
    }
  }
}
