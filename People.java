import java.util.*;

public class People extends ArrayList<Person> {
  ArrayList<Person> People;

  public void printList() {
    for (int i = 0; i < size(); i++) {
    System.out.println(get(i).toString());
    }
  }
}
