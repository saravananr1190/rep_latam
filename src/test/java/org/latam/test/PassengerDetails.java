package org.latam.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerDetails extends Base{

	public PassengerDetails() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@id='name-bce5c85c-018b-4203-ac02-acad820d63d2']")
	private WebElement txtName;
	
	
	@FindBy(xpath="//input[@id='surname-80dfca1a-2f7c-4ea0-b454-9f5294d8f250']")
	private WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='birth-date-day-b50e6b57-08c1-46fb-a6ba-404e9821c479']")
	private WebElement txtDoBDay;
	
	@FindBy(xpath="//select[@id='birth-date-month-17868b91-b3fc-44f7-afc7-e14b859d5c8c']")
	private WebElement selDoBMon;
	
	@FindBy(xpath="//input[@id='birth-date-year-7857c8d0-d4a2-4ad0-849d-7c0fafa1256c']")
	private WebElement txtDoBYear;
	
	@FindBy(xpath="//select[@id='gender-d6ba2c10-3fab-4382-92fb-9eec5708040d']")
	private WebElement selDoBGender;
	
	@FindBy(xpath="//input[@id='name-8b0a6b5b-0bdf-4954-b08f-4f7fa73fa89d']")
	private WebElement txtName2;
	
	@FindBy(xpath="//input[@id='surname-829dee8a-caee-4500-9094-dc13beb52f95']")
	private WebElement txtLastName2;
	
	@FindBy(xpath="//input[@id='birth-date-day-7662ff86-f610-4c23-8d5a-ef858c610776']")
	private WebElement txtDoBDay2;
	
	@FindBy(xpath="//select[@id='birth-date-month-301854af-2792-42da-8cb3-7af1f0a64511']")
	private WebElement selDoBMon2;
	
	@FindBy(xpath="//input[@id='birth-date-year-debd9c9e-ca53-451c-b0bf-863771e531f9']")
	private WebElement txtDoBYear2;
	
	@FindBy(xpath="//select[@id='gender-efab5b5a-b56f-4b4c-bf04-1f857f1d144a']")
	private WebElement selDoBGender2;
	
	@FindBy(xpath="//input[@id='email-c36e3207-7ed9-48e4-ac08-10d422e7cf3a']")
	private WebElement txtEmailAddress;
	
	@FindBy(xpath="//select[@id='phone-calling-code-b112738f-0d59-42bf-aa76-3417b797438d']")
	private WebElement selMobCountryCode;
	
	@FindBy(xpath="//input[@id='phone-area-code-0cc98f75-1ed4-434e-9a81-6871a27520bd']")
	private WebElement txtAreaCode;
	
	@FindBy(xpath="//input[@id='phone-area-code-5a7510e2-3101-4910-9b0c-afca3d6c6430']")
	private WebElement txtMob;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement btnSubmit;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtDoBDay() {
		return txtDoBDay;
	}

	public WebElement getSelDoBMon() {
		return selDoBMon;
	}

	public WebElement getTxtDoBYear() {
		return txtDoBYear;
	}

	public WebElement getSelDoBGender() {
		return selDoBGender;
	}

	public WebElement getTxtName2() {
		return txtName2;
	}

	public WebElement getTxtLastName2() {
		return txtLastName2;
	}

	public WebElement getTxtDoBDay2() {
		return txtDoBDay2;
	}

	public WebElement getSelDoBMon2() {
		return selDoBMon2;
	}

	public WebElement getTxtDoBYear2() {
		return txtDoBYear2;
	}

	public WebElement getSelDoBGender2() {
		return selDoBGender2;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public WebElement getSelMobCountryCode() {
		return selMobCountryCode;
	}
	

	public WebElement getTxtAreaCode() {
		return txtAreaCode;
	}

	public WebElement getTxtMob() {
		return txtMob;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	
}
