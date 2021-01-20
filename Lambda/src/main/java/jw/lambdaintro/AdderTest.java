
public class AdderTest {

	public static void main(String[] args) {
		Adder  c1 = 
				x -> 
				{
					x++;
				};
				
		Adder  c2 =
				x ->
				{
					if(x>0)
						return x+1;
				};
	}

}
