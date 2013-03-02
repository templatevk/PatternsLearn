package decorator;

import java.io.*;

import org.junit.*;

public class CoffeeTest {
	@Ignore
	@Test
	public void test() {
		Beverage beverage = new Expresso();
		Beverage decorator = new Mocha(beverage);
		System.out.println(decorator.getDescription() 
				+ " $" + decorator.cost());
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println(new BufferedReader(
				new InputStreamReader(new LowerCaseInputStream(
						System.in))).readLine());
	}
}
