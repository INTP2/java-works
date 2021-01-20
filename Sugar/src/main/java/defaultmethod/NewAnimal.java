package defaultmethod;

public interface NewAnimal {
	public default void move()
	{
		System.out.println("I can move.");
	}
	
	//������дObject�ķ���
//	public default String toString()
//	{
//		return "aaa";
//	}
}


