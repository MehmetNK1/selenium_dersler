package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

       //        a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("http://www.amazon.com");

       //b. Search(ara) “city bike”
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike"+ Keys.ENTER);

       //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> isteneneleman = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucyazisi= isteneneleman.get(0);
        System.out.println(sonucyazisi.getText());

       //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        //List<WebElement> urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkuruntiklama = driver.findElement(By.className("s-image"));
        ilkuruntiklama.click();

        //
    }
}
