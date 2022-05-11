package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebelemntMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramakutusu =driver.findElement(By.id("twotabsearchtextbox"));
        //2- arama kutusunun tagName'inin input oldugunu test edin
        String expectedTagName = "input";
        String actualTagName = aramakutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("passed");
        }else{
            System.out.println("faelled");
        }
        //3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
        String expectedNameDegeri= "field-keywords";
        String actualNameDegeri = aramakutusu.getAttribute("name");
        if (expectedNameDegeri.equals(actualTagName)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILLED");
        }
        driver.close();

    }
}
