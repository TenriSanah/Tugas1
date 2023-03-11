// Nama : tenri sa'nah
// NIM : 13020210164
// HARI/TGL/WAKTU : KAMIS, 09 MARET 2023 21.55

public class OperatorRelasionalNumerik {

	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		
		int i = 5;
		int j = 10;
		
		System.out.println("i = " + i);
       		System.out.println("j = " + j);

		TF = (i == j) ;
		System.out.println("i == j : "+ TF);

		TF = (i != j) ; 
		System.out.println("i != j = "+ TF);
 
		TF = (i < j) ;
		System.out.println("i < j = "+ TF);
		
		TF = (i > j);
		System.out.println("i > j = "+ TF);

		TF = (i <= j);
        	System.out.println("i <= j : " + TF);

		TF = (i >= j);
        	System.out.println("i >= j : " + TF);
	}
}