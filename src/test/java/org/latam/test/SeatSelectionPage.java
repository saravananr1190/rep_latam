package org.latam.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatSelectionPage extends Base{

	public SeatSelectionPage() {
	PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//button[@id='ok-button']")
	private WebElement btnConfirm;
	
	@FindBy(id="continue-anyway-button")
	private WebElement btnContinue;

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
}
