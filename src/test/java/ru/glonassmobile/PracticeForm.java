package ru.glonassmobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {
    @Test
    void regisrationform () {
        open("https://demoqa.com/automation-practice-form");
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










    }
}
