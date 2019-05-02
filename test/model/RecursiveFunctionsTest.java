package model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {
	
	private RecursiveFunctions recursiveFunctionsTest;

	@Test
	public void testFactorial() {
		
		assertEquals("El numero el se ingreso no es el numero que se espera", 1, recursiveFunctionsTest.factorial(0));
		assertEquals("El numero el se ingreso no es el numero que se espera", 362880, recursiveFunctionsTest.factorial(9));
		assertEquals("El numero el se ingreso no es el numero que se espera", 120, recursiveFunctionsTest.factorial(5));
		assertEquals("El numero el se ingreso no es el numero que se espera", 2, recursiveFunctionsTest.factorial(2));
		assertEquals("El numero el se ingreso no es el numero que se espera", 3628800, recursiveFunctionsTest.factorial(10));
		
	}
	@Test
	public void testarraySummatory() {
		
		int[] arreglo = {1,3,5,3,7};
		
		assertEquals("El numero que se ingreso no es el que se espera", 19, recursiveFunctionsTest.arraySummatory(arreglo, arreglo.length-1));
		assertEquals("El numero que se ingreso no es el que se espera", 12, recursiveFunctionsTest.arraySummatory(arreglo, 3));
		assertEquals("El numero que se ingreso no es el que se espera", 9, recursiveFunctionsTest.arraySummatory(arreglo, 2));
		
	}
	@Test
	public void testFibonacci() {
		
		assertEquals("El numero que se ingreso no es el que se espera", 0, recursiveFunctionsTest.fibonacci(0));
		assertEquals("El numero que se ingreso no es el que se espera", 2, recursiveFunctionsTest.fibonacci(3));
		assertEquals("El numero que se ingreso no es el que se espera", 5, recursiveFunctionsTest.fibonacci(5));
		assertEquals("El numero que se ingreso no es el que se espera", 13, recursiveFunctionsTest.fibonacci(7));
		
	}

}
