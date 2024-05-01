package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{//extends class to call method open and close browser

    //create obj to call Homepage method
    HomePage homePage = new HomePage();

    //create obj to call RegisterPage method
    RegisterPage registerPage = new RegisterPage();

    //create obj to call RegisterResultPage method
    RegisterResultPage registerResultPage = new RegisterResultPage();

    //create obj for to call LoginPage
    LoginPage loginPage = new LoginPage();

    //create obj to call ElectronicsPage
    Electronics electronics= new Electronics();

    //create obj to call CameraAndPhoto
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();

    //create obj to call LeicaT_MirrorlessDigital_CameraPage
  LeicaT_MirrorlessDigital_CameraPage leicaT_mirrorlessDigital_cameraPage = new LeicaT_MirrorlessDigital_CameraPage();

    //create obj to call ProductEmailAFriendPage
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();

    //create obj for call buildYourOwnComputer
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();

    //create obj for call checkShoppingCart
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();



    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully(){

        //to click on register button from header bar
        homePage.clickOnRegisterButton();
        //to enter registration details
        registerPage.enterRegistrationDetails();
        //to verify user registered Successfully
        registerResultPage.userShouldBeAbleToGetRegistrationMsg();

    }

    @Test
    public void verifyRegisteredUserShouldBeAbleToLogIn(){

        //to click on register button
        // homePage.clickOnRegisterButton();
        //to enter registration details
        //registerPage.enterRegistrationDetails();
        //to verify user registered Successfully
        // registerResultPage.userShouldBeAbleTOGetRegisterMsg();
        //to click on login from header bar
        homePage.clickOnLoginButton();
        //to enter login detail and submit Login button
        loginPage.loginDetails();

    }

    @Test
    public void verifyRegisteredUserShouldBeAbleReferAProductToFriendByEmail(){

//        //click on register button
//        homePage.clickOnRegisterButton();
//        //enter registration details
//        registerPage.enterRegistrationDetails();
//        //verify user registered Successfully
//        registerResultPage.userShouldBeAbleTOGetRegisterMsg();
//        //click on login from header bar
//        homePage.clickOnLoginButton();
//        //enter login detail and submit Login button
        // loginPage.loginDetails();
        //click on electronics button
        homePage.clickOnElectronics();
        //click on Camera & photo
        electronics.clickOnCameraAndPhoto();
        //click on Leica T Mirrorless Digital Camera
        cameraAndPhoto.clickOnLeicaTMirrorLessDigitalCamera();
        //to click on Email a friend
       leicaT_mirrorlessDigital_cameraPage.referAFriend();
       //to refer a product to friend
        productEmailAFriend.enterFriendDetails();


    }

    @Test

    public void userShouldBeAbleToConformCorrectProductAddedInACart(){

        //homePage.clickOnLoginButton();
        //Enter login Details
        // loginPage.loginDetails();
        //Select a FeatureProduct
        homePage.featuredProduct();
        //build your own computer
        buildYourOwnComputer.selectYourProductOpp();
        //verify correct product added
        shoppingCartPage.conformAddedProduct();
    }
}





