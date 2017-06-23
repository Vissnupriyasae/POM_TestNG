package com.priya.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By titleText = By.xpath("div[@id='logo']/a");
	By logo = By.cssSelector("/html/body/div[1]/div[1]/a/img");
	By searchBox = By.id("q");
	
	public HomePage(WebDriver driver){

        this.driver = driver;

    }

	public String getTitleText() {
		return driver.findElement(titleText).getText();
	}

	public void setTitleTest(By titleTest) {
		this.titleText = titleTest;
	}

	public String getLogo() {
		return driver.findElement(logo).getText();
	}

	public void setLogo(By logo) {
		this.logo = logo;
	}

	public Boolean SearchBox() {
		return driver.findElement(searchBox).isDisplayed();
	}

	public void setSearchBox(By searchBox) {
		this.searchBox = searchBox;
	}
	
	
	
	

}
