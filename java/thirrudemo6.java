import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirrudemo6{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        Alert alt=driver.switchTo().alert();
        alt.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        Alert llt=driver.switchTo().alert();
        llt.accept();
        driver.findElement(By.id("confirmButton")).click();
        Alert mmt=driver.switchTo().alert();
        mmt.dismiss();
        driver.findElement(By.id("promtButton")).click();
        Alert sst=driver.switchTo().alert();
        sst.sendKeys("Ramasani");
        sst.accept();

    }
}
