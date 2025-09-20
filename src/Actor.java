import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Actor {
  Color color;
  Cell loc;
  List<Polygon> polygons;

  public void paint(Graphics g) {
    if (polygons != null && !polygons.isEmpty()) {
      // Draw custom polygon shape
      for (Polygon p : polygons) {
        g.setColor(color);
        g.fillPolygon(p);
        g.setColor(Color.GRAY);
        g.drawPolygon(p);
      }
    } else {
      // Fallback: simple rectangle if no polygons defined
      g.setColor(color);
      g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
      g.setColor(Color.GRAY);
      g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }
  }
}
