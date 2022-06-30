package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		//step1
		driver.get("https://www.amazon.in/");
		
		//step2
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Refrigerator");
		 
		 //step3&4
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//step5
		WebElement we=driver.findElement(By.xpath("//span[@class='a-price'])[3]"));
		String pri=we.getText();
		String con=".00";
		String price1=pri.concat(con);
		System.out.println(price1);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		
		
				
		

		
		
	}

}
