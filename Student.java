import java.util.*;

public class Student extends Person {
  private int year;

  public Student(String f, String l, int Year) {
    super(f, l);
    year = Year;
  }

  public int get_year() {
    return year;
  }

  public String toString() {
    String x = super.toString();
    return x + ". Year: " + year;

  }
}