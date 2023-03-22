import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double pierwsza_liczba;
    double druga_liczba;
    Scanner wej = new Scanner(System.in);
    System.out.println("Podaj pierwsza liczbe: ");
    pierwsza_liczba = wej.nextDouble();
    System.out.println("Podaj druga liczbe: ");
    druga_liczba = wej.nextDouble();
    System.out.println(pierwsza_liczba + druga_liczba);
    System.out.println(pierwsza_liczba - druga_liczba);
    System.out.println(pierwsza_liczba * druga_liczba);
    if (druga_liczba != 0)
    {System.out.println(pierwsza_liczba/druga_liczba);}
    else
    {System.out.println("Blad - nie mozna dzielic przez 0");}
  }
}