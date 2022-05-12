package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme_03 {
    //Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //        a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
       //b. Sign in butonuna basin
        WebElement singbutton = driver.findElement(By.linkText("Sign in"));
        singbutton.click();
       //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));
       //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
       //i. Username : testtechproed@gmail.com
       //ii. Password : Test1234!
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();
       //        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement userdogrulama = driver.findElement(By.className("navbar-text"));
        //System.out.println(userdogrulama.getText()); yazdirmasam olur
        String userdogrulamak ="testtechproed@gmail.com";
        if (userdogrulamak.equals(userdogrulama.getText())){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILLED");
        }
        //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement address1 = driver.findElement(By.linkText("Addresses"));
        if (address1.isDisplayed()) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILLED");
        }
        WebElement singout = driver.findElement(By.linkText("Sign out"));
        if (singout.isDisplayed()) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILLED");
        }
       //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> sayfalinksayisi = driver.findElements(By.tagName("a"));
        System.out.println("link sayisi : "+sayfalinksayisi.size());
        //linkleri yazdirma
        for (WebElement isim:sayfalinksayisi) {
            System.out.println(isim.getText());
        }
        //kapat
        driver.close();




    }
}
