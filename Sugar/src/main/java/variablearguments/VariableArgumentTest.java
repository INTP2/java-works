package variablearguments;

public class VariableArgumentTest {

	public static void main(String[] args) {
		print();
		print("aaa");
		print("aaa", "bbb");
		print("aaa", "bbb", "ccc");

	}
	
	public static void print(String... args) {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
	
	//��ֻ��һ������ʱ�����������ȼ�����
	public static void print(String s)
	{
		 System.out.println("I am another method");
	}
	
	//����һ�������������ж���ɱ����
//	public static void print(String... args, int... irgs) 
//	{
//        
//  }
	
	//����һ��������䲻��ͬʱ��2�����ɱ�����ķ�������
//	public static void print(String s1, String... args)
//	{
//		
//	}

}
