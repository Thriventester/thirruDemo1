import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkdemo2 {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ramasani");
        driver.switchTo().defaultContent();

       driver.switchTo().frame("Iframe with in an Iframe");
        driver.findElement(By.xpath("//*[.='Iframe with in an Iframe']")).click();

        String rr= driver.findElement(By.xpath("//h5[.='Nested iFrames']")).getText();
        System.out.println(rr);






    }
}
