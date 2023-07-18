import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

     //   driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

        driver.findElement(By.name("name")).sendKeys("Shifa");
        driver.findElement(By.name("address")).sendKeys("ayz abcd");
        driver.findElement(By.name("contact1")).sendKeys("4243553545");
        driver.findElement(By.name("contact2")).sendKeys("768798989");
        driver.findElement(By.name("Submit")).click();



    }
}
