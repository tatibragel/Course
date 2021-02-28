package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault( Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
				
		System.out.println("Entre com os lados do triandulo X:");
		x.a =sc.nextDouble();
		x.b =sc.nextDouble();
		x.c =sc.nextDouble();
		
		System.out.println("Entre com os lados do triandulo Y:");
		y.a =sc.nextDouble();
		y.b =sc.nextDouble();
		y.c =sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do trinagulo X : %.4f%n", areaX);
		System.out.printf("Área do trinagulo Y : %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A área maior é do triângulo : X");
		}else {
			System.out.println("A área maior é do triângulo : Y");

		}
		
		sc.close();
		

	}

}
