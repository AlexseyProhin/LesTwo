package ru.glonassmobile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {

    @BeforeEach
    void openform () {
        clearBrowserCookies();
        open("https://demoqa.com/automation-practice-form");

    }

    @DisplayName("Форма регистрации")
    @Test
    void checkRegisrationForm() {

        $("#firstName").setValue("Username");
        $("#lastName").setValue("Last");
        $("#userEmail").setValue("mail@ggoogle.con");
        $("[for='gender-radio-2']").click(); // radio button
        $("#userNumber").setValue("8965654731");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__year-select").selectOption("1995");
        $("[aria-label$='July 20th, 1995']").click(); // $ dollar =
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
        //$(".modal-body").shouldHave(text("Frmale"));

    }
}
