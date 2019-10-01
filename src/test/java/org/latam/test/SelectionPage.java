package org.latam.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage extends Base{
	
	public SelectionPage() {
	PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="(//div[@class='flight-summary'])[2]")
	private WebElement selectFlight;
	
	@FindBy(id="submit-flights")
	private WebElement continueSelect;

	public WebElement getSelectFlight() {
		return selectFlight;
	}

	public WebElement getContinueSelect() {
		return continueSelect;
	}
	


}
