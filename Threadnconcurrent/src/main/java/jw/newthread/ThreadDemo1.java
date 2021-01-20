package jw.newthread;


public class ThreadDemo1
{
    public static void main(String args[]) throws Exception
    {
        new TestThreada1().start();
        while(true)
        {
            System.out.println("main thread is running");
            Thread.sleep(1000);
        }
    }
}

class TestThreada1 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println(" TestThreada1 is running");
            try {
                Thread.sleep(1000); //1000毫秒
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
