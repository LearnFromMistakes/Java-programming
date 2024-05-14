import java.util.Scanner;
class Elseif
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if(mark>35 && mark<65)
        {
            System.out.println("you got playstation");
        }
        else if(mark>65 && mark <90)
        {
            System.out.println("you got iphone");
        }
        else if(mark>90 && mark<100)
        {
            System.out.println("you got mac");
        }

    }
}