package qwe;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 예외 처리 떠넘기기 
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz =Class.forName("java.long.String2");
	}
}
