import org.testng.annotations.*;
import utils.BaseHooks;


public class PersonalInfoFillTest extends BaseHooks {

    @Test
    public void checkFillOfPersonalData() {
        loginPage.inputData("ollynnommapp-6141@yopmail.com", "121232asd");
        mainPage.goToProfilePage();
        profilePage.inputUsersDataInPersonalInfo("Shady", "Lovers");
        profilePage.checkPresenceOfUsersData();
    }


}


