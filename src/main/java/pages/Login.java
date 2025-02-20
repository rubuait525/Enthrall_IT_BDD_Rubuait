package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;
import static common.CommonActions.*;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // we call pagefactory class so that we can use webelements because
												// webelements are interface so we can not use them directly we use by
												// pageFactory class
	}

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logo;

	@FindBy(xpath = "//a[@id='login-link']")
	WebElement loginLink;
	@FindBy(xpath = "//div[@class='header-bottom']")
	WebElement loginPageHeader;
	@FindBy(xpath = "//input[@name='username']")
	WebElement userEmail;
	@FindBy(xpath = "//input[@name=\'password\']")
	WebElement userPassword;
	@FindBy(xpath = "//button[@id='login']")
	WebElement finalLogin;

	public void validateLogoAndTitle() {
		elementDisplayed(logo);
		verifyTitle(driver, "Enthrall IT");
		pause(2000);

	}

	public void clickLogin() {
		clickElement(loginLink);
	}

	public void validateLoginPage() {
		pause(1000);
		verifyTextOfTheWebElement(loginLink, "Login into your account");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
	}

	public void validateUserEmail() {
		pause(2000);
		verifyTextOfTheWebElement(loginLink, "Login into your account");
		elementDisplayed(userEmail);
		inputText(userEmail, "rubuait525@gmail.com");
		pause(1000);
	}

	public void validatePassword() {
		elementDisplayed(userPassword);
		inputText(userPassword, "Password$1");

	}

	public void validateLoginButton() {
		elementEnabled(finalLogin);
		clickElement(finalLogin);

	}
	public void validateUserEmail(String string) {
		pause(2000);
		//verifyTextOfTheWebElement(loginLink, "Login into your account");
		elementDisplayed(userEmail);
		inputText(userEmail, string);
		pause(1000);
	}

	public void validatePassword(String string) {
		elementDisplayed(userPassword);
		inputText(userPassword, string);

	}

	public void validateDashboardPage() {
		pause(2000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");

	}
	public void loginWithClickLoginFromHomePage() {
		pause(2000);
		clickLogin();
		//loginPageTitleValidation();
		inputText(userEmail, "rubuait525@gmail.com");
		pause(1000);
		inputText(userPassword, "Password$1");
		clickElement(finalLogin);
		pause(2000);
	}


}
