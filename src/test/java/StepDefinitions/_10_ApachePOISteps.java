package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_ApachePOISteps {
    DialogContent dialogContent=new DialogContent();
    @When("^User Create  Citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {
        List<List<String>> liste =ExcelUtility.getListData("src/main/resources/ApacheExcel2.xlsx","testCitizen",2);
        for (int i = 0; i <liste.size() ; i++)
        {
            dialogContent.findElementAndClickFunction("addButton");
            dialogContent.findElementAndSendKeysFunction("nameInput", liste.get(i).get(0));
            dialogContent.findElementAndSendKeysFunction("shortName",liste.get(i).get(1) );
            dialogContent.findElementAndClickFunction("saveButton"); dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        }
    }

    @Then("^User delete  Citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {
        ExcelUtility.getListData("src/main/resources/ApacheExcel2.xlsx","testCitizen",1);
    }
}
