import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        WebElement javaCheckbox = driver.findElement(By.id("check0"));
        WebElement seleniumCheckbox = driver.findElement(By.id("check1"));
        WebElement cucumberCheckbox = driver.findElement(By.id("check2"));

        System.out.println(javaCheckbox.isSelected()); // true
        System.out.println(seleniumCheckbox.isSelected()); //  false
        System.out.println(cucumberCheckbox.isSelected());// false


        seleniumCheckbox.click();
    }
}
