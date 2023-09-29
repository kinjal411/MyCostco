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
import org.openqa.selenium.support.PageFactory;
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
public class CostcoLoginTest {
    
    private static WebDriver driver;
    private String baseUrl;
    
    public CostcoLoginTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    ChromeOptions options = new ChromeOptions(); 
    options.addArguments("--headless"); 
    options.addArguments("--disable-gpu"); 
    options.addArguments("--window-size=1400,800");
    WebDriver driver = new ChromeDriver(options);
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
    @Test  // login test
    public  void executeLoginPageModule() throws Exception {
       
        driver.manage().window().maximize(); 
        CostcoLogin loginpage = PageFactory.initElements(driver, CostcoLogin.class);
        loginpage.LoginToCostco("archita.singh16@gmail.com", "!Archishri123");
        
    }
    
    //@Test   // logout test
    public void executeLogoutPage() throws Exception {
        CostcoLogOut logout = PageFactory.initElements(driver, CostcoLogOut.class);
        logout.CostcoLogOut();
        
        
     }
    
    
}
    
    
    
  
