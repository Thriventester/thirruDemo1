import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirrudemo3 {
    public static void main(String []args) {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard-user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//*[contains(@class,'product_sort_container')]")).click();
        driver.findElement(By.xpath("//*[contains(@value,'lohi')]"));
        driver.findElement(By.id("add-to-cart-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.xpath("//*[@class,'shopping_cart_link')]")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Ramasani");
        driver.findElement(By.id("last-name")).sendKeys("Thriven kumar");
        driver.findElement(By.id("postal-code")).sendKeys("507161");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();







    }
}
