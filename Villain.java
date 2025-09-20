import java.awt.Color;

public abstract class Villain extends Actor {
  protected String alias;
  protected int health;

  public Villain(String alias, Color color, Cell startLoc) {
    this.alias = alias;
    this.color = color;
    this.loc = startLoc;
    this.health = 80; // villains a bit weaker
  }

  public void takeDamage(int dmg) { this.health -= dmg; }
  public boolean isAlive() { return health > 0; }
  public int getHealth() { return health; }
  public String getAlias() { return alias; }
}
