package stepDefination;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefination extends BaseClass{
	@Given("Student is on the Enthrall IT Homepage URL")
	public void student_is_on_the_enthrall_it_homepage_url() {
		login.validateLogoAndTitle();

	}
	
	@When("Student click Login Button from the header")
	public void student_click_login_button_from_the_header() {
		login.clickLogin();

	}

	@Then("Student will navigate to login page")
	public void student_will_navigate_to_login_page() {
		login.validateLoginPage();

	}

	@When("Student enter Email in the Email field")
	public void student_enter_email_in_the_email_field() {
		login.validateUserEmail();

	}

	@When("Student enter Password in the Password field")
	public void student_enter_password_in_the_password_field() {
		login.validatePassword();
	}

	@When("Student finally click on Login Button")
	public void student_finally_click_on_login_button() {
		login.validateLoginButton();

	}

	@Then("Student will  be navigate to  the student dashboard")
	public void student_will_be_navigate_to_the_student_dashboard() {
		login.validateDashboardPage();
	}
	@When("Student enter UserId as {string}")
	public void student_enter_user_id_as(String string) {
		login.validateUserEmail(string);
	    
	}

	@When("Student enter Password as {string}")
	public void student_enter_password_as(String string) {
		login.validatePassword(string);
	    
	}

}
