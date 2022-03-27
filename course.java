import java.util.*;
  public class course{
    private int number;
    private People studentslist= new People();
    private Teacher teacher;
    private int courseday; 
    private String coursename;
    public course(String c, int n, Teacher t, int day){
      number=n;
      teacher=t;
      courseday = day;
      coursename =c; 
    }
  public void add_student (Student s){
    studentslist.add(s);
  }
    public People get_student(){
      return studentslist;
    } 
  public void set_day(int day){
    courseday = day;
  }
  public int get_day(){
    return this.courseday;
  }
  public Boolean compatible(course other){
    People s = other.get_student();
    for(int i=0; i < s.size(); i++){
       for(int j=0; j < studentslist.size(); j++){
         if(s.get(i)==studentslist.get(j)){
           return false;
         }
       }
      }
    return true;
  }
  public void Display(){
    System.out.println("Name and number "+coursename+ number);
    System.out.println("Day "+ courseday);
    System.out.println("Teacher "+ teacher.toString());
  }
    public void print_students(){
      System.out.println("Students: ");
      studentslist.printList();
      System.out.println();
  }
  }