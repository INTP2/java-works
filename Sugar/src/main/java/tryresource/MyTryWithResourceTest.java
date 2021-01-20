package tryresource;

public class MyTryWithResourceTest {

	public static void main(String[] args) {
		
		//�����Զ�����conn��close����
		try(MyConnection conn = new MyConnection())
		{
			conn.sendData();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}

class MyConnection implements AutoCloseable {
	 public void sendData() throws Exception {
		 System.out.println("Send Data....");
	 }
	 
	 public void close() throws Exception {
		 System.out.println("Close....");
	 }
}
