class ReturnFunc
{
    int soap(int money)
    {
        int soap_price = 18;
        int rem = money-soap_price;
        return rem;
    }
    public static void main(String[] args)
    {
        ReturnFunc obj = new ReturnFunc();
        int remainder = obj.soap(20);
        System.out.println(remainder);
    }
}