class Student {
     String name;
     int rollNumber;
     char grade;
     
     public void displayDetails() {
          System.out.println("Name : " + name);
          System.out.println("Roll number : " + rollNumber);
          System.out.println("Grade : " + grade);
     }
}

public class Main {
      public static void main(String[] args) {
        Stuedent Student = new Stuedent();
        Student.displayDetails();
    }
}
