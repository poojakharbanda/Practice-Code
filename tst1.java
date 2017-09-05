import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tst1

{
@Test
    public static void main(){
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://www.google.co.nz/");
    driver.findElement(By.id("lst-ib")).sendKeys("My first test");
    driver.findElement(By.name("btnK")).click();
}
}
