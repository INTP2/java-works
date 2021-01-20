package jw.newthread;


public class ThreadDemo2
{
    public static void main(String args[]) throws InterruptedException
    {
        new TestThreadb1().start();
//		while(true)
//		{
//			System.out.println("main thread is running");
//			Thread.sleep(1000);
//		}
    }
}
class TestThreadb1 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("TestThreadb1" +
                    "　is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
