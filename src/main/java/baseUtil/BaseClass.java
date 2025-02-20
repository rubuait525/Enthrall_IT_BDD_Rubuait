package baseUtil;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.CommonActions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Dashboard;
import pages.Login;

import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
	public static WebDriver driver;
	public  static Login login; // we make login static otherwise it will show nullPointer exception
	public static Dashboard dashboard;
	// We don't use annotation here. Annotation is used in hook class
	// because step definition class extends base class, if base class contains
	// annotation,
	// it will show exception [Null Pointer] because step definition class contain
	// annotation too
	Configuration configuration;


	// 1)note = we cannot use annotation because in src/test and
	// loginStepsDefination have also annotation
	// 1)because of junit so if we put annotation in base class it will create null
	// pointer exception

	public void setUp() {
		configuration = new Configuration();
		initDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProperties(URL));
		// How can we convert a String to Long type
		long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClass(driver);
	}

	// TODO: Need to check again
	// BASED ON VALUE OF TESTSUITE, BROWSER WILL BE CHOOSEN

	// If any reason, in our test suit, parameter value is absent,
	// default: WebdriverManager is instantiating the ChromeDriver

	// spelling mistake in testng.xml suite, then browser will not match and get the
	// default one
	// default: WebdriverManager is instantiating the ChromeDriver

	// If we run test from any TestClass, which browser will run when browser is
	// absent in .config file?
	// Edge. why? browser is absent in config.properties file, so it will take from
	// @Optional(EDGE)

	public void initDriver() {
		String browserName = configuration.getProperties(BROWSER); // we take browser from configuration class because
																	// we dont have any test suit

		switch (browserName) {
		case CHROME:
			// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			driver = new ChromeDriver();
			break;

		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
			driver = new FirefoxDriver();
			break;

		case EDGE:
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver");
			driver = new EdgeDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			// System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
			// driver = new ChromeDriver();
			break;
		}
	}

	public void initClass(WebDriver driver) {

		login = new Login(driver); // we instentiate login class so we have login perametarise contructor in login
									// class so driver is perameter
		dashboard = new Dashboard(driver);
	}

	public void tearUp() {
		driver.quit();
	}

}
