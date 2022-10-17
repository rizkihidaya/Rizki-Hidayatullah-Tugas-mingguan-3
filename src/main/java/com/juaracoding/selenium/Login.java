package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;



public class Login {
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
        driver.findElement(By.id("username")).sendKeys("rizki_h1");
        System.out.println("input username");
        driver.findElement(By.id("password")).sendKeys("@rizki03081996");
        System.out.println("input password");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/form[1]/p[3]/button[1]")).click();
        System.out.println("login berhasil");
        //delay(detik);
        //driver.findElement(By.id("rememberme")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
        System.out.println("order");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
        System.out.println("browse purchased");
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
        //delay(detik);
        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.deselectByValue("black");
        Select Size = new Select(driver.findElement(By.id("pa_size")));
        Size.selectByValue("34");
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/i[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();
        //driver.findElement(By.id("reg_password")).sendKeys("P@ssw0rd123");
        //System.out.println("input password");
        //driver.findElement(By.xpath("//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[4]/button[1]")).click();
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
