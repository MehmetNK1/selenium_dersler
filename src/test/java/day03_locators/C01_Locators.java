package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona git nutella arat
        driver.get("https://www.amazon.com");

        // findElement(By .... locator) --> istedigimiz web elementini bize dondurur
        // biz de o webelementini kullanmak icin bir objeye assign ederiz
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //WebElement aramaKutusu= driver.findElement(By.name("field-keywords"));
       /* WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
           Bu locator calismadi
           Locator alirken gozumuzden kacan detaylar olabilir
           aldigimiz bir locator calismazsa alternatif locator'lar denemeliyiz

         bu islemi html de kodun usdune sag tik > cod kopy > copy element

        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute"
        dir="auto" tabindex="0" aria-label="Search">
         */
        // herhangi bir webelementine istedigimiz yaziyi yollamak istersek
        aramakutusu.sendKeys("nutella"+ Keys.ENTER);

        //Thread.sleep(2000);

        //sayfayi kapat
        //driver.close();
    }
}
