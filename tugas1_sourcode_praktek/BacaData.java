// NIM : 13020210132
// NAMA : RIRIN ASTIANI
// HARI/TGL/WAKTU : MINGGU, 05 MARET 2023 13:03

import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {
	/**
	* @param args
	*/
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner (System.in);
		a = masukan.nextInt (); /* coba ketik : masukan.nextInt();
		Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}