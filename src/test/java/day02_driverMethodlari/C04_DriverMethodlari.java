package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        //amazon sitesine gidip kaynak kodlarinda "spend less" yazdigini test et
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String sayfaKodlari = driver.getPageSource();
        System.out.println("sayfa kaynak kodlari");
        String arananKelime = "Spend less";
        if (sayfaKodlari.contains(arananKelime)){
            System.out.println("kaynak kodu testi PASSED");
        }else{
            System.out.println(" kaynak kodlari "+ arananKelime+ " YOK testi FAILLED");
        }
        driver.close();
    }
}
