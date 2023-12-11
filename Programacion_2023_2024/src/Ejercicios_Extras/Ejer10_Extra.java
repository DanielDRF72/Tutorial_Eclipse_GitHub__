package Ejercicios_Extras;

import java.util.Scanner;

public class Ejer10_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=0, v, i = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número");
			i=sc.nextInt(); 
			for(n=1;n<=i;n++) {
			v=1; 
			System.out.print(n + "! = ");
			for (int K=n; K>=1; K--) { 
				if (K>1) { 
					v=v*K; 
					System.out.print(K+"x");
				}
				else 
					System.out.print(K);
			}
			System.out.println("=" + v);

				}
			}

		}

	

