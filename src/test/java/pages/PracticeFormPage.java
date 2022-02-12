package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selenide.*;


public class PracticeFormPage {

 SelenideElement
         firstNameInput = $("#firstName"),
         lastNameInput = $("#lastName"),
         userEmail = $("#userEmail"),
         chooseGender = $("[for='gender-radio-2']"),
         userNumber = $("#userNumber"),
    subjectsInput = $("#subjectsInput");




    public CalendarComponent calendarComponent = new CalendarComponent();
    public PracticeFormPage OpenPage() {
        open("https://demoqa.com/automation-practice-form");

        return this;
    }
    public PracticeFormPage firstNameInput(String value) {

        firstNameInput.setValue(value);

        return this;
    }

   public PracticeFormPage typeLastName(String value) {

        lastNameInput.setValue(value);

        return this;
   }
   public  PracticeFormPage userEmail(String value) {
        userEmail.setValue(value);
       return this;
   }


    public PracticeFormPage clickOn(String value) {
        chooseGender.click();
        return this;
    }

    public PracticeFormPage number(String value) {
        userNumber.setValue(value);
        return this;
    }

    public PracticeFormPage subjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }
}
