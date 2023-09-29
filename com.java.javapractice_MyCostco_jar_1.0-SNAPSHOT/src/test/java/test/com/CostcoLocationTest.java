/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class CostcoLocationTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public CostcoLocationTest() {
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
        Thread.sleep(3000);
        driver.close();
    }
    
    @Test
  public void testCostco() throws Exception {
    driver.manage().window().maximize();
    driver.get("https://www.costco.com/");
    driver.findElement(By.linkText("Locations")).click();
    driver.findElement(By.id("search-warehouse")).click();
    driver.findElement(By.id("search-warehouse")).clear();
    driver.findElement(By.id("search-warehouse")).sendKeys("schaumburg");
    driver.findElement(By.id("search-warehouse")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//table[@id='warehouse-list']/tr/td[2]/div/div/span")).click();
   }

 }


