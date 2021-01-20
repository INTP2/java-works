package propertiesload;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ����ResourceBundle���ط�ʽ
 * @author Tom
 * ��JDK9���������У�������������JDK8���У��������룬�޷�����UTF-8�ļ�
 */
public class NameTest {

	public static void main(String[] args) {
		Locale myLocale = Locale.getDefault();
		
		System.out.println(myLocale); //zh_CN 

		// ����ָ������_���һ���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle.getBundle("msg", myLocale);

		// ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("name"));  //������
		
		bundle = ResourceBundle.getBundle("msg2", myLocale);

		// ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("name"));  //���й�

	}

}
