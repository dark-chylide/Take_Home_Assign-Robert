import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    String name1 = "Robert";
    String name2 = input.nextLine();
    
    if(name1.equals(name2))
    {
      System.out.println("Identity theft confirmed");
    }
    else
    {
      System.out.println("No identity theft");
    }
  }
}