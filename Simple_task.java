package com.corejava.KunalKushwana;

import java.util.Scanner;

public class Simple_task {
    public static void main(String[] args) {

        reverse();
    }
    static void mathfunc()
    {
        int a = 10;
        int b = 20;
        int max = Math.max(a,b);
        System.out.println("max value is "+  max);
    }
    static void largest()
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is largest");
        }
        else
        {
            System.out.println("c is largest");
        }
    }

    static void AlphaCaseCheck()
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if(ch >='a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Upper case");
        }
    }
    static  void fibonoci(int n)
    {
        int a = 0;
        int b = 1;

        for(int i = 2;i<=n;i++)
        {
            int temp = b;

            b = a+b;

            a = temp;

        }
        System.out.println(b);
    }

    static  void occurance(int n)
    {
        int[] arr = {1,2,3,2,4,2,5,3};
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == n)
            {
                count = count+1;
            }
        }
        System.out.println("the occurance of " +n+ " is " + count);
    }


    static void occurance_without_arr(int occ)
    {
        int n = 12323422;
        int count = 0;
        while(n>0)
        {
            int rem  = n%10;
            if(rem == occ)
            {
                count+=1;
            }
            n = n/10;
        }
        System.out.println(count);
    }

    static void reverse()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while(n>0)
        {
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
