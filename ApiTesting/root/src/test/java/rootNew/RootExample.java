package rootNew;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class RootExample {

	@Test
	public void bhigh() {
		System.out.println("first");
	}

	@Test(dependsOnMethods = "bhigh")
	public void ahigh() {
		System.out.println("second");
	}

	@Test(dependsOnMethods = "ahigh")
	public void chigh() {
		System.out.println("third");
	}

	@Test
	public void dhigh() {
		System.out.println("fourth");
	}
}
