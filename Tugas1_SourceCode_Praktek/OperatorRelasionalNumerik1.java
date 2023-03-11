// Nama : tenri sa'nah
// NIM : 13020210164
// HARI/TGL/WAKTU : MINGGU, 09 MARET 2023 20.47

public class OperatorRelasionalNumerik1 {

	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		
		int x = 5;
		int y = 10;
		
		System.out.println("x = " + x);
        	System.out.println("y = " + y);

		TF = (x != y);
        	System.out.println("x != y : " + TF);

        	TF = (x < y);
        	System.out.println("x < y  : " + TF);

       		TF = (x > y);
        	System.out.println("x > y  : " + TF);

        	TF = (x <= y);
        	System.out.println("x <= y : " + TF);

        	TF = (x >= y);
        	System.out.println("x >= y : " + TF);
	}
}