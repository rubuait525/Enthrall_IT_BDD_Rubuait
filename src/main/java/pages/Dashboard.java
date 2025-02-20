package pages;

import org.openqa.selenium.By;
import java.io.File;
//import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

import static common.CommonActions.*;
import static common.CommonWaits.*;
import static pages.Login.*;
//import static pages.HomePage.*;
import java.time.Duration;
import java.util.List;


public class Dashboard {
	
	WebDriver driver;
	WebDriverWait wait;
	Login login;
	// HomePage homePage;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		login = new Login(driver);
		// homePage = new HomePage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

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

	
	@FindBy(xpath = "//a[text()='Return site']")
	WebElement returnSite;
	@FindBy(xpath = "//a[@id='dashboard-link']")
	WebElement dashboard;

	@FindBy(xpath = "//img[@class='avatar-rounded']")
	WebElement imageOnDashboard;
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logoutOnDashboard;
	@FindBy(xpath = "//h1[text()= 'Dashboard']")
	WebElement headerDashboardElement;
	
	// Dashboard AsideBar
	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;
	@FindBy(xpath = "//a[@id='home-tab']")
	WebElement profile2ForValidation;
	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement addCourse;
	@FindBy(xpath = "//h1[text()='Enroll Course']")
	WebElement enrollCourseValidation;
	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quizList;
	@FindBy(xpath = "//span[text()='Home Work']")
	WebElement homeWork;
	@FindBy(xpath = "//span[text()='Homework List']")
	WebElement homeWorkListValidation;
	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement coddinChallenge;
	@FindBy(xpath = "//span[text()='Coding Challenge List']")
	WebElement coddingChallengeValidation;
	@FindBy(xpath = "//span[text()='Exam']")
	WebElement exam;
	@FindBy(xpath = "//span[text()='Exam List']")
	WebElement examValidation;
	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootCamp;
	@FindBy(xpath = "//span[text()='Bootcamp List']")
	WebElement bootCampValidation;
	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement classNote;
	@FindBy(xpath = "//h1[text()='Class Note List']")
	WebElement classNoteListvalidation;
	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement classSchedule;
	@FindBy(xpath = "//h1[text()='Class Calendar']")
	WebElement classCalendarvalidation;
	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement joinTheClass;
	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement meetingListvalidation;
	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement classRecording;
	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement meetingList1validation;
	@FindBy(xpath = "//span[text()='Others']")
	WebElement others;
	@FindBy(xpath = "//h1[text()='Others']")
	WebElement othersValidation;
	//automation and enrollNow
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;
	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement automationValidation;
	@FindBy(xpath = "//h1[@class='sub-title']")
	WebElement subTitleHeaderValidation;
	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNow;
	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement headerOfEnrollNow;
	@FindBy(xpath = "//h5[text()='Please enter your personal and contact information.']")
	WebElement subHeaderOfEnrollNow;
	//First Name
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstNameOfEnroll;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement fNameAlphabeticError;
	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement fNameRequiredError;
	//Middle Name
	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middleNameOfEnrollNoW;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement mNameRequiredError;
	//last Name
	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lastNameOfEnrollNow;
	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lNameRequiredField;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement lNameAlphabaticError;
	//Select Profession
	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> selectProfessionList;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement selectProfessionRequiredError;
	//Select Course
	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement selectCourse;
	@FindBy(xpath = "//select[@name='course_wish_to_enroll']/option")
	List<WebElement> selectCourseList;
	@FindBy(xpath = "//small[@id='course_wish_error']")
	WebElement selectCourseRequiredError;
	@FindBy(xpath = "//option[text()='Python']")
	WebElement selectPython;
	//phone Number
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumInEnrollNow;
	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumRequriedfeild;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement phoneNumberError;
	@FindBy(xpath = "//small[text()='Must be a valid Phone Number.']")
	WebElement mustBeAValidPhoneNumber;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumMustBeExactly10Digit;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumMustNotStartWith1;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumMustNotStartWith0;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumCanNotBeAlphabatic;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumMustBeValidNumber;
	//ImageFile
	@FindBy(xpath = "//input[@name='image']")
	WebElement chooseImageInEnrollNow;
	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement imageRequiredFieldElement;
	//PhotoId
	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement choosePhotoID;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailInEnrollNow;
	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement photoIdRequiredElement;
	//Email
	@FindBy(xpath = "//span[text()='Email Address is a required field.']")
	WebElement emailRequiredField;
	@FindBy(xpath = "//span[text()='Must be a valid Email Address.']")
	WebElement emailMustBeValid;
	//Password
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passwordEnrollNow;

	@FindBy(xpath = "//*[@id='password_error']")
	WebElement passwordRequiredFeild;
	//Gender
	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement chooseGender;
	@FindBy(xpath = "//select[@id='id_gender']/option")
	List<WebElement> chooseSexElements;
	@FindBy(xpath = "//option[text()='Female']")
	WebElement femaleInGender;
	//birth Year
	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYearDropDown;
	@FindBy(xpath = "//option[text()='1966']")
	WebElement selectBirthYear;
	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birthYearRequiredFieldElement;
	//Birth Month
	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement birthMonthInEnrollNow;
	@FindBy(xpath = "//select[@id='id_birth_month']/option")
	List<WebElement> birthMonthDropList;
	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birthMonthRequiredFieldElement;
	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement birthDateInEnrollNow;
	@FindBy(xpath = "//select[@id='id_birth_date']/option")
	List<WebElement> birthDateList;
	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDateRequired;
	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement addressInEnrollNow;
	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement addressRequiredField;
	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement address2InEnrollNow;
//	@FindBy(xpath = "//span[text()='Home Address Line 2 is a required field.']")
//	WebElement address2RequiredField;
	@FindBy(xpath = "//input[@name='city']")
	WebElement cityInEnrollNow;
	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityRequiredField;
	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement cityMustBeAlphabeticElement;
	@FindBy(xpath = "//select[@name='state']")
	WebElement stateInEnrollNow;
	@FindBy(xpath = "//select[@name='state']/option")
	List<WebElement> stateDropdownList;
	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement stateRequiredField;
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCodeInEnrollNow;
	@FindBy(xpath = "//span[text()='Must be a valid numeric ZIP Code.']")
	WebElement zipCodeMustNumeric;
	@FindBy(xpath = "//span[text()='ZIP Code is a required field.']")
	WebElement zipCodeIsRequiredField;
	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement immigrationStatus;
	@FindBy(xpath = "//select[@name='immigration_status']/option")
	List<WebElement> immigrationStatusList;
	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrivalDate;
	@FindBy(xpath = "//span[text()='Must be alphanumeric characters']")
	WebElement arrivalDateMustBeAlphanumaric;
	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergencyContactInEnroll;
	@FindBy(xpath = "//span[@id='emergency_contact_error']")
	WebElement emergencyContactError;
	@FindBy(xpath = "//span[text()='Must be alphanumeric characters']")
	WebElement emergenceyContactMustAlphanumeric;
	@FindBy(xpath = "//input[@name='know_us']")
	WebElement howDidYouKnowUs;
	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement howDidYouKnowMustAlphabetic;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highestEdu;
	@FindBy(xpath = "//select[@id='id_highest_education']/option")
	List<WebElement> highestEduList;
	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement originCountry;
	@FindBy(xpath = "//input[@id='selected_language']")
	WebElement selectLanguage;
	@FindBy(xpath = "//div[text()='Bengali']")
	WebElement languageBangali;
	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement signatureInEnroll;
	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signatureRequired;
	@FindBy(xpath = "//span[text()='Please provide your full name as above']")
	WebElement signatureFullNameError;
	@FindBy(xpath = "//a[text()='Terms and condition']")
	WebElement termsConditionInEnrollNow;

	@FindBy(xpath = "//div[@id='termsModalBody']")
	WebElement termsConditionAlert;

	@FindBy(xpath = "//button[@id='acceptButton']")
	WebElement termsConditionAcceptButtonInEnrollNow;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement alertCancelInTermsConditionElement;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButtonInEnroll;
	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement submitButtonForFirstNameRequired;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement submitButtonLastNameRequired;
	@FindBy(xpath = "//small[@id='i_am_error']") // fI'm is a required field.
	WebElement submitButtonImIsRequiredFieldElement;
	@FindBy(xpath = "//small[@id='course_wish_error']") // Course Wish to Enroll is a required field.
	WebElement submitButtonCourseRequiredElement;
	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement submitButtonPhoneRequiredElement;
	@FindBy(xpath = "//span[text()='Email Address is a required field.']")
	WebElement submitButtonEmailRequired;
	@FindBy(xpath = "//span[text()='Password is a required field.']")
	WebElement submitButtonPasswordReuiredElement;
	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement submitButtonPersonalImageRequiredElement;
	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement submitButtonPhotoIDRequiredElement;
	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement submitButtonBirthYearRequiredElement;
	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement submitButtonBirthMonthRequiredElement;
	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement submitButtonBirthDateRequiredElement;
	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement submitButtonHomeAddressRequiredElement;
	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement submitButtonCityRequiredElement;
	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement submitButtonStateRequiredElement;
	@FindBy(xpath = "//span[text()='ZIP Code is a required field.']")
	WebElement submitButtonZipCodeRequiredElement;
	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement summitButtonSignatureRequiredElement;
	@FindBy(xpath = "//p[contains(text(),'Thank you for registering')]")
	WebElement thankYouForRegistation;
	@FindBy(xpath = "//button[text()='Right Click Action']")
	WebElement rightClickActionInEnrollNow;
	@FindBy(xpath = "//li[text()='Back']")
	WebElement backInRightClickElement;
	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement cancelInRightClickElement;

/////////////////////------methods--------/////////////////////////////
	
	public void dashboard_validation_step_one() {
		pause(2000);
		clickElement(loginLink);
		inputText(userEmail, "rubuait525@gmail.com");
		pause(1000);
		inputText(userPassword, "Password$1");
		clickElement(finalLogin);
		pause(2000);
		
	}
	public void dashboardLandingNecessary() {
		pause(4000);
		dashboardValidation();
		clickElementThenTab(dashboard);

	}

	public void dashboardValidation() {
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
	}

	public void homePageValidation() {
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT");

	}

	public void dashboard_page_validation() {
		pause(2000);
		clickElement(returnSite);
		pause(2000);
		homePageValidation();
		clickElement(dashboard);
		pause(1000);
		clickElement(imageOnDashboard);
		pause(2000);
		clickElement(logoutOnDashboard);

	}

	public void aside_elements_On_dashboard_validation() {

		clickElement(profile);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/profile/");
		verifyTextOfTheWebElement(profile, "Profile");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(addCourse);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/enroll/course/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		// validationOfHeader(addCourse, "Enroll Course");
		verifyTextOfTheWebElement(addCourse, " Course");

		pause(1000);
		clickElement(quizList);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/qz/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(quizList, "Quiz List");

		pause(1000);
		clickElement(homeWork);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/hw/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(homeWorkListValidation, "Homework List");

		pause(1000);
		clickElement(coddinChallenge);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/cc/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(coddingChallengeValidation, "Coding Challenge List");

		pause(1000);
		clickElement(exam);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(examValidation, "Exam List");

		pause(1000);
		clickElement(classNote);
		verifyCurrentUrl(driver, "https://enthrallit.com/modules/class/note/list/#class_note");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(classNoteListvalidation, "Class Note List");

		pause(1000);
		clickElement(classSchedule);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(classCalendarvalidation, "Class Calendar");

		pause(1000);
		clickElement(joinTheClass);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/next-class/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(meetingListvalidation, "Meeting List");

		clickElement(classRecording);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/recording/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(meetingList1validation, "Meeting List");

		clickElement(others);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/others/list/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(othersValidation, "Others");

	}

	public void automation_validation_on_dashboard_page() {
		//driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(automationValidation, "Automation");
		validationOfSubHeader(subTitleHeaderValidation, "Please choose from below");

		
	}
	public void enroll_now_validation_on_dashboard_page() {
		pause(1000);
		clickElement(enrollNow);
		//change here
		//switchToChildWindow(driver, automation, enrollNow);
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		//validationOfHeader(headerOfEnrollNow, "Select your course from the dropdown");
		//validationOfSubHeader(subHeaderOfEnrollNow, "Please enter your personal and contact information.");

		
	}

	

	public void first_name_validation_on_enroll_now() {

		pause(2000);
		clickElement(firstNameOfEnroll);
		verifyLengthOfTheFieldContent(firstNameOfEnroll, Attribute.MAX_LENGTH, "20");
		pause(1000);
		inputTextThenClickTab(firstNameOfEnroll, "123452340998222");
		verifyErrorMessageUnderTheField(fNameAlphabeticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(firstNameOfEnroll, "#%^&()@#'%$##_(&%@");
		verifyErrorMessageUnderTheField(fNameAlphabeticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		clearTextFromTheField(firstNameOfEnroll);
		verifyErrorMessageUnderTheField(fNameRequiredError, Attribute.INNER_HTML, "First Name is a required field.");
		inputTextThenClickTab(firstNameOfEnroll, "Rubuait-Rahman");
		pause(2000);

	}

	public void middle_name_validation_on_enroll_now_page() {

		clickElement(middleNameOfEnrollNoW);
		verifyErrorMessageUnderTheField(middleNameOfEnrollNoW, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(middleNameOfEnrollNoW, "1234");
		verifyErrorMessageUnderTheField(mNameRequiredError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		clearTextFromTheField(middleNameOfEnrollNoW);
		pause(1000);
		inputTextThenClickTab(middleNameOfEnrollNoW, "hello");
		pause(2000);
	}

	public void last_name_validation_On_enrollNow() {

		pause(2000);
		clickElement(lastNameOfEnrollNow);
		verifyErrorMessageUnderTheField(lastNameOfEnrollNow, Attribute.MAX_LENGTH, "25");
		clickElementThenTab(lastNameOfEnrollNow);
		verifyErrorMessageUnderTheField(lNameRequiredField, Attribute.INNER_HTML, "Last Name is a required field.");
		inputTextThenClickTab(lastNameOfEnrollNow, "!@#$%%$+()(&");
		verifyErrorMessageUnderTheField(lNameAlphabaticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(lastNameOfEnrollNow, "123356777");
		verifyErrorMessageUnderTheField(lNameAlphabaticError, Attribute.INNER_HTML, "Must be alphabetic characters.");

		inputTextThenClickTab(lastNameOfEnrollNow, "Rahman");
		pause(2000);
	}

	public void select_profession_dropdown_validation_on_enroll_now() {

		clickElementThenTab(selectProfession);
		verifyErrorMessageUnderTheField(selectProfessionRequiredError, Attribute.INNER_HTML,
				"I'm is a required field.");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionList);
		selectDropdown(selectProfession, "a Student");
		pause(2000);

	}

	public void select_course_dropdown_validation_on_enroll_now() {

		pause(2000);
		clickElementThenTab(selectCourse);
		verifyErrorMessageUnderTheField(selectCourseRequiredError, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		pause(2000);
		clickElement(selectCourse);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		clickElement(selectCourse);
		clickElement(selectPython);
		pause(2000);

	}

	public void phone_number_validation_on_enroll_now() {

		clickElementThenTab(phoneNumInEnrollNow);
		verifyErrorMessageUnderTheField(phoneNumRequriedfeild, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		verifyErrorMessageUnderTheField(phoneNumInEnrollNow, Attribute.MAX_LENGTH, "10");

		inputTextThenClickTab(phoneNumInEnrollNow, "5467");
		verifyErrorMessageUnderTheField(phoneNumberError, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		inputTextThenClickTab(phoneNumInEnrollNow, "abggyhjjjjhsgsgs");
		verifyErrorMessageUnderTheField(phoneNumCanNotBeAlphabatic, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		inputTextThenClickTab(phoneNumInEnrollNow, "0000233095");
		verifyErrorMessageUnderTheField(phoneNumMustNotStartWith0, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		inputTextThenClickTab(phoneNumInEnrollNow, "1100233095");
		verifyErrorMessageUnderTheField(phoneNumMustNotStartWith1, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		inputTextThenClickTab(phoneNumInEnrollNow, "#%$%^$#@#$");
		verifyErrorMessageUnderTheField(phoneNumMustBeValidNumber, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");

		clearTextFromTheField(phoneNumInEnrollNow);
		pause(2000);
		inputTextThenClickTab(phoneNumInEnrollNow, "2345678902");

	}

	public void email_address_validation_on_enroll_now() {

		clickElementThenTab(emailInEnrollNow);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Email Address is a required field.");
		verifyLengthOfTheFieldContent(emailInEnrollNow, Attribute.MAX_LENGTH, "74");

		inputTextThenClickTab(emailInEnrollNow, "#$$%!123dfgghg");
		verifyErrorMessageUnderTheField(emailMustBeValid, Attribute.INNER_HTML, "Must be a valid Email Address.");

		clearTextFromTheField(emailInEnrollNow);
		inputTextThenClickTab(emailInEnrollNow, "ruby345@gmail.com");
		pause(3000);
	}

	public void password_validation_on_enroll_now() {

		clickElementThenTab(passwordEnrollNow);
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML, "Password is a required field.");
		verifyLengthOfTheFieldContent(passwordEnrollNow, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(passwordEnrollNow, "a123");// must be 8 characters
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		inputTextThenClickTab(passwordEnrollNow, "ruby*ruby");// must have 1 upper case
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "RUBY*RUBY");// must have 1 lower case
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "RUBYruby");// must have 1 special character
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputText(firstNameOfEnroll, "Rubuait-Rahman");
		inputText(lastNameOfEnrollNow, "Rahman");
		inputText(emailInEnrollNow, "Rahman@gmail.com");
		inputTextThenClickTab(passwordEnrollNow, "Rubuait#Rahman12");// must not have first name
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "Rahman$123");// must not have last name
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "Rahman@gmail.com");// must not have email parts
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "$%^^%@!##$$m");
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "1234567910");
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
//		inputTextThenClickTab(passwordEnrollNow, "Password$1");//must not have common password
//		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
//				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		inputTextThenClickTab(passwordEnrollNow, "Abcd@12$");
		pause(3000);
	}

	public void choose_gender_validation_in_enroll_now() {

		selectElelementFromDropdownOnebyOne(chooseGender, chooseSexElements);
		pause(2000);
		selectDropdown(chooseGender, "Female");
		pause(2000);
	}

	public void choose_ImageFile_validation_on_enroll_now() {
		clickElementThenTab(chooseImageInEnrollNow);
		verifyLengthOfTheFieldContent(imageRequiredFieldElement, Attribute.INNER_HTML, "Personal Image is a required field.");
		pause(1000);
		uploadPhotoImage(chooseImageInEnrollNow, "./image/personalImage.jpg");

	}

	public void choose_PhotoID_file_validation_on_enroll_now() {
		clickElementThenTab(choosePhotoID);
		verifyErrorMessageUnderTheField(alertCancelInTermsConditionElement, Attribute.INNER_HTML, "Photo Id is a required field.");
		pause(1000);
		uploadPhotoImage(choosePhotoID, "./image/photoid.png");

	}

	public void birth_year_dropdown_in_enroll_now() {

		clickElementThenTab(birthYearDropDown);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		clickElement(birthYearDropDown);
		pause(2000);
		selectDropdown(birthYearDropDown, "1966");
		pause(3000);

	}

	public void birthMonthDropdown() {

		clickElementThenTab(birthMonthInEnrollNow);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		selectElelementFromDropdownOnebyOne(birthMonthInEnrollNow, birthMonthDropList);
		pause(3000);
		selectDropdown(birthMonthInEnrollNow, "April");
		pause(2000);
	}

	public void birthYear_birthMonth_birthDate_dropdown_in_Enroll_now() {
		// Here i put three methods together because without birthYear and BirthMonth,
		// birthdate can not be selected from dropdown
		clickElementThenTab(birthYearDropDown);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		clickElement(birthYearDropDown);
		pause(2000);
		selectDropdown(birthYearDropDown, "1966");
		pause(1000);

		clickElementThenTab(birthMonthInEnrollNow);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		selectElelementFromDropdownOnebyOne(birthMonthInEnrollNow, birthMonthDropList);
		pause(3000);
		selectDropdown(birthMonthInEnrollNow, "April");
		pause(1000);

		clickElementThenTab(birthDateInEnrollNow);
		verifyErrorMessageUnderTheField(birthDateRequired, Attribute.INNER_HTML, "Birth Date is a required field.");
		clickElement(birthDateInEnrollNow);
		selectElelementFromDropdownOnebyOne(birthDateInEnrollNow, birthDateList);
		pause(2000);
		selectDropdown(birthDateInEnrollNow, "10");
		pause(2000);
	}

	public void address_validation_on_enroll_now() {

		clickElementThenTab(addressInEnrollNow);
		verifyErrorMessageUnderTheField(addressRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		verifyErrorMessageUnderTheField(addressInEnrollNow, Attribute.MAX_LENGTH, "60");
		pause(2000);
		inputTextThenClickTab(addressInEnrollNow, "@#$%^^&&&*&");
		verifyErrorMessageUnderTheField(addressRequiredField, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		inputTextThenClickTab(addressInEnrollNow, "AbcdefghijKlanop");
		pause(2000);

		clickElementThenTab(address2InEnrollNow);
		// verifyErrorMessageUnderTheField(address2RequiredField, Attribute.INNER_HTML,
		// "Home Address Line 2 is a required field.");
		verifyLengthOfTheFieldContent(address2InEnrollNow, Attribute.MAX_LENGTH, "65");
		pause(1000);
		clickElement(address2InEnrollNow);
		pause(2000);
		inputTextThenClickTab(address2InEnrollNow, "ABCDEFGHIJKLMNOP");
	}

	public void city_validation_in_enroll_now() {

		clickElementThenTab(cityInEnrollNow);
		verifyErrorMessageUnderTheField(cityRequiredField, Attribute.INNER_HTML, "City is a required field.");
		verifyLengthOfTheFieldContent(cityInEnrollNow, Attribute.MAX_LENGTH, "30");
		inputTextThenClickTab(cityInEnrollNow, "!@#$%%%");
		pause(3000);
		verifyErrorMessageUnderTheField(cityMustBeAlphabeticElement, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(cityInEnrollNow, "leander");

	}

	public void state_dropdown_validation_in_enroll() {

		clickElementThenTab(stateInEnrollNow);
		verifyErrorMessageUnderTheField(stateRequiredField, Attribute.INNER_HTML, "State is a required field.");
		clickElement(stateInEnrollNow);
		pause(2000);
		selectDropdown(stateInEnrollNow, "Hawaii");

	}

	public void zip_code_validation_in_Enroll_now() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");

		clickElementThenTab(zipCodeInEnrollNow);
		verifyErrorMessageUnderTheField(zipCodeIsRequiredField, Attribute.INNER_HTML, "ZIP Code is a required field.");
		verifyLengthOfTheFieldContent(zipCodeInEnrollNow, Attribute.MAX_LENGTH, "5");

		inputTextThenClickTab(zipCodeInEnrollNow, "123");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeMustNumeric, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		clearTextFromTheField(zipCodeInEnrollNow);
		inputTextThenClickTab(zipCodeInEnrollNow, "65432");
		pause(1000);

	}

	public void immigration_status_validation_in_enroll() {

		pause(1000);
		selectElelementFromDropdownOnebyOne(immigrationStatus, immigrationStatusList);
		pause(1000);
		selectDropdown(immigrationStatus, "Citizen");

	}

	public void arrival_date_validation_in_enroll_now() {

		clickElement(arrivalDate);
		verifyLengthOfTheFieldContent(arrivalDate, Attribute.MAX_LENGTH, "100");
		inputTextThenClickTab(arrivalDate, "#$%^&*$%^");
		verifyErrorMessageUnderTheField(arrivalDateMustBeAlphanumaric, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		clearTextFromTheField(arrivalDate);
		inputTextThenClickTab(arrivalDate, "20thDecember2024");
		pause(3000);

	}

	public void ememergencey_contact_validation_in_enroll_now() {
		verifyLengthOfTheFieldContent(emergencyContactInEnroll, Attribute.MAX_LENGTH, "150");
		inputTextThenClickTab(emergencyContactInEnroll, "@#$%^&*(*&");
		verifyErrorMessageUnderTheField(emergenceyContactMustAlphanumeric, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		clearTextFromTheField(emergencyContactInEnroll);
		inputTextThenClickTab(emergencyContactInEnroll, "4552234455");
		pause(1000);
	}

	public void how_did_you_know_validation_in_enroll_now() {

		pause(2000);
		clickElement(howDidYouKnowUs);
		verifyLengthOfTheFieldContent(howDidYouKnowUs, Attribute.MAX_LENGTH, "500");
		inputTextThenClickTab(howDidYouKnowUs, "!@#$%^&");
		verifyErrorMessageUnderTheField(howDidYouKnowMustAlphabetic, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(1000);
		inputTextThenClickTab(howDidYouKnowUs, "12345566");
		verifyErrorMessageUnderTheField(howDidYouKnowMustAlphabetic, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(howDidYouKnowUs);
		inputTextThenClickTab(howDidYouKnowUs, "internet");

	}

	public void highest_edu_validation_in_enroll_now() {

		selectElelementFromDropdownOnebyOne(highestEdu, highestEduList);
		pause(2000);
		selectDropdown(highestEdu, "Other");

	}

	public void origin_country_validation_in_enroll_now() {

		clickElement(originCountry);
		selectDropdown(originCountry, "Bangladesh");
		pause(2000);

	}

	public void primary_language_mousehover_validation_in_enroll_now() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");

		pause(2000);
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, highestEdu);
		pause(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(selectLanguage);
		clickElement(languageBangali);
		
		
		//change here add // line 858
		//mouseHoverAction(driver, selectLanguage, languageBangali);
		
	}

	public void signature_validation_in_enroll_now() {
		clickElementThenTab(signatureInEnroll);
		verifyErrorMessageUnderTheField(signatureRequired, Attribute.INNER_HTML, "Signature is a required field.");
		verifyLengthOfTheFieldContent(signatureInEnroll, Attribute.MAX_LENGTH, "150");
		inputTextThenClickTab(signatureInEnroll, "Rubuait-Rahman");
		verifyErrorMessageUnderTheField(signatureFullNameError, Attribute.INNER_HTML,
				"Please provide your full name as above");
		inputTextThenClickTab(signatureInEnroll, "Rahman");
		verifyErrorMessageUnderTheField(signatureFullNameError, Attribute.INNER_HTML,
				"Please provide your full name as above");
		clearTextFromTheField(signatureInEnroll);

		pause(1000);

		inputTextThenClickTab(signatureInEnroll, "Rubuait-Rahman Rahman");
		pause(2000);
	}

	public void terms_and_condition_validation_enroll_now() {
		scrollIntoViewUsingJavascriptExecutor(driver, cityInEnrollNow);
		//change here put // 884
		//doubleClickActionAccept(driver, termsConditionInEnrollNow);
		//doubleClickActionAccept(driver, termsConditionInEnrollNow);
		Actions actions = new Actions(driver);
		actions.doubleClick(termsConditionInEnrollNow).perform();
		pause(2000);
        // Find the "Accept" button in the modal
        WebElement acceptButton = driver.findElement(By.id("acceptButton"));

        // Click the "Accept" button
        acceptButton.click();
        pause(2000);
		
//
//		pause(1000);
//		System.out.println("trying to click accept btn");
//		driver.findElement(By.id("acceptButton")).click();
//
//
//		pause(1000);
//		System.out.println("trying to click accept btn");
//		driver.findElement(By.id("acceptButton")).click();

	}

	public void submit_button_validation_in_enroll_now() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, cityInEnrollNow);
		clickElement(submitButtonInEnroll);
		pause(2000);
		verifyErrorMessageUnderTheField(submitButtonForFirstNameRequired, Attribute.INNER_HTML,
				"First Name is a required field.");
		pause(2000);
		verifyErrorMessageUnderTheField(submitButtonLastNameRequired, Attribute.INNER_HTML,
				"Last Name is a required field.");

		verifyErrorMessageUnderTheField(submitButtonImIsRequiredFieldElement, Attribute.INNER_HTML,
				"I'm is a required field.");

		verifyErrorMessageUnderTheField(submitButtonCourseRequiredElement, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		verifyErrorMessageUnderTheField(submitButtonPhoneRequiredElement, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		verifyErrorMessageUnderTheField(submitButtonEmailRequired, Attribute.INNER_HTML,
				"Email Address is a required field.");
		verifyErrorMessageUnderTheField(submitButtonPasswordReuiredElement, Attribute.INNER_HTML,
				"Password is a required field.");
		verifyErrorMessageUnderTheField(submitButtonPersonalImageRequiredElement, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		verifyErrorMessageUnderTheField(submitButtonPhotoIDRequiredElement, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		verifyErrorMessageUnderTheField(submitButtonBirthYearRequiredElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		verifyErrorMessageUnderTheField(submitButtonBirthMonthRequiredElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		verifyErrorMessageUnderTheField(submitButtonBirthDateRequiredElement, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		verifyErrorMessageUnderTheField(submitButtonHomeAddressRequiredElement, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		verifyErrorMessageUnderTheField(submitButtonCityRequiredElement, Attribute.INNER_HTML,
				"City is a required field.");
		verifyErrorMessageUnderTheField(submitButtonStateRequiredElement, Attribute.INNER_HTML,
				"State is a required field.");
		verifyErrorMessageUnderTheField(submitButtonZipCodeRequiredElement, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		verifyErrorMessageUnderTheField(summitButtonSignatureRequiredElement, Attribute.INNER_HTML,
				"Signature is a required field.");

	}

	public void right_click_action_validation_enroll_now() {
		//driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, cityInEnrollNow);
//		clickElement(rightClickActionInEnrollNow);
		//change here add // line 931 and add 932
		//rightClick(driver, rightClickActionInEnrollNow);
		clickElement(rightClickActionInEnrollNow);
//		pause(3000);
		System.out.println("trying to click back:: this runs into exception ");
		clickElement(backInRightClickElement);

		System.out.println("trying to click dissmiss/cancel ");
		driver.switchTo().alert().dismiss();

	}

	public void happy_path_enroll_now_dircet_to_registration_complete() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(1000);
		clickElement(firstNameOfEnroll);
		inputTextThenClickTab(firstNameOfEnroll, "Rubuait-Rahman");
		pause(2000);
		clickElement(lastNameOfEnrollNow);
		inputTextThenClickTab(lastNameOfEnrollNow, "Rahman");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionList);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		clickElement(selectCourse);
		clickElement(selectPython);
		pause(2000);
		inputTextThenClickTab(phoneNumInEnrollNow, "2345678902");
		inputTextThenClickTab(emailInEnrollNow, "ruby345@gmail.com");
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "Abcd@12$");
		pause(2000);
		selectElelementFromDropdownOnebyOne(chooseGender, chooseSexElements);
		pause(2000);
		selectDropdown(chooseGender, "Female");
		pause(2000);
		uploadPhotoImage(chooseImageInEnrollNow, "./image/personalImage.jpg");
		pause(1000);
		uploadPhotoImage(choosePhotoID, "./image/photoid.png");
		selectDropdown(birthYearDropDown, "1966");
		pause(1000);
		selectDropdown(birthMonthInEnrollNow, "April");
		pause(1000);
		selectDropdown(birthDateInEnrollNow, "10");
		inputTextThenClickTab(addressInEnrollNow, "AbcdefghijKlanop");
		pause(2000);
		inputTextThenClickTab(address2InEnrollNow, "ABCDEFGHIJKLMNOP");
		pause(1000);
		inputTextThenClickTab(cityInEnrollNow, "leander");
		pause(1000);
		selectDropdown(stateInEnrollNow, "Hawaii");
		pause(1000);
		inputTextThenClickTab(zipCodeInEnrollNow, "65432");
		pause(1000);
		pause(1000);
		selectDropdown(immigrationStatus, "Citizen");
		pause(1000);
		inputTextThenClickTab(arrivalDate, "20thDecember2024");
		inputTextThenClickTab(emergencyContactInEnroll, "4552234455");
		pause(1000);
		inputTextThenClickTab(howDidYouKnowUs, "internet");
		pause(2000);
		selectDropdown(highestEdu, "Other");
		selectDropdown(originCountry, "Bangladesh");
		pause(1000);
		// scrollIntoViewTheElementUsingJavascriptExecutor(driver, highestEdu);
		pause(3000);
		clickElementThenTab(signatureInEnroll);
		inputTextThenClickTab(signatureInEnroll, "Rubuait-Rahman Rahman");
		pause(2000);
		

	}

	

	public void all_required_field_validation_and_error_From_enroll_now_page() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");

		// first name
		verifyLengthOfTheFieldContent(firstNameOfEnroll, Attribute.MAX_LENGTH, "20");
		pause(1000);
		inputTextThenClickTab(firstNameOfEnroll, "123452340998222");
		verifyErrorMessageUnderTheField(fNameAlphabeticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(firstNameOfEnroll, "#%^&()@#'%$##_(&%@");
		verifyErrorMessageUnderTheField(fNameAlphabeticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		clearTextFromTheField(firstNameOfEnroll);
		verifyErrorMessageUnderTheField(fNameRequiredError, Attribute.INNER_HTML, "First Name is a required field.");
		// middle name
		verifyErrorMessageUnderTheField(middleNameOfEnrollNoW, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(middleNameOfEnrollNoW, "1234");
		verifyErrorMessageUnderTheField(mNameRequiredError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		clearTextFromTheField(middleNameOfEnrollNoW);
		// last name
		verifyErrorMessageUnderTheField(lastNameOfEnrollNow, Attribute.MAX_LENGTH, "25");
		clickElementThenTab(lastNameOfEnrollNow);
		verifyErrorMessageUnderTheField(lNameRequiredField, Attribute.INNER_HTML, "Last Name is a required field.");
		inputTextThenClickTab(lastNameOfEnrollNow, "!@#$%%$+()(&");
		verifyErrorMessageUnderTheField(lNameAlphabaticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(lastNameOfEnrollNow, "123356777");
		verifyErrorMessageUnderTheField(lNameAlphabaticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		// select profession
		verifyErrorMessageUnderTheField(selectProfessionRequiredError, Attribute.INNER_HTML,
				"I'm is a required field.");
		// select course
		clickElementThenTab(selectCourse);
		verifyErrorMessageUnderTheField(selectCourseRequiredError, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		// phone number
		clickElementThenTab(phoneNumInEnrollNow);
		verifyErrorMessageUnderTheField(phoneNumRequriedfeild, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		verifyErrorMessageUnderTheField(phoneNumInEnrollNow, Attribute.MAX_LENGTH, "10");

		inputTextThenClickTab(phoneNumInEnrollNow, "5467");
		verifyErrorMessageUnderTheField(phoneNumberError, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		inputTextThenClickTab(phoneNumInEnrollNow, "abggyhjjjjhsgsgs");
		verifyErrorMessageUnderTheField(phoneNumCanNotBeAlphabatic, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		inputTextThenClickTab(phoneNumInEnrollNow, "0000233095");
		verifyErrorMessageUnderTheField(phoneNumMustNotStartWith0, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		inputTextThenClickTab(phoneNumInEnrollNow, "1100233095");
		verifyErrorMessageUnderTheField(phoneNumMustNotStartWith1, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		inputTextThenClickTab(phoneNumInEnrollNow, "#%$%^$#@#$");
		verifyErrorMessageUnderTheField(phoneNumMustBeValidNumber, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		// email address
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Email Address is a required field.");
		verifyLengthOfTheFieldContent(emailInEnrollNow, Attribute.MAX_LENGTH, "74");

		inputTextThenClickTab(emailInEnrollNow, "#$$%!123dfgghg");
		verifyErrorMessageUnderTheField(emailMustBeValid, Attribute.INNER_HTML, "Must be a valid Email Address.");
		// password
		clickElementThenTab(passwordEnrollNow);
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML, "Password is a required field.");
		verifyLengthOfTheFieldContent(passwordEnrollNow, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(passwordEnrollNow, "a123");// must be 8 characters
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		inputTextThenClickTab(passwordEnrollNow, "ruby*ruby");// must have 1 upper case
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "RUBY*RUBY");// must have 1 lower case
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "RUBYruby");// must have 1 special character
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "Rubuait-Rahman");// must not have first name
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "Rahman-123");// must not have last name
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "Rahman@gmail.com");// must not have email parts
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "$%^^%@!##$$m");
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		pause(1000);
		inputTextThenClickTab(passwordEnrollNow, "1234567910");
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		// birthyear
		clickElementThenTab(birthYearDropDown);

		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		// birthMonth
		clickElementThenTab(birthMonthInEnrollNow);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		// birthDate
		clickElementThenTab(birthDateInEnrollNow);
		verifyErrorMessageUnderTheField(birthDateRequired, Attribute.INNER_HTML, "Birth Date is a required field.");
		// home Address
		clickElementThenTab(addressInEnrollNow);
		verifyErrorMessageUnderTheField(addressRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		verifyErrorMessageUnderTheField(addressInEnrollNow, Attribute.MAX_LENGTH, "60");
		pause(2000);
		// inputTextThenClickTab(addressInEnrollNow, "@#$%^^&&&*&");
		// verifyErrorMessageUnderTheField(addressRequiredField, Attribute.INNER_HTML,
		// "Must be alphanumeric characters.");
		inputTextThenClickTab(addressInEnrollNow, "AbcdefghijKlanop");
		pause(2000);

		clickElementThenTab(address2InEnrollNow);
		// verifyErrorMessageUnderTheField(address2RequiredField, Attribute.INNER_HTML,
		// "Home Address Line 2 is a required field.");
		verifyLengthOfTheFieldContent(address2InEnrollNow, Attribute.MAX_LENGTH, "65");
		pause(1000);
		clickElement(address2InEnrollNow);
		inputTextThenClickTab(address2InEnrollNow, "ABCDEFGHIJKLMNOP");
		// city
		clickElementThenTab(cityInEnrollNow);
		pause(2000);

		verifyErrorMessageUnderTheField(cityRequiredField, Attribute.INNER_HTML, "City is a required field.");
		verifyLengthOfTheFieldContent(cityInEnrollNow, Attribute.MAX_LENGTH, "30");
		// verifyErrorMessageUnderTheField(cityMustBeAlphabeticElement,
		// Attribute.INNER_HTML,
		// "Must be alphabetic characters.");
		// state
		clickElementThenTab(stateInEnrollNow);
		verifyErrorMessageUnderTheField(stateRequiredField, Attribute.INNER_HTML, "State is a required field.");
		inputTextThenClickTab(stateInEnrollNow, "Taxas");
		// zipcode
		clickElementThenTab(zipCodeInEnrollNow);
		verifyErrorMessageUnderTheField(zipCodeIsRequiredField, Attribute.INNER_HTML, "ZIP Code is a required field.");
		verifyLengthOfTheFieldContent(zipCodeInEnrollNow, Attribute.MAX_LENGTH, "5");
		inputTextThenClickTab(zipCodeInEnrollNow, "@#$%^&&&&&&&&&&&&&^");
		verifyErrorMessageUnderTheField(zipCodeMustNumeric, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		// arrivalDate
		clickElement(arrivalDate);
		verifyLengthOfTheFieldContent(arrivalDate, Attribute.MAX_LENGTH, "100");
		inputTextThenClickTab(arrivalDate, "#$%^&*$%^");
		verifyErrorMessageUnderTheField(arrivalDateMustBeAlphanumaric, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		// emergenceyContact

		verifyLengthOfTheFieldContent(emergencyContactInEnroll, Attribute.MAX_LENGTH, "150");
		inputTextThenClickTab(emergencyContactInEnroll, "@#$%^&*(*&");
		verifyErrorMessageUnderTheField(emergenceyContactMustAlphanumeric, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		// how did you know us
		clickElement(howDidYouKnowUs);
		verifyLengthOfTheFieldContent(howDidYouKnowUs, Attribute.MAX_LENGTH, "500");
		inputTextThenClickTab(howDidYouKnowUs, "!@#$%^&");
		verifyErrorMessageUnderTheField(howDidYouKnowMustAlphabetic, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(1000);
		inputTextThenClickTab(howDidYouKnowUs, "12345566");
		verifyErrorMessageUnderTheField(howDidYouKnowMustAlphabetic, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		// signature
		clickElementThenTab(signatureInEnroll);
		verifyErrorMessageUnderTheField(signatureRequired, Attribute.INNER_HTML, "Signature is a required field.");
		verifyLengthOfTheFieldContent(signatureInEnroll, Attribute.MAX_LENGTH, "150");
		inputTextThenClickTab(signatureInEnroll, "Rubuait-Rahman");
		verifyErrorMessageUnderTheField(signatureFullNameError, Attribute.INNER_HTML,
				"Please provide your full name as above");
		inputTextThenClickTab(signatureInEnroll, "Rahman");
		verifyErrorMessageUnderTheField(signatureFullNameError, Attribute.INNER_HTML,
				"Please provide your full name as above");

	}

}
