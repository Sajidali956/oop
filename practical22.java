import java.util.Scanner;
class Shape
{
  double d1,d2;
 
 void getData(double d1,double d2)
 { 
  this.d1=d1;
  this.d2=d2;
 } 
}
class Rectangle extends Shape
{
 double getarea()
 {
  return d1*d2;
 }
}
class Triangle extends Shape
{
 double getarea()
 {
  return 0.5*d1*d2;
 }
}
class Shapmain
{
 
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   double l=sc.nextDouble();
   double w=sc.nextDouble();

   Rectangle R1=new Rectangle();
   R1.getData(l,w);
   double area=R1.getarea();
   System.out.println("Area of rectangle is:"+area);
 
   Triangle T1=new Triangle();
   T1.getData(l,w);
   area=T1.getarea();
   System.out.println("Area of triangle is:"+area);
 }
}