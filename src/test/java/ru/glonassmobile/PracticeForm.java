package ru.glonassmobile;

import com.github.javafaker.Faker;
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
    public File someFile = new File("src/test/resources/img/1.png");

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String userEmail = faker.internet().emailAddress();


    @DisplayName("Форма регистрации")
    @Test
    void checkRegisrationForm() {
        practiceFormPage
                .OpenPage()
                .firstNameInput(firstName)
                .typeLastName("Prooo")
                .userEmail(userEmail)
                .clickOn("chooseGender")
                .number("8965654731")
            .calendarComponent.
                setDate("July", "1995");
          practiceFormPage
                  .subjectsInput("Math")
                  .downloadFile(someFile)
                  .currentAddress("1111111111111111")
                  .stateAndCity()
                  .submit();

          
        checkResult();

    }

    void checkResult() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name"))
                .parent().shouldHave(text(firstName +" Prooo"));
        $(".table-responsive")//.$(byText("Email"))
                .parent().shouldHave(text(userEmail));


    }
}
