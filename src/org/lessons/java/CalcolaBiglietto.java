package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final double PRICE = 0.21;
		
		System.out.println("quanti chilometri vuoi percorrere?: ");
		String km1 = in.nextLine();
		int km2 = Integer.valueOf(km1);
		
		System.out.println("quanti anni hai?: ");
		String age1 = in.nextLine();
		int age2 = Integer.valueOf(age1);
		
		double finalPrice = km2 * PRICE;
		final double DISCOUNT20 = finalPrice * 0.20;
		final double DISCOUNT40 = finalPrice * 0.40;
		double PriceDiscount20 = finalPrice - DISCOUNT20;
	    String prezzoFormattato20 = String.format("%.2f", PriceDiscount20);
	
		double PriceDiscount40 = finalPrice - DISCOUNT40;
		String prezzoFormattato40 = String.format("%.2f", PriceDiscount40);
		
		if(age2 <= 18) {
			System.out.println("il prezzo del biglietto è: " + prezzoFormattato20);
		}
		else if(age2 >= 65) {
			System.out.println("il prezzo del biglietto è: " + prezzoFormattato40);
		}
		else {
			System.out.println("il prezzo del biglietto è: " + finalPrice);
		}
		
		in.close();
		
	}

}
