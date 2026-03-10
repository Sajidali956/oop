import java.util.Scanner;
class College
{
  String CollegeName;

  College(String cs)
  { 
    CollegeName=cs;
  }
   
  class Admission
  { 
    String StudentName; 
    String Course;

    void Accept()
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter StudentName");
        StudentName=sc.nextLine();
        System.out.println("Enter Course");
        Course=sc.nextLine();
    }
    void Display() 
    {
        System.out.println("CollegeName :"+CollegeName);
        System.out.println("StudentName :"+StudentName);
        System.out.println("Course :"+Course);   
    }  
   }
 public static void main(String args[])  
 { 
   System.out.println("250393107006");
   College c=new College("S.P.B Patel Engineering College");

   College.Admission add= c.new Admission();
 
    add.Accept();
    add.Display();
 }
}
    
   