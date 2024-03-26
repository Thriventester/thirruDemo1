import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirrudemo5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='SwitchTo']")).click();
        driver.findElement(By.xpath("//*[text()='Alerts']")).click();
        driver.findElement(By.xpath("//*[text()='Alert with OK ']")).click();
        driver.findElement(By.xpath("//*[contains(@class,'btn btn-danger')]")).click();
        Alert alt=driver.switchTo().alert();
        alt.accept();
        driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary')]")).click();
        Alert Lt=driver.switchTo().alert();
        Lt.dismiss();
        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//*[contains(@onclick,'promptbox()')]")).click();
        Alert mlt=driver.switchTo().alert();
        mlt.sendKeys("Ramasani");
        mlt.accept();



    }
}
