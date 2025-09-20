import java.awt.Color;

public abstract class Hero extends Actor {
  protected String name;
  protected int health;

  public Hero(String name, Color color, Cell startLoc) {
    this.name = name;
    this.color = color;
    this.loc = startLoc;
    this.health = 100; // all heroes start with 100 HP
  }

  public void takeDamage(int dmg) { this.health -= dmg; }
  public boolean isAlive() { return health > 0; }
  public int getHealth() { return health; }
  public String getName() { return name; }
}
