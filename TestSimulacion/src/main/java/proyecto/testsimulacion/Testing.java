/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.testsimulacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Shirley Fuentes
 */
public class Testing {
    
    private WebDriver driver;
    
    //Localizadores Prueba 1
    By homeLocator = By.xpath("//img[@src='https://www.mwtestconsultancy.co.uk/img/rbp-logo.png']");
    
    //Localizadores Prueba 2
    
    By contactName = By.id("name");
    By contactEmail = By.id("email");
    By contactPhone = By.id("phone");
    By contactSubject = By.id("subject");
    By contactDescription = By.id("description");
    By contactSubmitButton = By.id("submitContact");
    By contactSend = By.partialLinkText("Thanks for getting in touch");
    
    //Localizadores Prueba 3
    
    
    By roomImage = By.xpath("//img[@src='https://www.mwtestconsultancy.co.uk/img/testim/room2.jpg']");
    
    
    
    //Localizadores Prueba 4
    
    By bookingName = By.xpath("//input[@name='firstname']");
    By bookingLast = By.xpath("//input[@name='lastname']");
    By bookingEmail = By.xpath("//input[@name='email']");
    By bookingPhone = By.xpath("//input[@name='phone']");
    By bookingButton = By.linkText("Book");
    By bookingSubmit = By.partialLinkText("Booking Successful!");
    
    
    
    
    public void setUp() throws Exception{
    
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationintesting.online/#/");
    
}

//After

public void tearDown() throws Exception{
    driver.quit();
}

//Test

public void Prueba1()throws InterruptedException {
    
   if(driver.findElement(homeLocator).isDisplayed()){
       
       driver.getTitle();
      System.out.print("Prueba con exito");
       }
       else{
           System.out.print("Prueba Fallo");
       }
   
    
}

public void Prueba2()throws InterruptedException {
    
   if(driver.findElement(homeLocator).isDisplayed()){
       driver.findElement(contactName).sendKeys("Jose");
       driver.findElement(contactEmail).sendKeys("email@prueba.com");
       driver.findElement(contactPhone).sendKeys("8888-8888");
       driver.findElement(contactSubject).sendKeys("Prueba");
       driver.findElement(contactDescription).sendKeys("Prueba");
       driver.findElement(contactSubmitButton).click();
       Thread.sleep(2000);
       if(driver.findElement(contactSend).isDisplayed()){
           System.out.print("Prueba con exito");
       }
       
       else{
           System.out.print("Prueba fallo no se envio el formulario");
       }
      
       }
       else{
           System.out.print("Pagina principal no carga");
       }
   
    
}

public void Prueba3()throws InterruptedException {
    
   if(driver.findElement(roomImage).isDisplayed()){
       
       driver.getTitle();
      System.out.print("Prueba con exito");
       }
       else{
           System.out.print("Prueba Fallo");
       }
   
    
}


public void Prueba4()throws InterruptedException {
    
if(driver.findElement(homeLocator).isDisplayed()){
       driver.findElement(bookingName).sendKeys("Jose");
       driver.findElement(bookingLast).sendKeys("Bernal");
       driver.findElement(bookingEmail).sendKeys("prueba@prueba.com");
       driver.findElement(bookingPhone).sendKeys("888888888888");
       driver.findElement(bookingButton).click();
       Thread.sleep(2000);
       if(driver.findElement(bookingSubmit).isDisplayed()){
           System.out.print("Prueba con exito");
       }
       
       else{
           System.out.print("Prueba fallo no se envio el formulario");
       }
      
       }
       else{
           System.out.print("Pagina principal no carga");
       }
   
    
}



    
}
