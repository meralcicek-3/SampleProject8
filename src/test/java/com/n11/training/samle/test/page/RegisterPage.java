package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectionKey;


public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage register(String name, String lastname, String email, String password, String passwordAgain, String cinsiyet,
                                 String day, String month, String year, String captcha){


        try {
            clickBy(By.linkText("Tamam"));
        }
        catch (Exception e){

        }


        setById("firstName" , name);
        setById("lastName" , lastname);
        setById("registrationEmail",email);
        setById("registrationPassword",password);
        setById("passwordAgain",password);
        clickBy(By.xpath("//*[contains(text(), '"+cinsiyet+"')]"));


        /*
        Select sel= new Select((driver.findElement(By.xpath("//*[@id=\"birthDay\"]"))));
        sel.selectByValue("12");
        Select sel2= new Select((driver.findElement(By.xpath("//*[@id=\"birthMonth\"]"))));
        sel2.selectByValue("11");
        Select sel3= new Select((driver.findElement(By.xpath("//*[@id=\"birthYear\"]"))));
        sel3.selectByValue("1999");
        */
        selectByXpath("//*[@id=\"birthDay\"]", "12");
        selectByXpath("//*[@id=\"birthMonth\"]", "11");
        selectByXpath("//*[@id=\"birthYear\"]", "1999");

        //clickBy(By.id("acceptContract" ));
        driver.findElement(By.id("acceptContract")).click();
        //driver.findElement(By.id("sendPromotionalMailAndSms")).click();

        //clickBy(By.id("sendPromotionalMailAndSms")); ////*[@id="sendPromotionalMailAndSms"]
        setById("captcha" , captcha);

        return this;
    }

}
