package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages._Parent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _11_JDBCSteps {
    LeftNav leftNav=new LeftNav();

    @Then("^Send The query the database \"([^\"]*)\" and control match$")
    public void sendTheQueryTheDatabaseAndControlMatch(String query)  {

        List<List<String>> dbList= DBUtility.getListData(query);
        DialogContent dialogContent=new DialogContent();
        List<WebElement>uiList=dialogContent.waitVisibleListAllElement(dialogContent.nameList);
        for (int i = 0; i <dbList.size() ; i++) {
            System.out.println("db"+dbList.get(i).get(1)+uiList.get(i).getText());
            Assert.assertEquals(dbList.get(i).get(1),uiList.get(i).getText());
        }
    }

    @And("^Navigate to City page$")
    public void navigateToCityPage() {
        leftNav.findElementAndClickFunction("city");
    }
}
