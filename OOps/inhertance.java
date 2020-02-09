class restaurant
{
    String available="raju" ;
    void available()
    {
        System.out.println("the items available are");
       
    }
}
class restaurant1 extends restaurant
{
    String another="suresh";
    public static void main(String args[])
    {
      restaurant1 obj = new restaurant1();
     
      obj.available();
      System.out.println(obj.another);
      System.out.println(obj.available);
    }
}
