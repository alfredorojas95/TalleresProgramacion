/**
 * 
 */
package main.java.ejemplo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author wilfri
 *
 */
public class AppTest {

	/**
	 * Test method for {@link main.java.ejemplo.App#sumatoria(int[])}.
	 */
	@Test
	public void testSumatoria() {
	App app = new App();
	int[] var = {1, 2, 3, 4, 5};
	int num = app.sumatoria(var);
	assertTrue(num == 15);
	//assertTrue(num == 10);
	}
	@Test 
	public void testFactorial(){
		App app = new App();
		int num = app.factorial(3);
		assertTrue (num==6);
	}

	/**
	 * Test method for {@link main.java.ejemplo.App#resta(int, int)}.
	 */
	@Test
	public void testResta() {
	assertTrue(new App().resta(1,1) == 0);
	// assertTrue(new App().resta(1,1) == 1);
	}

}
