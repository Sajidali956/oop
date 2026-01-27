import java.util.Scanner;
class Point
{
  int x;
  int y;

  Point()
  {
    x=5;
    y=10;
  }
  
  Point(int a,int b)
  {
    x=a;
    y=b;
  }

  Point (Point p) {
  
    x=p.x;
    y=p.y;
  }

 void Display() {

    System.out.println("x :"+x);
    System.out.println("y :"+y);
}

 public static void main (String args[])
 {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("250393107006");
  int a=sc.nextInt();
  int b=sc.nextInt();
  Point p1 = new Point();
  p1.Display();
  Point p2 = new Point(a,b);
  p2.Display();
  Point p3 = new Point(p2);
  p3.Display();

 
 }
}
  