package com.agoda.Pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class HomePage extends PageObjects{


    public static Properties prop;

    public void launchapp() throws Exception
    {

        if(prop.getProperty("browser").equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }
        else  if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else  if(prop.getProperty("browser").equalsIgnoreCase("headless"))
        {
            ChromeOptions option = new ChromeOptions();

            driver = new ChromeDriver(option);
        }
        else
        {
            driver = new ChromeDriver();
        }

        driver.get(prop.getProperty("appUrl"));

    }

}
