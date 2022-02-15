package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate (String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $("[aria-label$='"+ month +" 20th, "+ year +"']").click();



    }
}
