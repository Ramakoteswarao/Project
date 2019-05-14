package com.selenium.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Orangelogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
  driver.manage().window().maximize();
  driver.findElement(By.className("")).click();
  driver.navigate().back();
	

	}

}
