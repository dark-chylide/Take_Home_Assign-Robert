import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("First Question: What is the sum of 140 and 2304?");
    Scanner input1 = new Scanner(System.in);
    int ans1 = input1.nextInt();
    int answer1 = 2444;
    if(ans1 == 2444)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Incorrect, the answer is "+ answer1);
    }
    System.out.println( "Second Question: What is the product of 34 and 56?");
    Scanner input2 = new Scanner(System.in);
    int ans2 = input2.nextInt();
    int answer2 = 1904;
    if(ans2 == 1904)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Incorrect, the answer is "+ answer2);
    }
  System.out.println("Third Question: What is the quotient of 34 and 56? (rounded to nearest one)");
    Scanner input3 = new Scanner(System.in);
    int ans3 = input3.nextInt();
    int answer3 = 1;
    if(ans3 == 1)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Incorrect, the answer is "+ answer3);
    }
    System.out.println("Thank you for answering these questions.");
   
    input1.close();
  }
}
