package multipleexception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptionTest {

	public static void main(String[] args) {
		try
		{
			test();
		}
		catch(IOException ex)
		{
			//�쳣����
		}
		catch(SQLException ex)
		{
			//�쳣����
		}
		
		
		try
		{
			test();
		}
		catch(IOException | SQLException ex)
		{
			//JDK7��ʼ��֧��һ��catchд����쳣
			//�쳣����
		}
		
		try
		{
			test2();
		}
		catch(IOException ex)
		{
			//JDK7��ʼ��֧��һ��catchд����쳣
			//�쳣����
		}

	}
	
	public static void test() throws IOException, SQLException {  
    } 
	public static void test2() throws IOException, FileNotFoundException {  
    } 
}
