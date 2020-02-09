



class restaurant
{
    private int itemcost;
    private String owner;
    public int getcost(){
        return itemcost;
    }
   
    public String getownername(){
        return owner;
    }
    public void setitemcost(int n){
        itemcost=n;
    }
   
      public void setownername(String s){
        owner=s;
    }
    }
class dom
{
    public static void main(String args[]){
        restaurant obj= new restaurant();
        obj.setitemcost(9000);
        obj.setownername("suresh");
        System.out.println("owner of restaurant:"+obj.getownername());
        System.out.println("cost of item:"+obj.getcost());
    }
}