import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class thirrudemo7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/alerts");
        driver.navigate().back();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
        driver.findElement(By.xpath("//*[text()='New Tab']")).click();
        String part = driver.getWindowHandle();

        Set<String> win = driver.getWindowHandles();
        for (String handle : win) {
            driver.switchTo().window(handle);
        }
        String value = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(value);
        driver.close();
        driver.switchTo().window(part);
        driver.findElement(By.xpath("//*[text()='New Window']")).click();
        System.out.println("hii");
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();


    }
}