public class Teacher extends Person {
  private int years_taught;
  
  public Teacher(String first, String last, int Year){
    super(first, last);
    years_taught=Year;
  }
}