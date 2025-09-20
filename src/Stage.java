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

    // Superheroes & villain
    Speedster flashClone = new Speedster(grid.cellAtColRow(5, 5).get());
    Tank ironTank = new Tank(grid.cellAtColRow(7, 8).get());
    Thief badGuy = new Thief(grid.cellAtColRow(10, 10).get());

    actors.add(flashClone);
    actors.add(ironTank);
    actors.add(badGuy);

    heroes.add(flashClone);
    heroes.add(ironTank);
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);

    // Track hovered actor
    Actor hoveredActor = null;
    for (Actor a : actors) {
      a.paint(g);
      if (mouseLoc != null && a.loc.contains(mouseLoc)) {
        hoveredActor = a;
      }
    }

    // HUD background box
    g.setColor(new Color(240, 240, 240, 220));
    g.fillRect(730, 10, 260, 220);
    g.setColor(Color.BLACK);
    g.drawRect(730, 10, 260, 220);

    g.setColor(Color.DARK_GRAY);
    g.drawString("=== HUD ===", 740, 30);

    int hudY = 55;

    // Cell info
    Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if (underMouse.isPresent()) {
      Cell hoverCell = underMouse.get();
      g.setColor(Color.BLACK);
      g.drawString("Cell: " + hoverCell.col + hoverCell.row, 740, hudY);
      hudY += 15;
      g.drawString("Type: " + hoverCell.getClass().getSimpleName(), 740, hudY);
      hudY += 25;
    }

    // Actor info
    if (hoveredActor != null) {
      g.setColor(Color.BLACK);
      String name;
      int hp = -1;

      if (hoveredActor instanceof Hero) {
        name = ((Hero) hoveredActor).getName();
        hp = ((Hero) hoveredActor).getHealth();
      } else if (hoveredActor instanceof Villain) {
        name = ((Villain) hoveredActor).getAlias();
        hp = ((Villain) hoveredActor).getHealth();
      } else {
        name = hoveredActor.getClass().getSimpleName();
      }

      g.drawString("Actor: " + name, 740, hudY);
      hudY += 15;

      if (hp >= 0) {
        g.drawString("HP: " + hp, 740, hudY);

        // Draw HP bar
        int barX = 800;
        int barY = hudY - 10;
        int barWidth = 150;
        int barHeight = 10;

        // Pick color based on health %
        Color hpColor = Color.GREEN;
        if (hp < 50) hpColor = Color.ORANGE;
        if (hp < 20) hpColor = Color.RED;

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(barX, barY, barWidth, barHeight);

        g.setColor(hpColor);
        g.fillRect(barX, barY, Math.max(0, (hp * barWidth) / 100), barHeight);

        g.setColor(Color.BLACK);
        g.drawRect(barX, barY, barWidth, barHeight);

        g.setColor(Color.BLACK);
        hudY += 25;
      } else {
        hudY += 10;
      }
    }

    // Team info
    g.setColor(Color.DARK_GRAY);
    g.drawString("Team size: " + heroes.size(), 740, hudY);
    hudY += 15;
    g.drawString("Total HP: " + heroes.totalHealth(), 740, hudY);
  }
}
