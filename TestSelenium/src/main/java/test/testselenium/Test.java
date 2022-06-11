/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package test.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author nacho
 */
public class Test {

   
    public static void main(String args[]) {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
        
        
        /// Inicializacion del Browser
        
        WebDriver driver= new ChromeDriver();
        
        
        
        /// Abrir CheapFlight 
        
        driver.get("https://www.cheapflights.com/");
        
        //// Maximizar Ventana
        
        driver.manage().window().maximize();
        
    }
}
