/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package test.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 *
 * @author nacho
 */
public class Test {

   
    public static void main(String args[]) {
       
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shirley Fuentes\\Documents\\GitHub\\Cheap-Flight-TestQA\\TestSelenium\\src\\main\\java\\Driver\\chromedriver.exe");
        
        
        /// Inicializacion del Browser
        
        WebDriver driver= new ChromeDriver();
        
        
        
        /// Abrir CheapFlight 
        
        driver.get("https://computer-database.gatling.io/computers?f=as");
        
        //// Maximizar Ventana
        
        driver.manage().window().maximize();
        
        
        
     
    }
    public class TestCaseComputer {
    
   private WebDriver driver;
    By computerLinkLocator = By.linkText("Computer database");
    By computerLinkLoc = By.linkText("computers found");
    
    By filterTextLocator = By.id("searchbox");
    By filterBtnLocator = By.id("searchsubmit");
    
    By computerAddLinkLocator = By.id("add");
    By computerAddLinkLoc = By.linkText("Add a computer");
    By computerAddName = By.id("name");
    By computerAddIntroduced = By.id("introduced");
    By computerAddDiscontinued = By.id("discontinued");
    By computerAddBtn = By.cssSelector("input[value='Create this computer']");
    
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
   public void ComputerAdd() throws InterruptedException{
       driver.findElement(computerAddLinkLocator).click();
       Thread.sleep(2000);
       if(driver.findElement(computerAddLinkLoc).isDisplayed()){
       driver.findElement(computerAddName).sendKeys("HP 3500");
       driver.findElement(computerAddIntroduced).sendKeys("2004-05-20");
       driver.findElement(computerAddDiscontinued).sendKeys("2008-08-27");
       driver.findElement(computerAddBtn).click();      
       
   }
   else{
       System.out.print("Add page was not found");
   }
    
} 
  
    }
    
public class TestCaseDemoBlaze{
    
     private WebDriver driver;
     
     By cartLinkLocator = By.id("itemc");
     By DemoBlazeLinkLocator = By.id("nava");
     
     By contactLinkLocator = By.linkText("Contact");
     By contactEmail = By.id("recipient-email");
     By contactName = By.id("recipient-name");
     By contactMessage = By.id("message-text");
     By contactLinkLoc = By.id("exampleModalLabel");
     By contactSendMessage = By.linkText("Send message");
    
    
    //Before
public void setUp() throws Exception{
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shirley Fuentes\\Documents\\GitHub\\Cheap-Flight-TestQA\\TestSelenium\\src\\main\\java\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.demoblaze.com/");
    
}

//After

public void tearDown() throws Exception{
    driver.quit();
}
    
//Test

public void CartCategories() throws InterruptedException{
     driver.findElement(DemoBlazeLinkLocator).click();
    Thread.sleep(2000);
   if(driver.findElement(cartLinkLocator).isDisplayed()){
     System.out.print("Categorias encontradas");
   }
   else{
       System.out.print("Categories was not found");
   }

}

public void Contact() throws InterruptedException{
    driver.findElement(contactLinkLocator).click();
    Thread.sleep(2000);
   if(driver.findElement(contactLinkLoc).isDisplayed()){
     driver.findElement(contactEmail).sendKeys("joseperez@gmail.com");
       driver.findElement(contactName).sendKeys("Jose Perez");
       driver.findElement(contactMessage).sendKeys("Hola me llamo Jose Perez");
       driver.findElement(contactSendMessage).click();
   }
   else{
       System.out.print("Contact page was not found");
   }
    
}
    
}
    
}
    
    

