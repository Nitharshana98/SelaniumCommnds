package SeleniumApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class WebDriverCommands {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vista\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Dynamic binding

        driver.get("https://www.google.com"); //Open the browser with given URL
        System.out.println(driver.getCurrentUrl()); //Prints the Currently opened website's URL
        System.out.println(driver.getTitle()); //Get the title of the opened website
        System.out.println(driver.getPageSource()); // Prints the source code of the URL
        System.out.println(driver.getWindowHandle()); //Prints the unique ID of the current tab
        System.out.println(driver.getWindowHandles()); // Prints the unique ID of the all the tabs opened as a Set
        System.out.println(driver.getClass()); //returns the run time class name of the object

        driver.close(); //closes the current window the web driver is accessing
//        driver.quit(); // closes all the windows that are opened

    }
}
