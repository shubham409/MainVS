
class First
{
    public synchronized void increment()
    {
        int count=0;
        for(int i=1;i<10;i++)
        {
            count++;
            System.out.println("count is =" + count);
        }
    }
}
class Second extends Thread
{
    First o;
    Second(First o)
    {
        this.o=o;
    }
    public void run()
    {
        o.increment();
    }
}
public class Sync
{    
    public static void main(String[] args)
    {
        First obj =new First();
        Second tw1 =new Second(obj);
        Second tw2 =new Second(obj);

        tw1.start();
        tw2.start();
    }
}