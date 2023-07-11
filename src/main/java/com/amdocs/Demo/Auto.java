package com.amdocs.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("https://www.techbeamers.com");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.findElement(By.xpath("/html/body/div[1]/header/div/div/div[1]/div/div/div[1]/nav/ul/li[1]/a")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("/html/body/div[1]/header/div/div/div[1]/div/div/div[1]/nav/ul/li[1]/ul")).click();
	}

}
