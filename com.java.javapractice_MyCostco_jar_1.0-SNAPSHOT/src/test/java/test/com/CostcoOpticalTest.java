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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    ChromeOptions options = new ChromeOptions(); 
    options.addArguments("--headless"); 
    options.addArguments("--disable-gpu"); 
    options.addArguments("--window-size=1400,800");
    WebDriver driver = new ChromeDriver(options);
    
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
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shop Optical")));

    driver.findElement(By.linkText("Shop Optical")).click();
    driver.findElement(By.linkText("Shop Eyeglasses")).click();
    driver.get("https://glasses.costco.com/");
    driver.findElement(By.linkText("Shop Your Style")).click();
    driver.findElement(By.xpath("//*[@id=\"color-fieldset\"]/ul/li[11]/label"));
    driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div[4]/div[11]/h2/a")).click();  
   
  }

}
  

    

