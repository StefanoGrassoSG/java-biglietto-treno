package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final double price = 0.21;
		
		System.out.println("quanti chilometri vuoi percorrere?: ");
		String km1 = in.nextLine();
		int km2 = Integer.valueOf(km1);
		
		System.out.println("quanti anni hai?: ");
		String age1 = in.nextLine();
		int age2 = Integer.valueOf(age1);
		
		double finalPrice = km2 * price;
		final double discount20 = finalPrice * 0.20;
		final double discount40 = finalPrice * 0.40;
		double finalPrice2 = finalPrice - discount20;
		double finalPrice3 = finalPrice - discount40;
		
		if(age2 <= 18) {
			System.out.println("il prezzo del biglietto è: " + finalPrice2);
		}
		else if(age2 >= 65) {
			System.out.println("il prezzo del biglietto è: " + finalPrice3);
		}
		else {
			System.out.println("il prezzo del biglietto è: " + finalPrice);
		}
		
		in.close();
		
	}
}
