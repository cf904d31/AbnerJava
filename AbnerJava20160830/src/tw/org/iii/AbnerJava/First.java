package tw.org.iii.AbnerJava;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "10";   //�i�H�ϥ�int , byte , short , char , String 
		switch(a){         //�bswitch���L�k�ϥ�Long�ŧi���ƭ�
			case "1":
				System.out.println("A");
				break;
			case "10":
				System.out.println("B");
				break;
			case "100":
				System.out.println("C");
				break;
			default:
				System.out.println("D");
				break;
		}
		
		int x = 10;
		//int y = 9;  //case���L�k�ϥ��ܼƨӧP�O
		final int y = 11;  //�[�Wfinal�Ny�ܼ��ܬ��`�ƧY�i
		switch(x){        
		case 1:
			System.out.println("A");
			break;  //break�i�ٲ� ���|�ɭP�{���~�����U�h�Ӥ��|���_
		case y+10:
			System.out.println("B");
			break;
		case 100:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
		
		
		//------------�P�_�X�릳�h�֤�-------------------
		
		int month = 5;
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(month+"�릳31��");
				break;
			case 2:
				System.out.println(month+"�릳28��");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(month+"�릳30��");
				break;
		}
	}

}
