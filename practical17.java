class University
{
 static int totalstudent;
 static String Universityname;
 
 static
 {
   Universityname = "gtu";
   totalstudent =0;
   System.out.println("Static Block Excuted");
 }
 {
   System.out.println("Instance Blocked	Excuted");
 }
 University()
 {
   totalstudent++;
   System.out.println("Constructor Excuted");
 }
 static int getTotalStudent()
 {
     return totalstudent;
 }
 public static void main(String arg[])
 {
   System.out.println("250393107006");
   System.out.println("Main Method Stated");
   System.out.println("University Name:" +Universityname);
   University s1=new University();
   University s2=new University();
   University s3=new University();
   System.out.println("/n Total Student:" +getTotalStudent());
 }
}
   

  
