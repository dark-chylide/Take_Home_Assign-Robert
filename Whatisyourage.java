import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("What is your age?");
    Scanner input = new Scanner(System.in);
    int age = input.nextInt();

    if (age < 13)
    {
      System.out.println("You are a child, and should probably not have access to a computer");
    }
    else if (age < 19 && age > 13)
    {
      System.out.println("You are a teenager");
    }
    else if (age < 65 && age > 19)
    {
      System.out.println("You are an adult");
    }
    else if (age > 65)
    {
      System.out.println("You are a senior");
    }
    else
    {
      System.out.println("You are a baby, and how are you even reading this?!");
    }
 }
}