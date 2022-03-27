import java.util.*;

public class Main {
  public static void main(String[] args) {
    var x = new Person("Salim", "Dari");
    var y = new Person("Hanim", "Dari");
    var z = new Student("Angelina", "Burna", 2);
    var sean= new Teacher("Sean","McCulloch", 20);
    var melat= new Student ("Melat", "defar", 2);
    var q= new People();
    var crs = new course("CS", 270,sean, 2);
    crs.add_student(z);
    crs.add_student(melat);
    crs.Display();
    crs.print_students();
    /*
    q.add(x);
   q.add(y);
    q.add(z);
  q.printList();
  */
  }

}