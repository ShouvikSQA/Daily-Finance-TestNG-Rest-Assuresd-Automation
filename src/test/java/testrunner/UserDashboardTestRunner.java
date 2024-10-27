package testrunner;

//import config.AddCostDataSet;
import config.AddCostDataSet;
import config.Setup;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserAddCostPage;
import pages.UserDashboardPage;
import utils.Utils;

import java.io.FileReader;
import java.io.IOException;

public class UserDashboardTestRunner extends Setup {
    LoginPage loginPage;



    @BeforeTest(description = "User Logged In successfully after reset password")
    public void UserLogin() throws ParseException, IOException, InterruptedException {
        loginPage = new LoginPage(driver);

        String email= Utils.getLatestUserProperty("email");
        String password= Utils.getLatestUserProperty("password");


        loginPage.doLogin(email,password);
        String expectedMsg = "User Daily Costs";
        String actualMsg = loginPage.dashboardMsg.getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));

    }

    @Test( priority = 1, dataProvider = "AddCostData", dataProviderClass = AddCostDataSet.class, description = "Adding Data From CSV File to User" )
    public void addCost(String name,String amount,int quantity,String date,String month,String remark) throws InterruptedException {

        UserAddCostPage addCostPage=new UserAddCostPage(driver);
        addCostPage.btnAddCost.click();

        addCostPage.addCost(name,amount,quantity,date, month ,remark);


    }





    @Test(priority = 2, description = "Assert The newly Added Products")
    public  void productAssertion( ) throws InterruptedException {


        UserDashboardPage dashboardPage = new UserDashboardPage(driver);
        dashboardPage.itemAssertion();


    }





}
