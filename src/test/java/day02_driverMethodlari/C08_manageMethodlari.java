package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // max iken boyutlar
        System.out.println("max konum  : " + driver.manage().window().getPosition());
        System.out.println("max boyut : "+ driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        // full iken boyutlar
        System.out.println("full da konum  : " + driver.manage().window().getPosition());
        System.out.println("full da boyut : "+ driver.manage().window().getSize());


        driver.close();
    }
}
