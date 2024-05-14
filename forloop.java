import java.util.Scanner;
class forloop
{
    public static void main(String[] args)
    {
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int b = scan.nextInt();

        // for(int i=a; i<=b;i=i+1)
        // {
        //     System.out.println(i);
        // }
    //     int count = 0;
    //     for(int i =1;i<=10;i+=1)
    //     {
    //         if(i%2==1)
    //         {
    //             count+=1;
    //         }
    //     }
    //     System.out.println(count);
    for(int i=1;i<=100;i+=1)
    {
        if(i%3==0 && i%5==0)
        {
            System.out.println("Both divsible by 3 and 5 "+i);
        }
    }





    }
}