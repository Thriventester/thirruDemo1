import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.xpath.XPathNamespace;

import java.io.File;
import java.io.IOException;

public class thirruDemo4 {
public static void main(String[] args) throws IOException {
    System.setProperty("webdriver.chrome.driver","D://chromedriver-win64//chromedriver-win64//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().maximize();
    driver.manage().window().maximize();
    driver.findElement(By.name("firstName")).sendKeys("Ramasani");
    driver.findElement(By.name("lastName")).sendKeys("Thriven Kumar");
    driver.findElement(By.name("phone")).sendKeys("6302624003");
    driver.findElement(By.id("userName")).sendKeys("ramasanithrivenkumar@gmail.com");
    driver.findElement(By.name("address1")).sendKeys("Hasnabad");
    driver.findElement(By.name("city")).sendKeys("Hyderabad");
    driver.findElement(By.name("state")).sendKeys("Telangana");
    driver.findElement(By.name("postalCode")).sendKeys("507161");
    driver.findElement(By.name("country")).sendKeys("INDIA");
    driver.findElement(By.name("email")).sendKeys("thrivenkumar");
    driver.findElement(By.name("password")).sendKeys("12345678");
    driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
    File rtkFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(rtkFile,new File("D://Registrationnewtours.jpg"));
    driver.findElement(By.name("submit")).click();
    File mtkFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(mtkFile,new File("D://Registrationnewtours2.jpg"));



}

}
