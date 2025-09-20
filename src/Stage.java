import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;
  Team<Hero> heroes; // Generic team of heroes

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();
    heroes = new Team<>();

    // Week 5 baseline actors
    actors.add(new Cat(grid.cellAtColRow(0, 0).get()));
    actors.add(new Dog(grid.cellAtColRow(0, 15).get()));
    actors.add(new Bird(grid.cellAtColRow(12, 9).get()));

    // New superheroes and villain
    Speedster flashClone = new Speedster(grid.cellAtColRow(5, 5).get());
    Tank ironTank = new Tank(grid.cellAtColRow(7, 8).get());
    Thief badGuy = new Thief(grid.cellAtColRow(10, 10).get());

    actors.add(flashClone);
    actors.add(ironTank);
    actors.add(badGuy);

    // Add heroes to team
    heroes.add(flashClone);
    heroes.add(ironTank);
  }

  public void paint(Graphics g, Point mouseLoc) {
  // Draw grid
  grid.paint(g, mouseLoc);

  // Track actor under mouse
  Actor hoveredActor = null;

  for (Actor a : actors) {
    a.paint(g);
    if (mouseLoc != null && a.loc.contains(mouseLoc)) {
      hoveredActor = a;
    }
  }

  // Hover info (cell + actor name)
  Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
  if (underMouse.isPresent()) {
    Cell hoverCell = underMouse.get();
    g.setColor(Color.DARK_GRAY);
    g.drawString("Cell: " + hoverCell.col + hoverCell.row, 740, 30);

    // Show cell type (class name)
    g.drawString("Type: " + hoverCell.getClass().getSimpleName(), 740, 45);
  }

  if (hoveredActor != null) {
    g.setColor(Color.DARK_GRAY);
    String name;
    if (hoveredActor instanceof Hero) {
      name = ((Hero) hoveredActor).getName();
    } else if (hoveredActor instanceof Villain) {
      name = ((Villain) hoveredActor).getAlias();
    } else {
      name = hoveredActor.getClass().getSimpleName();
    }
    g.drawString("Actor: " + name, 740, 65);
  }

  // Team HUD
  g.setColor(Color.DARK_GRAY);
  g.drawString("Heroes in team: " + heroes.size(), 740, 90);
  g.drawString("Team HP: " + heroes.totalHealth(), 740, 105);
}

}
