import java.util.Scanner;
class nestedforloop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        for(int t=1; t<=3;t++)
        {
            for(int i =1;i<=t;i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}