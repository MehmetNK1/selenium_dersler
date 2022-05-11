package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasinda kac tane link bulundugunu yazdiralim
        driver.get("https://www.amazon.com");

        //saydirma
        List<WebElement> linkListesi =driver.findElements(By.tagName("a"));

        //yazdirma
        System.out.println("link sayisi "+linkListesi.size());

        //kapat
        driver.close();
    }
}
