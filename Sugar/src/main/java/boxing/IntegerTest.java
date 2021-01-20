package boxing;
import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args)
	{
		Integer obj1 = 5;  //�Զ�װ��
		Integer obj2 = Integer.valueOf(5);
		
		int a1 = obj1;     //�Զ�����
		int a2 = obj1.intValue();
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(Integer.valueOf(2));
		
		int a3 = list.get(1);
		int a4 = list.get(1).intValue();
		
		
	}
}
