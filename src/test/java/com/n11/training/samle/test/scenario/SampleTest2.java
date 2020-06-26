package com.n11.training.samle.test.scenario;


import com.n11.training.samle.test.base.BaseTest;
import com.n11.training.samle.test.page.HomePage;
import org.junit.Test;

public class SampleTest2 extends BaseTest{


    @Test
    public void registerTest(){
        new HomePage(driver)
                .callRegisterPage()
                .register("Ali", "Veli", "sghfrtgrt@pismail.com","123qwe", "123qwe", "Erkek",
                        "12","11", "1999", "N11");

    }

}
