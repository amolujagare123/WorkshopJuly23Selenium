import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/");

        // 1. find the web element
        WebElement status = driver.findElement(By.name("cm"));

        // 2.create the object of select class
        Select selStatus = new Select(status);

        Thread.sleep(4000);
        // 3. select the option
      //  selStatus.selectByVisibleText("Other");
      //  selStatus.selectByValue("No religion");
        selStatus.selectByIndex(9);

    }
}
