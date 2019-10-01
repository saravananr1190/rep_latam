package org.latam.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	public LoginPage() {
	PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPass;
	
	@FindBy(id="btnEnter")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	

}
