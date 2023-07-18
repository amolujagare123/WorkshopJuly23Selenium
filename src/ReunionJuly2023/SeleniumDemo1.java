package ReunionJuly2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("http://facebook.com");

    }
}
