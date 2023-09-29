/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author kinjal patel
 */
public class CostcoLogin {
    
    WebDriver driver;
    public CostcoLogin(WebDriver driver) {
    this.driver = driver;
    
    }
    
    @FindBy(id = "header_sign_in")
    private WebElement register;

    @FindBy(xpath = "//*[@id=\"signInName\"]")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"next\"]")
    private WebElement submit;
    
    
//    @FindBy(xpath = "//*[@id=\"myaccount-react-d\"]")
//    private WebElement account;
    
//    @FindBy(xpath = "//button[contains(text(), 'Sign')]")
//    private WebElement submit;
    
    

    public void LoginToCostco(String email, String pWord)
            throws Exception {
        try {
            driver.get("https://costco.com/");
            register.click();
            emailAddress.sendKeys(email);
            password.sendKeys(pWord);
            
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"next\"]")));
            submit.click();
            Thread.sleep(3000);
            
            
            
            
            
            
            //CostcoLogin login = new CostcoLogin(driver);

          } catch (Exception ex) {
            ex.getStackTrace();
            
          }
    }
}


   
    






    
    
    

