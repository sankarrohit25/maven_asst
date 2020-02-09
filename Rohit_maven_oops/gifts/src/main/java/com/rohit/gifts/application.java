package com.rohit.gifts;
import com.rohit.gifts.sweets.*;
import java.util.ArrayList;
public class application<Sweet> {
    private GenC gc;
    ArrayList<Sweet> sweets;
    public application()
    {
        gc=new GenC();
    }
    private void process()
    {
        int n= (int) (Math.random()*10);
        gc.generateGift(n);
    }
    public void start()
    {
        process();
    }
}
