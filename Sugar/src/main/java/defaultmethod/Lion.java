package defaultmethod;

public class Lion implements Animal, NewAnimal {

	public static void main(String[] args) {
		new Lion().move();

	}

	//��ʵ�ֵ�2���ӿڶ�����ͬ����������������һ����Ĭ�Ϸ���
	//��������Ҫ��д�÷�������������
	public void move() {
		NewAnimal.super.move();		
	}	

}
