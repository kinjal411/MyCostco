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
public class CostcoLogOut {
    
    WebDriver driver;

    public CostcoLogOut(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(xpath = "//*[@id=\"myaccount-react-d\"]")
    private WebElement account;

    @FindBy(xpath = "//*[@id=\"mi_signout\"]/a/span")
    private WebElement logout;
    

    public void CostcoLogOut() throws Exception {
        try {
            
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myaccount-react-d\"]")));
            
            account.click();
            logout.click();
           
           //CostcoLogOut logout = new CostcoLogOut(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
    

