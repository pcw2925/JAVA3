package qwe;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반 예외 처리
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("정상수가 존재하지 않습니다");
		}
	}

}
