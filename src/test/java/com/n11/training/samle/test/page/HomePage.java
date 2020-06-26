package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        //clickBy(By.className("closeBtn"));
    }

    /*
    public HomePage search(String keyword){
        setById("searchData",keyword);
        clickBy(By.className("searchBtn"));

        //selectByIdText("gender", "M");
        //selectByNameValue("gender", "M");

        return this;
    }
*/


    public com.n11.training.samle.test.page.RegisterPage callRegisterPage(){
        //clickBy(By.className("btnSignUp"));
        driver.findElement(By.className("btnSignUp")).click();
        return new com.n11.training.samle.test.page.RegisterPage(driver);
    }
}
