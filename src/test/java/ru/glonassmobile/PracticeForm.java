package ru.glonassmobile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static ru.glonassmobile.TestData.userEmail;


public class PracticeForm extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();



    @DisplayName("Форма регистрации")
    @Test
    void checkRegisrationForm() {
        practiceFormPage.OpenPage()
        .firstNameInput("Alex")
        .typeLastName("Prooo")
         .userEmail("userEmail")
          .clickOn("chooseGender")
           .number("8965654731")
            .calendarComponent.setDate("July", "1995");
          practiceFormPage.subjectsInput("Math");


        $("#subjectsInput").setValue("Math").pressEnter();
        File someFile = new File("src/test/resources/img/1.png");
        $("#uploadPicture").uploadFile(someFile);
        $("#currentAddress").setValue("1111111111111111");
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        $("#submit").click();
        checkResult();

    }

    void checkResult() {
        $(byText("Username Last")).should(appear);
        $(byText("mail@ggoogle.con")).should(appear);
        $(".modal-content").shouldHave(text("Female"));
        $(".table-responsive").shouldHave(text("8965654731"));
        $(".table-responsive").shouldHave(text("20 July,1995"));
        $(".table-responsive").shouldHave(text("Maths"));
        $(".table-responsive").shouldHave(text("1.png"));
        $(".table-responsive").shouldHave(text("1111111111111111"));
        $(".table-responsive").shouldHave(text("NCR Noida"));


    }
}
