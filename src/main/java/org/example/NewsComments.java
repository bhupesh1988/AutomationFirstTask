package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {
    static WebDriver driver;

    public static void main(String[] args) {
        //select Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver=new ChromeDriver();
       // type demo nopcommerce url link
        driver.get("https://demo.nopcommerce.com/");
        // Click on news details
        driver.findElement(By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[2]/div[3]/a")).click();
        //type Title
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Very User Friendly");
        // type Comment
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("nopcommerce web Site is very User Friendly easy to assess ");
        //click on new comments
        driver.findElement(By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]")).click();
        // user will get the Result
       String news = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        System.out.println("Expected result (News comment is successfully added) Actual Result :-"+ news);
}}
