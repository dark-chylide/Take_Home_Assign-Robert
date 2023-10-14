import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter three numbers:");
    Scanner input = new Scanner(System.in);
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
   
    if (num1 < num2 && num1 < num3) 
    {
    System.out.println(num1 +" is the smallest number");
  }
    else if (num2 < num1 && num2 < num3)
    {
      System.out.println(num2 +" is the smallest number");
    }
    else if(num3 < num1 && num3 < num2)
    {
      System.out.println(num3 +" is the smallest number");
    }
    else 
    {
      System.out.println("There is no smallest number");
    }
  System.out.println("-----------------------------");
    //--------------------------------------------------------
    
    System.out.println("Please enter three more numbers:");
    
    int num4 = input.nextInt();
    int num5 = input.nextInt();
    int num6 = input.nextInt();

    if (num4 > num5 && num4 > num6)
    {
      System.out.println(num4 +" is the largest number");
    }
   else if (num5 > num4 && num5 > num6)
    {
      System.out.println(num5 +" is the largest number");
    }
    else if (num6 > num4 && num6 > num5)
    {
      System.out.println(num6 +" is the largest number");
    }
    else
    {
      System.out.println("There is no largest number");
    }
  }
}