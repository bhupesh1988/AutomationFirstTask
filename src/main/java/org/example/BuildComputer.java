package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuildComputer {
    static WebDriver driver;

    public static void main(String[] args) {
        //select Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //type url link
        driver.get("https://demo.nopcommerce.com/");
        //click on build your own computer picture
        driver.findElement(By.xpath("//img[@alt=\"Picture of Build your own computer\"]")).click();
        // find build your own computer text
        String build = driver.findElement(By.xpath("//div[@class=\"product-name\"]/h1")).getText();
        System.out.println("Expected result (Build you on computer) Actual Result :-"+ build);
    }}