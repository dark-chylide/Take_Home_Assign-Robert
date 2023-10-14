import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("What city in Ontario are you from?");
     Scanner input = new Scanner(System.in);
    String Toronto = input.nextLine();
    String Missisauga = input.nextLine();
    String Oakville = input.nextLine();
    String Brampton = input.nextLine();
   
    if(Toronto.equals("Toronto"))
    {
      System.out.println("Toronto was north america's safest city if 2021");
    }
    else if(Missisauga.equals("Missisauga"))
      {
      System.out.println("Mississauga is an Ojibwa word meaning “River of the North of Many Mouths”");
      }
    else if(Oakville.equals("Oakville"))
    {
      System.out.println("Oakville has a population of over 171,000 but has chosen to remain a Town");
    }
    else if(Brampton.equals("Bramton"))
    {
      System.out.println("Brampton is home to Canada’s largest experimental farm, the Peel Farm");
    }
    else
    {
      System.out.println("Sorry, i do not have any info on that city/town :/");
    }
  }
}