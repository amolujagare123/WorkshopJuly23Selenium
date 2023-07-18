package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org1");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();

        WebDriver driver2 =new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername2 = driver2.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername2.sendKeys("fsfsfs");

        WebElement txtPassword2 = driver2.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword2.sendKeys("fsfsf");

        WebElement btnLogin2 = driver2.findElement(By.xpath("//input[@name='submit']"));
        btnLogin2.click();

        WebDriver driver3 =new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername3 = driver3.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver3.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver3.findElement(By.xpath("//input[@name='submit']"));
        btnLogin3.click();

    }
}
