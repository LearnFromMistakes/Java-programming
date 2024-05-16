class Functions
{
     void greetings()
    {
        System.out.println("Vanakam");
        // Functions obi = new Functions();
        // obi.hi();
        hi();
    }
    void hi()
    {
        System.out.println("hi");
    }
    // we cannot call the non static function into an static function
    // to call non static function we create an object and call the function name
    public static void main(String[] args)
    {
        Functions obj = new Functions();
        obj.greetings();
    }
}