package baseUtil;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.How;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class HookClass {
	static BaseClass baseClass; // 1) although we can not use annotation in base class we made a hookClass in
								// 1) baseUtil so that we we annotation here and we intanstiate base class to
								// 1) connect base class

	@BeforeAll
	// @beforeAll ,@Before,@After ,@AfterAll come from cucumber
	public static void beforeAllTest() { // 1) we made all method static because line 13 Baseclass is static
		baseClass = new BaseClass(); // 1) in this method we makesure that before all test BaseClass must be
										// intanstiate
										// 1) so that we can access all stuff from base class
										// 1)basically we make arelation with base class
	}

	@Before
	public void beforeEachTest() {
		baseClass.setUp(); // and here before every test setup mathod will call and will
							// do(configaration,initDriver,window maximus and will call login method
	}

	@After
	public void afterEachTest(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] bytes = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(bytes, "image/png", "error.png"); // How to take screenshot?
																// ans: we have a interface TakeScreenShot and it has a
																// method getScreenshotAs this is how we take screenshot.
		}
		baseClass.tearUp();//if after test fail it will take screenshot otherwise it comes to baseClass tearUp()
	}

	@AfterAll
	public static void afterAllTest() { //and finally this method will  execute to null base class
		baseClass = null;
	}

}
