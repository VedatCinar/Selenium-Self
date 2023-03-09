package Study01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        // driver.navigate ile sayfalar arasinda dolasma imkani var
        driver.navigate().to("https://www.facebook.com");

//        driver.navigate().back(); -- > bir onceki sayfaya geri donus yapar
        driver.navigate().back(); // ornegimizde amazona geri donecektir
        driver.navigate().forward(); // tekrar facebooka geri donus yapacaktir
        driver.navigate().refresh(); // icinde bulundugu sayfayi yeniler
        driver.close(); //driver olusturuldugunda acilan sayfayi kapatir
        driver.quit(); // driver calisirken birden fazla tab ve window actiysa hepsini kapatir







    }
}
