import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
        btnLogin.click();



    }
}
