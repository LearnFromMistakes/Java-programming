import java.util.Scanner;
class Array
{
    public static void main(String[] args)
    {
        // int[] score = new int[5];

        // Scanner scan = new Scanner(System.in);

        // score[0] = scan.nextInt();
        // score[1] = scan.nextInt();
        // score[2] = scan.nextInt();
        // score[3] = scan.nextInt();
        // score[4] = scan.nextInt();

        // int sum = 
        // System.out.println(score[3]);


        // int[] mark = new int[5];
        // Scanner scan = new Scanner(System.in);

        // for(int i = 0;i<5;i=i+1)
        // {
        //     mark[i] = scan.nextInt();
        // }
        // for(int i =0;i<5;i+=1)
        // {
        //     System.out.println(mark[i]);
        // }

        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // for(int i = 1;i<=arr.length;i++)
        // {
        //     System.out.println(i);
        // }
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of the array: ");
        // int n = scan.nextInt();

        // for(int i =1;i<=10;i++)
        // {
        //     System.out.println(i+"x"+n+"="+i*n);
        // }
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<=size-1;i++)
        {
            arr[i] = scan.nextInt();
        }
        int h = size/2;
        
        System.out.println(arr[h]);




 

    }
}