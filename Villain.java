import java.awt.Color;

public abstract class Villain extends Actor {
  protected String alias;
  protected int health;

  public Villain(String alias, Color color, Cell inLoc) {
    this.alias = alias;
    this.color = color;
    this.loc = inLoc;
    this.health = 80; // default HP for villains
  }

  public String getAlias() {
    return alias;
  }

  public int getHealth() {
    return health;
  }

  public void takeDamage(int dmg) {
    health -= dmg;
    if (health < 0) health = 0;
  }

  public boolean isAlive() {
    return health > 0;
  }
}
