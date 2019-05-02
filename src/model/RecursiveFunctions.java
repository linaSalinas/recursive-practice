package model;

public class RecursiveFunctions {

	public static long factorial(int numero) {
		
		if (numero == 0) {
			return 1;
		} 
		else {
			return numero * factorial(numero - 1);
		}
	}


	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		else { 
			return fibonacci(n-1) + fibonacci(n-2);
		}

	}

	public static int arraySummatory(int [] A, int n) {
		
		if( n==0) {
			return A[0];
		}
		else
		{
			return A[n]+arraySummatory(A, n-1);
		}

	}

}
