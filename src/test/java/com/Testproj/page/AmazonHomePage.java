package com.Testproj.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
 private WebDriver driver;

 private By Searchbox = By.xpath("//input[@id='twotabsearchtextbox']");
private By IphoneBlue = By.xpath("//span[normalize-space()='iPhone 13 (128GB) - Blue']");
private By PriceIphone = By.xpath("//span[normalize-space()='51,499']");



 public void SearchforMobile(){
     driver.findElement(Searchbox).sendKeys("Mobile");
 }

 public void ClickonPhone(){
     driver.findElement(IphoneBlue).click();
 }

 public String ValidatePrice(){
     String mobilePrice=driver.findElement(PriceIphone).getText();
     return mobilePrice;
 }
}
