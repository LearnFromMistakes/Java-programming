class FunctionWithParameter
{
    void getsoap(int money)
    {
        System.out.println(money);
        System.out.println("soap purchased");
    }
    void getchocolate(int money)
    {
        System.out.println(money);
        System.out.println("Chocolate Purchased");
    }
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String[] args)
    {
        FunctionWithParameter obj = new FunctionWithParameter();
        obj.getsoap(20);
        obj.getchocolate(40);
        obj.sum(2,3);
        obj.sub(2,3);
        obj.mul(2,3);
        obj.div(2,3);
    }
}