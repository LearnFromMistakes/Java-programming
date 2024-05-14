import java.util.Scanner;
class practice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // int Mark = scan.nextInt();

        // int Scholar = scan.nextInt();

        // if(Scholar >7000)
        // {
        //     System.out.println("You are eligible for scholarship");
        // }
        // else
        // {
        //     System.out.println(" You are not eligible for scholarship");
        // }
        // int num = scan.nextInt();

        // if(num%3==0 && num%5 == 0  )
        // {
        //     System.out.println("the given num is divisible by 3 and 5");
        // }
        // else
        // {
        //     System.out.println("the given num is not divisible by 3 and 5");
        // }
        int num2 = scan.nextInt();

        if (num2 %2 ==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

    }
}