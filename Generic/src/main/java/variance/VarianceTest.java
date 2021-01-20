package variance;

import java.util.ArrayList;

public class VarianceTest {

	public static void testList() {
		ArrayList<A> list1 = new ArrayList<>();
		list1.add(new B());
		
		ArrayList<A> list2 = list1;  
		//compile error
		
		ArrayList<? extends A> list3 = new ArrayList<B>();   //Ð­±ä
		ArrayList<? super B> list4 = new ArrayList<A>();      //Äæ±ä

		
	}
	public static void testArray() {
		B[] array1 = new B[1];
		array1[0] = new B();

		A[] array2 = array1;

		try {
			array2[0] = new A(); 
			// compile ok, runtime error
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			array2[0] = new C(); 
			// compile ok, runtime ok
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
/*	public static void testArrayAndList()
	{
		B[] r1 = (B[]) test(new ArrayList<B>()); //compile error
		A[] r2 = test(new ArrayList<B>()); //compile error
		Object[] r3 = test(new ArrayList<Object>()); //compile error
		
		A[] r4 = test(new ArrayList<A>());
		Object[] r5 = test(new ArrayList<A>());
	}
	
	public static A[] test(ArrayList<A> list)
	{
		return new A[1];
	}
	*/

}
