import java.util.Scanner;
class practice2
{
    public static void main(String[] args)
    {
        System.out.println("Enter your salary details: ");
        // System.out.println("red|yellow|Green -> choose any one for traffic");
        Scanner scan = new Scanner(System.in);

        int salary = scan.nextInt();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();


        if(salary >= 20000 || age <= 25)
        {
            System.out.println("you are eligible for loan");
            System.out.println("Enter your required loan amount:");
            int loan = scan.nextInt();
            if(loan <= 50000)
            {
                System.out.println("loan available ");
            }
            else if (loan >50000)
            {
                System.out.println("Maximum loan amount is 50000");
            }
        }
        else
        {
            System.out.println("you are not eligible for loan");
        }


        // String traffic = scan.nextLine();

        // int s1 = scan.nextInt();
        // int s2 = scan.nextInt();
        // int s3 = scan.nextInt();
        // int s4 = scan.nextInt();
        // int s5 = scan.nextInt();

        // int sum = s1+s2+s3+s4+s5;
        // int avg = sum/5;

        // if(score<50)
        // {
        //     System.out.println("you need to improve");
        // }
        // else if(score>=50 && score<=70)
        // {
        //     System.out.println("Good job");
        // }
        // else if(score>70)
        // {
        //     System.out.println("Excellent");
        // }
        // if(avg<35)
        // {
        //     System.out.println("you need to addtional class"+);
        // }
        // else
        // {
        //     System.out.println("you are good to go" + avg);
        // }

        // if(traffic.equals("red"))
        // {
        //     System.out.println("Stop");
        // }
        // else if(traffic.equals("yellow"))
        // {
        //     System.out.println("ready");
        // }
        // else if (traffic.equals("green"))
        // {
        //     System.out.println("Go");
        // }
    }
} 