package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    // click on registerButton from header bar
    public void clickOnRegisterButton(){
        clickOnElement(By.className("ico-register"));
    }
    //to click on log in button from header bar
    public void clickOnLoginButton(){
        clickOnElement(By.className("ico-login"));
    }
    //click on build your own computer
    public void featuredProduct(){
        clickOnElement(By.linkText("Build your own computer"));
    }
    // click on ElectronicsButton from header bar
    public void clickOnElectronics() {
        clickOnElement(By.xpath("//h2[@class='title']/a[@title=\"Show products in category Electronics\"]"));
    }

}
