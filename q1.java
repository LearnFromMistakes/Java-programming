import java.util.Scanner;
class q1{
    public static void main(String[] args)
    {
        Scanner kavins = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = kavins.nextLine();
        System.out.print("Enter your age: ");
        int age = kavins.nextInt();
        kavins.nextLine();
        System.out.print("Enter your address: ");
        String address = kavins.nextLine();

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.print("My address is "+address);
    }
}