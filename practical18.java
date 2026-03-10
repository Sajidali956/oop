class BankAccount
{
  String accountholdername;
  double balance;

  static double interestRate=5.0;
 
  void assignvalue(String Name,double bal)
  {
    accountholdername=Name;
    balance=bal;
  }
  void display()
  { 
   System.out.println("Account Holder Name:" +accountholdername);
   System.out.println("Account Holder Balance:" +balance);
   System.out.println("Account Holder InterestRate:" +interestRate);
   System.out.println("Account Holder Interest Earned:" +calculateInterest());
  }
   double calculateInterest()
   {
      return (balance*interestRate)/100;
   }
   static void updateInterestRate(double newRate)
   { 
     interestRate = newRate;
     System.out.println("\n Interest Rate updated to "+interestRate+"%");
   }
  public static void main(String args[])
  {
    System.out.println("250393107006");
    BankAccount B1 = new BankAccount();
    BankAccount B2 = new BankAccount();
    B1.assignvalue("sajid",32000);
    B2.assignvalue("aamin",30000);
    System.out.println("Before Rate Change");
    B1.display();
    B2.display();
    BankAccount.updateInterestRate(7.5);
    System.out.println("After rate change");
    B1.display();
    B2.display();
  } 
}