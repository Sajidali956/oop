class Employee
{
  String EmployeeName;
  String Department;
 
 Employee(String Name, String Dept)
 {
   EmployeeName= Name;
   Department= Dept;
 }
  
 void displayDetails()
 { 
   System.out.println("Employee Name"+ EmployeeName);
   System.out.println("Department"+ Department);
 }
}
  
  class Maneger extends Employee
  {
    int TeamSize;
    String ProjectName;
  
    Maneger(String Name,String Dept,int TeamSize,String ProjectName)
    {
       super(Name,Dept);//parent
       this.TeamSize= TeamSize;
       this.ProjectName= ProjectName;
    }
    
   // @override 
    
    void displayDetails()
    { 
	  System.out.println("Employee Name"+ EmployeeName);
          System.out.println("Department"+ Department);
          System.out.println("TeamSize"+ TeamSize);
          System.out.println("ProjectName"+ ProjectName); 
    }
}

class Main
{
 
   public static void main(String args[])
   {
     Employee obj1=new Employee("sajid","CE");
     obj1.displayDetails();
     Maneger obj2=new Maneger("Sajid","CE",25,"python");
     obj2.displayDetails();
   }

 }

     
      