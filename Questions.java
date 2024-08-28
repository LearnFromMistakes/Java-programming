public class Questions {

    public static void main(String[] args) {
//        PrimneOrNot(3);

//        Reverse(123);

//        Amstrong(15);

        for(int i = 100; i < 1000; i++)
        {
            if(Amstrong(i))
            {
                System.out.println(i);
            }
        }
    }

    static void PrimneOrNot(int n)
    {
        int count = 0;
        for(int i = 1; i<=n ; i++)
        {
            if(n%i == 0)
            {
                count+=1;
            }
        }
        if (count==2)
        {
            System.out.println("its prime");
        }
        else
        {
            System.out.println("Not a prime");
        }
    }

    static void Reverse(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }

    }

    static boolean Amstrong(int n)
    {
        int org = n;
        int sum= 0 ;
        while(n>0)
        {
            int rem = n%10; // it takes the last digit ex => 153 => 3
            n = n/10; // it omit the taken last digit ex => 153 => 15
            sum = sum+rem*rem*rem; // it will sum the value in the rem of cube ex => 0+3*3*3 => 27

        }
        if(org == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
//        System.out.println(sum);
    }

}
