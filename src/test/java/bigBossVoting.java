import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigBossVoting {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ME\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://telugubiggboss.com/star-maa-bigg-boss-vote/");
        driver.get("https://biggbossvotetelugu.info/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        System.out.println(("scrolling done"));
        driver.findElement(By.xpath("//div[@id='PDI_container10967724'])")).click();
        System.out.println("elemet box found");


    }
}
