package rootNew;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class secondClass {

	@Test(priority = 2)
	public void ant() {
		System.out.println("first");
	}

	@Test(priority = 3)
	public void kumar() {
		System.out.println("second");
	}

	@Test(priority = 1)
	public void value() {
		System.out.println("third");
	}

}
