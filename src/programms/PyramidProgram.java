package programms;

import java.util.Scanner;

public class PyramidProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int noofrows = sc.nextInt();
		int rowcount = 1;
		for (int i = noofrows; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= rowcount; j++) {

				System.out.print(rowcount + " ");
			}
			System.out.println("");
			
			rowcount++;

		}
		// Other static program
		rightangletri(noofrows);
		anotherpyramid(noofrows);
	}
	private static void rightangletri(int noofrows) {
		// TODO Auto-generated method stub
		System.out.println("Right angle traingle");
		int addrowcount = 1;
		for (int i = 1; i <= noofrows; i++) {

			for (int j = 1; j <= addrowcount; j++) {

				System.out.print(addrowcount+" ");
			}
			System.out.println("");
			
				addrowcount++;

		
		
	}}
	
		private static void anotherpyramid(int noofrows) {
			int addrowcount = 1;
		
			for (int i = 1; i <= noofrows; i++) {

				for (int j = 1; j <= 2*i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= addrowcount; j++) {

					System.out.print(addrowcount+" ");
				}
				System.out.println("");
				
					addrowcount++;
			
		}

	
	}}






