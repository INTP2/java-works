package jw.newthread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Mycall {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Greeting greeting=new Greeting();
        GreetingTask greetingTask = new GreetingTask(greeting);
        Thread thread1= new Thread(greetingTask);
        thread1.start();
        Greeting greeting1 = greetingTask.get();
        System.out.println("获取运行结果："+greeting);
    }
}
class Greeting implements Callable {

    public Object call() throws Exception {
        System.out.println("start running callable task");
        return "hello, world";
    }

}
class GreetingTask extends FutureTask<Greeting> {

    public GreetingTask(Callable<Greeting> callable) {
        super(callable);
    }
}