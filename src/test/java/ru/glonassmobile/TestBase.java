package ru.glonassmobile;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class TestBase {
    @BeforeEach
    void openform () {
        clearBrowserCookies();

    }
}
