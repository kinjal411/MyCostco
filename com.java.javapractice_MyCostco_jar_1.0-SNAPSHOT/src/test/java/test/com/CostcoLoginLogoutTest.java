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
public class CostcoLoginLogoutTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public CostcoLoginLogoutTest() {
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
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  // implicit wait// it wait until 30 sec

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        Thread.sleep(5000);
        driver.close();
    }  
        
  @Test
  public void testCostcoLoginLogout() throws Exception {
      
    driver.manage().window().maximize();
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_567/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=zCzXXaBuoIZBXdkB&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.findElement(By.id("signInName")).click();
    //driver.findElement(By.id("signInName")).clear();
    driver.findElement(By.id("signInName")).sendKeys("archita.singh16@gmail.com");
    driver.findElement(By.id("password")).click();
   // driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("!Archishri123");
    driver.findElement(By.id("next")).click();
    
   
   driver.get("https://www.costco.com/?langId=-1&krypto=qx%2FNZfbZS7uSypGs4PMliR9JQSjA%2F8%2BQlVjpYePXMaQ1%2BMnBsnJ1913KqNrqrz3WpoAxIMeWt4IcxettTJWIwOxViRIA12uQ8z7aMswdKTHfJ1wt99x%2FKX2oMTf7xdnlXc2wDV4U6Zp29XUEzP1VQpisbd8fdQGB%2FLxoRO2fgzxbeo2%2BLGnxWSTT3gGa5M%2FkoYwVtwEg9xjrPkZsrNNXn8JeviVAP2%2FD6qVPEC2w1g6NnHsK8ctWuxHWLZIGtuLYMglVHBhFkC4a6uqCd6rcVA%3D%3D");
   WebElement elem1 = driver.findElement(By.id("Home_Ancillary_0"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform(); 
        
    driver.findElement(By.linkText("Organic")).click();
    driver.get("https://www.costco.com/organic-groceries.html");
    
//    WebDriverWait wait = new WebDriverWait(driver, 40);
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myaccount-react-d\"]")));
//    
//    driver.findElement(By.xpath("//*[@id=\"myaccount-react-d\"]")).click();
//    driver.findElement(By.xpath("//li[@id='mi_signout']/a/span")).click();
    
  }
}



