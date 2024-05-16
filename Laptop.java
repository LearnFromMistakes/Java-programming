import java.util.Scanner;
public class Laptop
{
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;
    public static void main(String[] args)
    {
        Laptop lap1 = new Laptop();
        Scanner scan = new Scanner(System.in);
        lap1.name = scan.nextLine();
        lap1.proc = scan.nextLine();
        lap1.ram = scan.nextInt();
        lap1.price = scan.nextInt();
        System.out.println("---------------------");
        System.out.println(lap1.name);
        System.out.println(lap1.proc);
        System.out.println(lap1.price);
        System.out.println(lap1.ram);
    }
}