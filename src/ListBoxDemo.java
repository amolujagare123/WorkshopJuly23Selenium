import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the web element
        WebElement jobLocation = driver.findElement(By.name("source_118[]"));

        // 2.create the object of select class
        Select selJobLocation = new Select(jobLocation);

        Thread.sleep(4000);
        // 3. select the option
        selJobLocation.selectByVisibleText("Bangalore");
        selJobLocation.selectByValue("2");
        selJobLocation.selectByIndex(3);

        Thread.sleep(4000);
        selJobLocation.deselectByIndex(3);
        selJobLocation.deselectByValue("2");
        selJobLocation.deselectByVisibleText("Bangalore");

    }
}
