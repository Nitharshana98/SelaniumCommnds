package SeleniumApp;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookieCommands {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vista\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver(); //Dynamic binding

            driver.get("https://www.google.com"); //Open the browser with given URL
            System.out.println(driver.getTitle()); //Get the title of the opened website

            Set<Cookie> cookies = driver.manage().getCookies(); // return the cookies available with relevant to the browser

            for(Cookie cookie :cookies){
                System.out.println(cookie + "/n");//print each and every cookie
            }

            driver.manage().deleteAllCookies();
            System.out.println("All cookies deleted"); // delete all the cookies

//            driver.manage().getCookieNamed(111) //get the cookie with the specific name
//            driver.manage().deleteCookie(111);  //delete the cookie with the specific name
//            driver.manage().addCookie(111);     //create and add cookie with specific given name

            driver.quit();

        }
}
