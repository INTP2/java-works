package privatemethod;

public interface PrivateAnimal {

	public default void run()
	{
		move();
		move2();
		System.out.println("I can run");
	}
	public default void fly()
	{
		move();
		System.out.println("I can fly");
	}
	private void move()
	{
		//�Ǿ�̬��˽�з���
		System.out.println("I can move");
		System.out.println("I am growing");
	}
	
	public static void run2()
	{
		move2();
		System.out.println("I can run");
	}
	public static void fly2()
	{
		move2();
		System.out.println("I can fly");
	}
	private static void move2()
	{
		//��̬��˽�з���
		System.out.println("I can move");
		System.out.println("I am growing");
	}
	
	
	
	
}
