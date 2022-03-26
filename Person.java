import java.util.*;

public class Person {
  static Scanner in = new Scanner(System.in);
  // instance fields
  private String firstname;
  private String lastname;

  // constructor
  public Person(String first, String last) {
    firstname = first;
    lastname = last;
  }

  // Methods
  public String get_first() {
    return firstname;
  }

  public String get_last() {
    return lastname;
  }
public String toString() {
  return(firstname+" "+ lastname);
}
  
}