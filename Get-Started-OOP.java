import java.util.Scanner;

public class Person {
    String age;
    String first_name;
    String last_name;
    String birthday_place;
    String birthday_date;
    
    Person(String age, String first_name, String last_name, String birthday_place, String birthday_date) {
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday_place = birthday_place;
        this.birthday_date = birthday_date;
    }
    
     public String getAge() {
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getBirthday_place() {
        return birthday_place;
    }
    public void setBirthday_place(String birthday_place) {
        this.birthday_place = birthday_place;
    }
    public String getBirthday_date() {
        return birthday_date;
    }
    public void setBirthday_date(String birthday_date) {
        this.birthday_date = birthday_date;
    }
}
class Student extends Person {
        String department;
        Student(){
          super("","","","","");
        }
        Student(String age, String first_name, String last_name, String birthday_place, String birthday_date, String department){
            super(age, first_name, last_name, birthday_place, birthday_date);
            this.department = department;
        }
        public String getDepartment() {
            return department;
            }
        public void setDepartment(String department ){
            this.department = department;
        }
        void fill_information(){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter your age");
        this.age = s.nextLine();
        System.out.println("enter your first name");
        this.first_name = s.nextLine();
        System.out.println("enter your last name");
        this.last_name = s.nextLine();
        System.out.println("enter your birthday place");
        this.birthday_place = s.nextLine();
        System.out.println("enter your birhtday date");
        this.birthday_date = s.nextLine();
        System.out.println("enter your department");
        this.department = s.nextLine();
 }
void display_information(){ System.out.println("Age : " + getAge());
 System.out.println("First Name : " + getFirst_name());
 System.out.println("Last Name : " + getLast_name());
 System.out.println("Birthday Place : " + getBirthday_place());
 System.out.println("Birthday Date : " + getBirthday_date());
 System.out.println("Department : " + getDepartment());
}
}
class Program {
    public static void main(String args [ ]){
         
        Student student = new Student();
        
    student.fill_information();
    student.display_information();
    }
    
   
}
