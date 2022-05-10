package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        // https:www.amazon.com url le gidiin
        // basligin Amazon kelimesi icerdigini test edin
        // url in "// https:www.amazon.com url le gidiin" esit oldugunu test edin
        // sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // https:www.amazon.com url le gidiin
        driver.get("https://www.amazon.com");

        // basligin Amazon kelimesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime ="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title "+ arananKelime +" yi icermiyor, title tasti FAILED");
        }
        // url in "// https:www.amazon.com url le gidiin" esit oldugunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL testi PASSED");
        }else{
            System.out.println("url testi FAILED");
        }
        // sayfayi kapatin
        driver.close();
    }
}
