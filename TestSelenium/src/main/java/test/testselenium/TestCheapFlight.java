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
    By cfHomeLocator = By.xpath("//h2[@class='pageTitle valueProp flightsValueProp packagesValueProp hotelsValueProp carsValueProp']");
    By cfHomeLinkLocator = By.xpath("//div[@class='yZLG-plane']");
    
   //Localizadores de Ofertas   
    By cfOfferLocator = By.xpath("//a[@href='/handpicked-deals/']");       
    By cfOfferMapLocator = By.xpath("//a[@class='_FW _h-2 _iae _ieV _h-Y _h-Z _iam']");
    
   //Localizadores de Newsletter
    By cfNewsLinkLocator = By.xpath("//a[@href='/profile/notifications']");
    By cfNewsButtonEmail = By.xpath("//div[@class='Iqt3-button-content']");
    By cfNewsInputEmail = By.xpath("//input[@class='common-authentication-react-AuthenticationDialogInput email-input unified-login inspectletIgnore']");
    By cfCheckBoxEmail = By.xpath("//input[@id='email-me']");
    
    By cfEmailTextSend = By.xpath("//*[text()='Check your inbox']");
 
    
    
   //Localizador de Envio de ofertas 

    By cfDealInputLocation = By.xpath("//input[@class='Common-Widgets-Text-TextInput size-m inspectletIgnore']");
    By cfDealSendLocation = By.xpath("//button[@class='Common-Widgets-Button-ButtonDeprecated Common-Widgets-Button-Button ui-button size-m col newsletter-button']");
    
   //Localizador de vuelos populares
    
    By cfPopularList1Location = By.xpath("//ul[@class='col col-1-2-s']");
    By cfPopularList2Location = By.xpath("//ul[@class='col col-1-2-s divided']");
    
   //Localizador de Vacation packages
    
    By cfVacationToLocation = By.xpath("//*[text()='To?']");
    By cfVacationToInputLocation = By.xpath("//input[@placeholder='To?']");
    By cfVacationTrip = By.xpath("//*[text()='One-way']");
    By cfVacationDateButton = By.xpath("//div[@class='cQtq-input cQtq-mod-responsive']");
    By cfVacationTypeButton = By.xpath("//div[@class='PLU8']");
    By cfVacationDateInput = By.xpath("//div[@aria-label='September 21, 2022']");
    By cfVacationTypeInput = By.xpath("//label[@data-text='First']");
    By cfVacationFind = By.xpath("//div[@class='Iqt3-button-content']");
    By cfVacationCompare = By.xpath("//div[@class='zTyr-cmp2-container-content']");
    By cfVacationBackground = By.xpath("//h2[@class='pageTitle valueProp flightsValueProp packagesValueProp hotelsValueProp carsValueProp']");
    

    
    
    
    
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
    Thread.sleep(3000);
   if(driver.findElement(cfHomeLocator).isDisplayed()){
       driver.findElement(cfOfferLocator).click();
       Thread.sleep(5000);
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

//Test Case 7, TC ID 7
//Newsletter
public void CheapFlightNewsletter() throws InterruptedException {
    
    driver.findElement(cfHomeLinkLocator).click();
    Thread.sleep(3000);
    if(driver.findElement(cfHomeLocator).isDisplayed()){
        Thread.sleep(1500);
        driver.findElement(cfNewsLinkLocator).click();
        Thread.sleep(2000);
        driver.findElement(cfNewsButtonEmail).click();
        Thread.sleep(2000);
        driver.findElement(cfNewsInputEmail).sendKeys("email5prueba@prueba.com");
        driver.findElement(cfNewsButtonEmail).click();
        Thread.sleep(2000);
        driver.findElement(cfCheckBoxEmail).click();
        Thread.sleep(1000);
        driver.findElement(cfNewsButtonEmail).click();
        Thread.sleep(4000);
        if(driver.findElement(cfEmailTextSend).isDisplayed()){
            System.out.print("Se ha enviado el email para recibir NewsLetter, prueba con exito");
        }else{
            System.out.print("Prueba fallo");
        }
        
    }else{
        System.out.print("Home page not found");
    }
}





//Test Case 8, TC ID 8
//Vuelos populares

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

//Test Case 9, TC ID 9
//Lista de vuelos


public void CheapFlightVacation() throws InterruptedException{
    driver.findElement(cfHomeLinkLocator).click();
    Thread.sleep(3000);
    if(driver.findElement(cfHomeLocator).isDisplayed()){
        Thread.sleep(3000);
        driver.findElement(cfVacationToLocation).click();
        driver.findElement(cfVacationToInputLocation).sendKeys("Dublin, Ireland (DUB)");
        driver.findElement(cfVacationTrip).click();
        driver.findElement(cfVacationDateButton).click();
        driver.findElement(cfVacationDateInput).click();
        driver.findElement(cfVacationTypeButton).click();
        driver.findElement(cfVacationTypeInput).click();
        driver.findElement(cfVacationBackground).click();
        Thread.sleep(1500);
        driver.findElement(cfVacationFind).click();
        Thread.sleep(3000);
        if (driver.findElement(cfVacationCompare).isDisplayed()){
             System.out.print("Muestra la lista de paginas que venden boletos, prueba con exito");
        }
        
        else{
             System.out.print("Prueba Fallo");
        }
        
    }
    else{
          System.out.print("Home page not found");
    }
    
}





}


