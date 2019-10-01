package org.latam.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends Base{
	public static void main(String[] args) throws Exception {
		
		launch("https://www.latam.com/en_ca/");
		Thread.sleep(10000);
		findById("onesignal-popover-cancel-button").click();
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s1.jpg");
		
		findById("loginLatamBox").click();
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s2.jpg");
		Robot r = new Robot();
		Actions a = new Actions(d);

		LoginPage page1 = new LoginPage();
		type(page1.getTxtUser(), "saravananr01011990@gmail.com");
		type(page1.getTxtPass(), "Jaihind_1");
		click(page1.getBtnLogin());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s3.jpg");
		
		SearchPage page2 = new SearchPage();
		type(page2.getFromFlight(), "Ottawa");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		type(page2.getToFlight(), "Santiago");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		click(page2.getTrip());
		click(page2.getDateDeparture());
		a.moveToElement(page2.getDateExact()).click().perform();
		click(page2.getnPassengers());
		click(page2.getIncreaseAdultNumber());
		click(page2.getCabin());
		click(page2.getCabinType());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s4.jpg");
		click(page2.getBtnSearch());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s5.jpg");
		
		SelectionPage page3 = new SelectionPage();
		click(page3.getSelectFlight());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s6.jpg");
		click(page3.getContinueSelect());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s7.jpg");
		
		PassengerDetails page4 = new PassengerDetails();
		type(page4.getTxtName(), "Saran");
		type(page4.getTxtLastName(), "San");
		type(page4.getTxtDoBDay(), "01");
		selectByVisibleText(page4.getSelDoBMon(), "January");
		type(page4.getTxtDoBYear(), "1990");
		selectByVisibleText(page4.getSelDoBGender(), "Male");
		type(page4.getTxtName2(), "Saravan");
		type(page4.getTxtLastName2(), "Sar");
		type(page4.getTxtDoBDay(), "10");
		selectByVisibleText(page4.getSelDoBMon(), "January");
		type(page4.getTxtDoBYear(), "1994");
		selectByVisibleText(page4.getSelDoBGender(), "Female");
		type(page4.getTxtEmailAddress(), "sarava231@gmail.co");
		selectByValue(page4.getSelDoBGender(), "IN");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		type(page4.getTxtAreaCode(), "12");
		type(page4.getTxtMob(), "9598978487");
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s8.jpg");
		click(page4.getBtnSubmit());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s9.jpg");
		
		SeatSelectionPage page5 = new SeatSelectionPage();
		click(page5.getBtnConfirm());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s10.jpg");
		click(page5.getBtnContinue());
		screenshot("E:\\Selenium\\LatamCanada\\Screenshots\\s11.jpg");
		
		
		
		
	}

}
