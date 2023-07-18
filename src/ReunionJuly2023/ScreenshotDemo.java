package ReunionJuly2023;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void screenshotDemo() throws IOException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");

        // 1. create an object reference of TakesScreenshot
        // Assign current driver to it,
        // typecast the driver into TakesScreenshot

       // TakesScreenshot ts = (TakesScreenshot) driver;

     //   WebElement javaImage = driver.findElement(By.xpath("//div[@class='card-header bg-transparent border-0 text-center py-0']//img[@alt='Java']"));

        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='other languages exist']"));
        File srcFile = element.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        FileUtils.copyFile(srcFile,new File("D:\\programs\\"+fileName));
    }
}
