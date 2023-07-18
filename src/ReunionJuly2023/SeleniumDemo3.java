package ReunionJuly2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SeleniumDemo3 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("http://facebook.com");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

       // driver.findElement(By.linkText("Forgot your password?")).click();
       driver.findElement(By.linkText("Learn more")).click();



    }
}
