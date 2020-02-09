

abstract class restaurant
{
    abstract void item();
    abstract void cost();
    void display()
    {
        System.out.println("THE ITEM PREPARED FOR 15 DAYS");
    }
}
class school extends restaurant
{
    void item()
    {
        System.out.println("THE ITEM NAME IS CHICKEN");
    }
    void cost()
    {
        System.out.println("COST OF THE ITEM IS 100 RS");
    }
}
class collage extends restaurant
{
    void item()
    {
        System.out.println("THE ITEM NAME IS MUTTON");
    }
    void cost()
    {
        System.out.println("COST OF THE ITEM IS 200 RS");
    }
}
class example
{
    public static void main(String args[])
    {
        restaurant c;
        c=new school();
        c.item();
        c.display();
        c.cost();
        c=new collage();
        c.item();
        c.display();
        c.cost();
       
    }
}