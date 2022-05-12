package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasinda kac tane link bulundugunu yazdiralim
        driver.get("http://amazon.com");
        //sayfayi saydirma
        List<WebElement>linklerListesi= driver.findElements(By.tagName("a"));
        //yazdir
        System.out.println("link sayisi "+linklerListesi.size());
        //kapat
        driver.close();
    }
}
