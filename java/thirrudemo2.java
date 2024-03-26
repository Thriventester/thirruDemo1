import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirrudemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(@placeholder,'First Name')]")).sendKeys("Ramasani");
        driver.findElement(By.xpath("//*[contains(@placeholder, 'Last Name')]")).sendKeys("Thriven Kumar");
        driver.findElement(By.xpath("//*[contains(@ng-model, 'Adress')]")).sendKeys("Hasnabad");
        driver.findElement(By.xpath("//*[contains(@type, 'email')]")).sendKeys("ramasanithrivenkumar@gmai.com");
        driver.findElement(By.xpath("//*[contains(@type, 'tel')]")).sendKeys("6302624003");
        driver.findElement(By.xpath("//*[contains(@value, 'Male')]")).click();
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("Skills")).sendKeys("Adobe Photoshop");
        driver.findElement(By.xpath("//*[contains(@id, 'yearbox')]")).sendKeys("1999");
        driver.findElement(By.xpath("//*[contains(@placeholder, 'Month')]")).sendKeys("September");
        driver.findElement(By.xpath("//*[contains(@id, 'daybox')]")).sendKeys("26");
        driver.findElement(By.id("firstpassword")).sendKeys("kanna123");
        driver.findElement(By.id("secondpassword")).sendKeys("Kanna123");
        driver.findElement(By.id("submitbtn")).click();




    }
}