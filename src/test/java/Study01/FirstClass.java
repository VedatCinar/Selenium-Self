package Study01;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 1-driver.get ("url") -> Yazdigimiz urlye gider
        driver.get("https://www.amazon.com");

        // 2-driver.getTitle() -> icinde oldugu sayfanin basligini dondurur
        System.out.println("Title = "+driver.getTitle());

        // 3-driver.getCurrentUrl() -> icinde oldugu sayfanin URL'sini dondurur
        System.out.println("URL = "+driver.getCurrentUrl());

        // 4-driver.getPageSource() - > sayfanin kaynak kodlarini String olarak dondurur

        // 5-driver.getWindowHandle() -> sayfanin Unique hash code dondurur
    }
}
