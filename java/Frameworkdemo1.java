import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkdemo1 {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        String value= driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(value);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
       String value1= driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(value1);


    }
}
