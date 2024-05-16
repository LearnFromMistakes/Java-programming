public class Mobile
{
    int apple_price = 20;
    int apple_count = 5;
    void iphone()
    {
        System.out.println("This is Iphone");
        Oppo();
        Mi();
    }
    void Oppo()
    {
        System.out.println("This is Oppo");
    }
    void Mi()
    {
        System.out.println("This is Mi");
    }
    void sum()
    {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }
    void total_money()
    {
        System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args)
    {
        Mobile obj = new Mobile();
        obj.total_money();
    }
}