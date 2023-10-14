import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Rock, Paper, Scissors");
    System.out.println("user 1 - enter your choice (rock, paper, scissors)"); 
    System.out.println("user 2 - enter your choice (rock, paper, scissors)");  
    Scanner input = new Scanner(System.in);
    String user1rock = input.nextLine();
    String user1paper = input.nextLine();
    String user1scissors = input.nextLine();
    String user2rock = input.nextLine();
    String user2paper = input.nextLine();
    String user2scissors = input.nextLine();

     if (user1rock.equals("rock"))
      {
          if (user2paper.equals ("paper"))
          {
              System.out.println("user2 has won");
          }
          if (user2rock.equals ("rock"))
          {
              System.out.println("Tie");
          }
          if (user2scissors.equals ("scissors"))
          {
              System.out.println("user1 has won");
          }
      }
      else if (user1paper.equals("rock"))
        {
            if (user2scissors.equals ("scissors"))
            {
                System.out.println("user2 has won");
            }
            if (user2paper.equals ("paper"))
            {
                System.out.println("Tie");
            }
            if (user2rock.equals ("rock"))
            {
                System.out.println("user1 has won");
            }
        }
      else (user1scissors.equals("scissors"))
    {
        if (user2rock.equals ("rock"))
        {
            System.out.println("user2 has won");
        }
        if (user2scissors.equals ("scissors"))
        {
            System.out.println("Tie");
        }
        if (user2paper.equals ("paper"))
        {
            System.out.println("user1 has won");
        }
    }
  }
}