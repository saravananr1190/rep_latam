package org.latam.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base{
	public SearchPage() {
		PageFactory.initElements(d, this);
		scrollUp(fromFlight);
		}
		
		@FindBy(xpath="//input[@id='compra-select-origin']")
		private WebElement fromFlight;
		
		@FindBy(xpath="//input[@id='compra-select-destination']")
		private WebElement toFlight;
		
		@FindBy(xpath="//input[@class='showDepartureOnly']")
		private WebElement trip;

		@FindBy(xpath="//div[@class='box-input dropdown-active']")
		private WebElement dateDeparture;
		
		@FindBy(xpath="(//a[text()='4'])[1]")
		private WebElement dateExact;

		@FindBy(xpath="//div[@class='box-input dropdown-active']")
		private WebElement nPassengers;
		
		@FindBy(xpath="(//span[@class='input-group-btn more'])[1]")
		private WebElement increaseAdultNumber;
		
		@FindBy(xpath="//input[@id='compra-cabins-id']")
		private WebElement cabin;
		
		@FindBy(xpath="//a[text()='Premium Business']")
		private WebElement cabinType;
		
		@FindBy(xpath="//button[text()='Search for your flight']")
		private WebElement btnSearch;

		public WebElement getFromFlight() {
			return fromFlight;
		}

		public WebElement getToFlight() {
			return toFlight;
		}

		public WebElement getTrip() {
			scrollDown(trip);
			return trip;
		}

		public WebElement getDateDeparture() {
			scrollDown(dateDeparture);
			return dateDeparture;
		}

		public WebElement getDateExact() {
			scrollDown(dateExact);
			return dateExact;
		}
		
		public WebElement getnPassengers() {
			scrollDown(nPassengers);
			return nPassengers;
		}
		
		public WebElement getIncreaseAdultNumber() {
			scrollDown(increaseAdultNumber);
			return increaseAdultNumber;
		}

		public WebElement getCabin() {
			scrollDown(cabin);
			return cabin;
		}
		
		

		public WebElement getCabinType() {
			scrollDown(cabinType);
			return cabinType;
		}

		public WebElement getBtnSearch() {
			scrollDown(btnSearch);
			return btnSearch;
		}
		
		
		
		
		
}
