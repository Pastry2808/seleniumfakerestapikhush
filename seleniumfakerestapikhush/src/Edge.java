import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://fakerestapi.azurewebsites.net/index.html");
        String titleOfPage = driver.getTitle();
        System.out.println(titleOfPage);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getPageSource());
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
    }
}
