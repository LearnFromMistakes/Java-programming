import java.util.Scanner;
class conditional{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 == num2)
        {
            System.out.println("Both values are equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}