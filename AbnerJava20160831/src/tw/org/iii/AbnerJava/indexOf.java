package tw.org.iii.AbnerJava;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TWId a = new TWId();
		System.out.println(a.getId());
		if (TWId.isRight(a.getId())) {
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}
	}

}
