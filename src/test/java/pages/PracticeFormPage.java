package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selenide.*;


public class PracticeFormPage {

 SelenideElement
         firstNameInput = $("#firstName"),
         lastNameInput = $("#lastName");

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



}
