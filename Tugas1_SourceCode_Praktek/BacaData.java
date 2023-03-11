// Nama : tenri sa'nah
// NIM  : 13020210164
// HARI/TGL/WAKTU : KAMIS, 09-Maret-2023 16.02

import java.util.Scanner;
public class BacaData {

	public static void main (String[] args) {

		int a;
		Scanner masukan;

		System.out.print ("Contoh membaca dan menulis, ketik nilaiinteger: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); 
		
		System.out.print ("Nilai yang dibaca : "+ a);
	}

}