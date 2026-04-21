import java.util.Scanner;
Iterface Classify
{  
   String getDivision(double avg);
} 
  

class Result implements Classify
{
	@override
    String getDivision(double avg)
    {
      if (arg>=60)
      	{
         return "First Division";
      	}
      else
	{ 
          return "No First Division";
	}
    }
}
class Main
{ 
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(Sysetm.in);
    Reslut R=new Reslut();
    double avg = sc.nextDouble;
    System.out.println("Average :"+avg);
    System.out.println("Division ="+r.getDivision(avg));
  }
}
