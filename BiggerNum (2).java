import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter two numbers:");
    Scanner input = new Scanner(System.in);
//Scanner num2 = new Scanner(System.in);
    int num1 = input.nextInt();
   int  num2 = input.nextInt();
    if (num1 > num2) 
    {
    System.out.println("The bigger of the two numbers is: "+num1);
    }
    if (num2 > num1)
    {
      System.out.println("The bigger of the two numbers is: "+num2);
    }
  else
    {
    System.out.println("Trick question, they are equal.");
   }
    input1.close();
  }
}