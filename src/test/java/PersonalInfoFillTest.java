import org.testng.annotations.*;
import utils.BaseHooks;


public class PersonalInfoFillTest extends BaseHooks {


    @Test
    public void checkFillOfPersonalData() {
        String userEmail = "ollynnommapp-6141@yopmail.com";
        String userPassword = "121232asd";
        String userPersonalName = "Shady";
        String userPersonalLastName = "Lovers";

        loginPage.userLogIn(userEmail, userPassword);
        mainPage.goToProfilePage();
        profilePage.inputUsersDataInPersonalInfo(userPersonalName, userPersonalLastName);
        profilePage.checkPresenceOfUsersData();


    }


}


