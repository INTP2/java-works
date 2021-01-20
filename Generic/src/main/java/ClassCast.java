import java.util.ArrayList;

public class ClassCast {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("456");
		list.add(789);
		
		for(Object o:list)
		{
			//�������ͨ��  ���б���
			System.out.println(((String) o));
		}
	}

}
