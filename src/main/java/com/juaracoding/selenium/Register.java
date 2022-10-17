package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Register {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the demoqa website
        String url = "https://shop.demoqa.com/my-account/";

        driver.get(url);
        //driver.get("https://shop.demoqa.com/");
        int detik =1;
       String titleName = driver.getTitle();
        System.out.println(titleName);

        JavascriptExecutor js = (JavascriptExecutor) driver;

       delay(detik);
        driver.findElement(By.id("reg_username")).sendKeys("rizkii_h0");
        System.out.println("input username");
        driver.findElement(By.id("reg_email")).sendKeys("rizki.hidayatullah110@gmail.com");
        System.out.println("input user email");
        driver.findElement(By.id("reg_password")).sendKeys("P@ssw0rd123");
        System.out.println("input password");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[4]/button[1]")).click();
    }

    static void delay(int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
