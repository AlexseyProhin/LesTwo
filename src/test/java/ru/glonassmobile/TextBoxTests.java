package ru.glonassmobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

  //  @BeforeAll
    //static void beforeAll() {
      //  Configuration.st = true;
   // }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("FirstName");
        $("#userEmail").setValue("gavgav@yandex.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Twoadress");
        $("#submit").scrollTo().click();


        $("#output").shouldBe(visible);
        $("#name").shouldHave(text("FirstName"));
        $("#email").shouldHave(text("gavgav@yandex.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow"));
        $("#output #permanentAddress").shouldHave(text("Twoadress"));




    }
}
