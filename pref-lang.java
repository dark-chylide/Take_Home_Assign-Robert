import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("What is your prefered language? (enter e for english, f for french, g for german, and s for spanish");
    Scanner input = new Scanner(System.in);
    String english = input.nextLine();
    String french = input.nextLine();
    String german = input.nextLine();
    String spanish = input.nextLine();
    if (english.equals("e")) 
    {
      System.out.println("Hello");
  }
    else if (french.equals("f"))
    {
      System.out.println("Bonjour");
    }
    else if (german.equals("g"))
    {
      System.out.println("Hallo");
    }
    else if (spanish.equals("s"))
    {
      System.out.println("Hola");
    }
    else
    {
      System.out.println("Sorry, I don't speak that language");
    }
  }
}