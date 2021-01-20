
public class Outer4 {

	String name;
	
	//匿名内部类
	public void f1() {
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("hello");
			}
		}).start();
	}
}
