package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    static WebDriver driver;
    public static void main(String[] args) {
        //select Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //type url link
        driver.get("https://demo.nopcommerce.com/");
        //click on register page
        driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
        //write user first name
        driver.findElement(By.id("FirstName")).sendKeys("bhupesh");
        //write user last name
        driver.findElement(By.id("LastName")).sendKeys("patel");
        //write user valid user email id
        driver.findElement(By.id("Email")).sendKeys("bhupesh@gmail.com");
        // write user password
        driver.findElement(By.id("Password")).sendKeys("bhup789");
        //Write user confirm password.
        driver.findElement(By.id("ConfirmPassword")).sendKeys("bhup789");
        //click on the register button.
        driver.findElement(By.id("register-button")).click();
        //user will get output that user can able to successfully registered or user can not be able to registered.
        String registration = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        System.out.println("Expected result (Your registration completed) Actual Result :-"+ registration);


    }
}

