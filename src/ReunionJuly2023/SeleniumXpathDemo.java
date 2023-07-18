package ReunionJuly2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.ArrayList;

public class SeleniumXpathDemo {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        driver.navigate().refresh();


       driver.findElement(By.xpath("//li[contains(@class,'wrapFilter')][3]")).click();

        //li[contains(@class,'wrapFilter')][p[contains(text(),'Senior')]]



      //  By checkBoxElement = RelativeLocator.with(By.tagName("li")).above(By.id("//li[contains(@class,'wrapFilter')][3]/p"));

       // driver.findElement(By.xpath("//li[contains(@class,'wrapFilter')][3]/p")).click();

     //   driver.findElement(checkBoxElement).click();




    }
}
