import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Actor {
  Color color;
  Cell loc;
<<<<<<< Updated upstream
  List<Polygon> display;

  public void paint(Graphics g) {
    for(Polygon p: display) {
=======
  List<Polygon> polygons;

  public void paint(Graphics g) {
    if (polygons != null) {
    for(Polygon p : polygons) {
>>>>>>> Stashed changes
      g.setColor(color);
      g.fillPolygon(p);
      g.setColor(Color.GRAY);
      g.drawPolygon(p);
    }
<<<<<<< Updated upstream
=======
  } else {

    g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
>>>>>>> Stashed changes
  }
}
}
