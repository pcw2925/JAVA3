package qwe;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // ���� ó�� ���ѱ�� 
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ ���������ʽ��ϴ�");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz =Class.forName("java.long.String2");
	}
}
