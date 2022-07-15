/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.testselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
/**
 *
 
 */
public class TestCaseComputer {
    
   private WebDriver driver;
    By computerLinkLocator = By.linkText("Computer database");
    By computerLinkLoc = By.linkText("computers found");
    
    By filterTextLocator = By.id("searchbox");
    By filterBtnLocator = By.id("searchsubmit");
        
    
//Before
public void setUp() throws Exception{
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shirley Fuentes\\Documents\\GitHub\\Cheap-Flight-TestQA\\TestSelenium\\src\\main\\java\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://computer-database.gatling.io/computers?f=as");
    
}

//After

public void tearDown() throws Exception{
    driver.quit();
}
    
//Test
public void ComputerFilter() throws InterruptedException{
    driver.findElement(computerLinkLocator).click();
    Thread.sleep(2000);
   if(driver.findElement(computerLinkLoc).isDisplayed()){
       driver.findElement(filterTextLocator).sendKeys("HP");
       driver.findElement(filterBtnLocator).click();
   }
   else{
       System.out.print("Filter page was not found");
   }
       
}
    
}
