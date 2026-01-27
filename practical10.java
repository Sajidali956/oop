import java.util.Scanner;
class Employee 
{
  private String employeeName;
  private Double employeeSalary;

  public void employeeData() {

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter a Employee name:");
     employeeName = sc.next();
 
     System.out.println("Enter a Employee Salary");
     employeeSalary = sc.nextDouble();

}

 public void Displayemployeedata() {

     System.out.println("employee Detail");
     System.out.println("Name: "+employeeName);
     System.out.println("Salary: "+employeeSalary);
}

 public static void main(String args[]) {
      
      System.out.println("250393107006");

      Employee emp=new Employee();

      emp.employeeData();
      emp.Displayemployeedata();
  }
}
 
      

   
 
     

   