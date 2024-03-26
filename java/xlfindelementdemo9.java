import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xlfindelementdemo9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("customers"));
        List<WebElement> list = element.findElements(By.tagName("tr"));
        for (int i = 0; i < list.size(); i++) {
            if (i==0){
                List<WebElement> tableHeader = list.get(i).findElements(By.tagName("th"));
                for (int j=0;j<tableHeader.size();j++){
                    System.out.print(tableHeader.get(j).getText());

                }
                List<WebElement> tabledata = element.findElements(By.tagName("td"));
                for (int j=0; j<tabledata.size();j++){
                    System.out.println(tabledata.get(j).getText());
                    driver.quit();
                }


            }
        }

    }
}