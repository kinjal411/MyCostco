/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kinjal patel
 */
public class CostcoOpticalTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public CostcoOpticalTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // implicit wait// it wait until 30 sec
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        Thread.sleep(5000);
        driver.close();
    }
    
     @Test
  public void testUntitledTestCase() throws Exception {
    
    driver.manage().window().maximize();
    driver.get("https://www.costco.com/");
    WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_4\"]"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform();  
    driver.findElement(By.linkText("Shop Optical")).click();
    driver.findElement(By.linkText("Shop Eyeglasses")).click();
    driver.get("https://glasses.costco.com/");
    driver.findElement(By.linkText("Shop Your Style")).click();
    driver.findElement(By.xpath("//*[@id=\"color-fieldset\"]/ul/li[11]/label"));
    driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div[4]/div[11]/h2/a")).click();
    
    
    
//    driver.get("https://glasses.costco.com/Shop/Frame/kirkland-signature-luke/blue");
//    driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/div/div[2]/button")).click();
//    driver.get("https://glasses.costco.com/Shop/Frame/kirkland-signature-luke/blue/VisionType");
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/div/div[1]/div[1]/div/label/span")).click();
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/div/input")).click();
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/div/div[2]/div[1]/div/label/span")).click();
//    
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/input")).click();
//    
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/div/div[1]/div[1]/div[1]/label/span")).click();
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/input")).click();
//   
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/div/div[1]/div[1]/div[1]/label/span")).click();
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/form/fieldset/div/input")).click();
//    driver.findElement(By.xpath("//*[@id=\"rx-container-inner\"]/div[1]/div[2]/a")).click();


    
    
    
    
    
   
  }

}
  

    

