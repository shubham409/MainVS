class Table
{
    public synchronized void printTable(int i)
    {
        for (int j = 0; j < 5; j++) {
            System.out.println(j*i);
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MyThread1 extends Thread
{
    Table obj;
    MyThread1(Table o)
    {
        obj=o;
    }
    public void run()
    {
        obj.printTable(7);
    }
}
class MyThread2 extends Thread
{
    Table obj;
    MyThread2(Table o)
    {
        obj=o;
    }
    public void run()
    {
        obj.printTable(10);
    }
}
public class TestSync {
    public static void main(String[] args) {
        Table o=new Table();
        MyThread1 t1 = new MyThread1(o);
        MyThread2 t2 = new MyThread2(o);
        t1.start();
        t2.start();
    }
}
