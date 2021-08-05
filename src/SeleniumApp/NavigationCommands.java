package SeleniumApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vista\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Dynamic binding

        driver.get("https://www.google.com"); //Open the browser with given URL
        System.out.println("Window 1 -" + driver.getTitle()); //Get the title of the opened website

        driver.navigate().to("https://www.amazon.com"); //Naviagte from the URL to the given URL
        System.out.println("Window 2 -" +driver.getTitle()); //Get the title of the opened website

        driver.navigate().back(); //Navigates the window to the previous window - to Google.com
        System.out.println("Window after back() navigation -" + driver.getTitle()); //Get the title of the opened website

        driver.navigate().forward(); //Navigates the window to go forward - to Amazon.com
        System.out.println("Window after forward() navigation -" + driver.getTitle()); //Get the title of the opened website

        driver.navigate().refresh(); //Refreshes the window

        driver.quit();

    }
}
