package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends Utils{


    public void OpenFacebookPage() {
        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow = i1.next();


            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                //verify Url
                String actualFacebookUrl = driver.getCurrentUrl();
                Assert.assertEquals(actualFacebookUrl,loadProp.getProperty("ExpectedFacebookUrl"),"URL does not match!");
                // Accept Cookies
                clickOnElement(By.xpath("//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']"));
                //Close the Cookie
                clickOnElement(By.xpath("//div[@class='x92rtbv x10l6tqk x1tk7jg1 x1vjfegm']"));
                //Storing actualTitle
                String  actualFBPageTitle = getTextFromElement(By.xpath("//div[@class='x1e56ztr x1xmf6yo']"));
                // Verify Title
                Assert.assertEquals(actualFBPageTitle,loadProp.getProperty("ExpectedTitleName"),"Title Mis-Match");
                //Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);

    }

}
