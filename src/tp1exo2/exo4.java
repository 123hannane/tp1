package tp1exo2;
import java.util.Scanner;
public class exo4 {
  public static void main(String[] args)  {
      Scanner sc=new Scanner(System.in);
      System.out.println("saisie prenom");
      String prénom=sc.next();
      System.out.println("saisie nom");
      String nom=sc.next();
      System.out.println("Bonjour "+prénom+" "+nom);
  }

}
