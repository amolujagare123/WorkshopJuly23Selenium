package Day4;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Screenshots {

    @Test
    public void screenshotDemo() throws IOException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        // 1. create an object reference of TakesScreenshot
        // Assign current driver to it,
        // typecast the driver into TakesScreenshot

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. Call getScreenshotAs() method using ts
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile, new File("D:\\programs\\"+fileName));
    }

}
