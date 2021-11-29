import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test2() {
		
		Prime p = new Prime();
		boolean isPrime = p.isPrime(2);
		assertTrue("Failed", isPrime);
		
	}
	
	@Test
	public void test3() {
		
		Prime p = new Prime();
		boolean isPrime = p.isPrime(3);
		assertTrue("Failed", isPrime);
		
	}
	
	@Test
	public void test4() {
		
		Prime p = new Prime();
		boolean isPrime = p.isPrime(4);
		assertTrue("Failed", isPrime);
		
	}
	
	@Test
	public void test5() {
		
		Prime p = new Prime();
		boolean isPrime = p.isPrime(5);
		assertTrue("Failed", isPrime);
		
	}
	
	@Test
	public void test6() {
		
		Prime p = new Prime();
		boolean isPrime = p.isPrime(6);
		assertTrue("Failed", isPrime);
		
	}

}
