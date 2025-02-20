package stepDefination;

import baseUtil.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepsDefination extends BaseClass {
	
	@When("Student Click On login button Student puting value in each field Click Login Button to navigate to Dashboard page")
	public void student_click_on_login_button_student_puting_value_in_each_field_click_login_button_to_navigate_to_dashboard_page() {
	    dashboard.dashboard_validation_step_one();
	}

	@When("Student Click on Automation to navigate to Automation page")
	public void student_click_on_automation_to_navigate_to_automation_page() {
	    dashboard.automation_validation_on_dashboard_page();
	}
	@When("Student Click Enroll Now to navigate to enroll home page")
	public void student_click_enroll_now_to_navigate_to_enroll_home_page() {
		dashboard.enroll_now_validation_on_dashboard_page();
		
	}

	@When("Student Puting value in each field to enrollment process")
	public void student_puting_value_in_each_field_to_enrollment_process() {
		dashboard.happy_path_enroll_now_dircet_to_registration_complete();
		dashboard.primary_language_mousehover_validation_in_enroll_now();
	}

	@When("Student Double Click on Terms and Condition and select Accept")
	public void student_double_click_on_terms_and_condition_and_select_accept() {
		dashboard.terms_and_condition_validation_enroll_now();
	}

	@Then("Student Click Submit Button it will navigate to Successfull Page")
	public void student_click_submit_button_it_will_navigate_to_successfull_page() {
		dashboard.right_click_action_validation_enroll_now();
	}

}
