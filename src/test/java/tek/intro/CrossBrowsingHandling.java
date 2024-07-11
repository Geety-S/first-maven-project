package tek.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser type");
        String browserType = "chrome";

        WebDriver driver;

        if (browserType.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if (browserType.equals("firefox")){
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Wrong driver");
        }
            driver.get("https://google.com");
            driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println(title);
            driver.quit();
    }
}
