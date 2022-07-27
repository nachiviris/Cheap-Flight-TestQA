/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
/**
 *
 * @author nacho
 */
public class TestCheapFlight {
    
    private WebDriver driver;
    
   //Localizadores de Home
    By cfHomeLocator = By.linkText("Hello travelers");
    By cfHomeLinkLocator = By.xpath("//div[@class='yZLG-plane']");
    
   //Localizadores de Ofertas   
    By cfOfferLocator = By.xpath("//a[@href='/handpicked-deals/']");       
    By cfOfferMapLocator = By.id("xKRA-overlay");
    
   //Localizadores de Noticias
    By cfNewsLinkLocator = By.xpath("//a[@href='https://www.cheapflights.com/news/']");
    By cfNewsLocator = By.xpath("//div[@class='slide__body']");
    
   //Localizador de Envio de ofertas 

    By cfDealInputLocation = By.xpath("//input[@id='bcql-input']");
    By cfDealSendLocation = By.linkText("send me deals");
    
   //Localizador de vuelos populares
    
    By cfPopularList1Location = By.xpath("//ul[@class='col col-1-2-s']");
    By cfPopularList2Location = By.xpath("//ul[@class='col col-1-2-s divided']");
    
    
    
    
    //Before
public void setUp() throws Exception{
    
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.cheapflights.com/");
    
}

//After

public void tearDown() throws Exception{
    driver.quit();
}
    
//Test Case 5,  TC ID 5 
//Ofertas especiales
public void CheapFlightOffers() throws InterruptedException{
    driver.findElement(cfHomeLinkLocator).click();
    Thread.sleep(10000);
   if(driver.findElement(cfHomeLocator).isDisplayed()){
       driver.findElement(cfOfferLocator).click();
       Thread.sleep(10000);
       if(driver.findElement(cfOfferMapLocator).isDisplayed()){
             System.out.print("Prueba con exito, ofertas mostradas");
       }
       else{
           System.out.print("Prueba Fallo, ofertas no mostradas");
       }
   }
   else{
       System.out.print("Home page not found");
   }
}

//Test Case 6, TC ID 6
//Noticias

public void CheapFlightNews() throws InterruptedException{
    driver.findElement(cfHomeLinkLocator).click();
    Thread.sleep(3000);
    if(driver.findElement(cfHomeLocator).isDisplayed()){
        driver.findElement(cfNewsLinkLocator).click();
        Thread.sleep(3000);
        if(driver.findElement(cfNewsLocator).isDisplayed()){
             System.out.print("Prueba con exito, Noticias Mostradas");
       }
       else{
           System.out.print("Prueba Fallo, noticias no mostradas");
       }
   }
   else{
       System.out.print("Home page not found");
   }
    }

//Test Case 7, TC ID 7
//Envio de Ofertas

public void CheapFlightDeals() throws InterruptedException{
    
    driver.findElement(cfHomeLinkLocator).click();
    Thread.sleep(3000);
    if(driver.findElement(cfHomeLocator).isDisplayed()){
        Thread.sleep(3000);
        if(driver.findElement(cfDealInputLocation).isDisplayed()){
            driver.findElement(cfDealInputLocation).sendKeys("emailprueba@prueba.com");
            driver.findElement(cfDealSendLocation).click();
            Thread.sleep(1000);
             System.out.print("Prueba con exito, email enviado");
       }
       else{
           System.out.print("Prueba Fallo, envio de ofertas no mostradas");
       }
   }
   else{
       System.out.print("Home page not found");
   }
}

public void CheapFlightPopular() throws InterruptedException{
    driver.findElement(cfHomeLinkLocator).click();
    Thread.sleep(3000);
    if(driver.findElement(cfHomeLocator).isDisplayed()){
        Thread.sleep(3000);
        if(driver.findElement(cfPopularList1Location).isDisplayed() && driver.findElement(cfPopularList2Location).isDisplayed()){
            
             System.out.print("Prueba con exito, vuelos populares mostrados");
       }
       else{
           System.out.print("Prueba Fallo, vuelos populares no mostradas");
       }
   }
   else{
       System.out.print("Home page not found");
   }
    
}



}


