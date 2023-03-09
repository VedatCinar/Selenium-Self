package Study01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*  1  driver.manage().window() methodlari*/

       //  1-A ) driver.manage().window().getSize(); -> Icinde bulundugumuz sayfanin olculerini dondurur
        System.out.println(driver.manage().window().getSize()); // pixel olcusu
       // 1-B) driver.manage().window().getPosition(); -> Pixel kordinatlarini verir Selenium sol alttan baslar
        System.out.println(driver.manage().window().getPosition());
        // 1-C) driver.manage().window().setPosition(new Point (x,y)); -> Pixel atamasi saglar
        driver.manage().window().setPosition(new Point(15,15));
       // 1-D) driver.manage().window().setSize(new Dimension (x,y));
        driver.manage().window().setSize(new Dimension(900,600));
       // 1-E ) driver.manage().window().maximize() ; -> icinde oldugu sayfayi maximize eder
        driver.manage().window().maximize();
        System.out.println("Maximize konum = "+driver.manage().window().getPosition());
        System.out.println("Maximize boyut = "+driver.manage().window().getSize());
        // 1-F) driver.manage().window().fullscreen() ; -> icinde oldugu sayfayi fulscreen yapar
        driver.manage().window().fullscreen();
        System.out.println("Maximize konum = "+driver.manage().window().getPosition());
        System.out.println("Maximize boyut = "+driver.manage().window().getSize());
       //1-G ) driver.manage().window().minimize(); -> icinde oldugu sayfayi simge boyutunde kucultur

        /*driver.manage().timeouts() methodlari */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*implicityWait : driver'a sayfanin yuklenmesi ve kullanacagimiz web elementlerin bulunmasi icin
                                          bekleyecegi max sureyi belirtir.
                                          driver bu sure icerisinde sayfa yuklenir / web element bulunursa beklemeden
                                          calismaya evam eder.
                                          bu sure bittigi halde sayfa yuklenmemis/web element bulunmamissa
                                          exception vererek calismayi durdurur
         */

    }
}
