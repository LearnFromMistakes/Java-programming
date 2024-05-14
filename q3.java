import java.util.Scanner;
class q3{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int score = scan.nextInt();
        float score1 = score/10;
        scan.nextLine();
        String Dept = scan.nextLine();


        System.out.println("My name is "+name);
        System.out.println("My score is "+score1+"/10");
        System.out.println("My dept is "+Dept);

    }
}