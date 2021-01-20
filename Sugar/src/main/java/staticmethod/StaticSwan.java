package staticmethod;

public class StaticSwan implements StaticAnimal {
	
	public static void main(String[] args) {
	move();
//		new StaticSwan().move();
	}



	public static void move()
	{
		System.out.println("I can fly");
	}
}


