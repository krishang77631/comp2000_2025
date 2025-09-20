import java.util.ArrayList;
import java.util.List;

public class Team<T extends Hero> {
  private final List<T> members = new ArrayList<>();

  // Add a hero to the team
  public void add(T hero) {
    members.add(hero);
  }

  // Number of heroes
  public int size() {
    return members.size();
  }

  // Total health across the team
  public int totalHealth() {
    int sum = 0;
    for (T h : members) {
      sum += h.getHealth();
    }
    return sum;
  }

  // Optional: get all members
  public List<T> getMembers() {
    return members;
  }
}
