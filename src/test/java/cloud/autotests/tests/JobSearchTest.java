package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class JobSearchTest {
    //extends TestBase {
    @Test
    @Tag("test_noveo")
    @DisplayName("Test Website НОВЕО")
    void vacancyTest() {
        step("Open https://xn--b1agwec.xn--p1ai/", () ->
                open("https://xn--b1agwec.xn--p1ai/"));

        step("Click search", () ->
                $(".js-header-search-btn .icon-svg").click());

        step("Input Тестировщик", () ->
                $("[id=search]").setValue("Тестировщик").pressEnter());

        step("Job selection", () ->
                $(".search-page__found:nth-child(2) .search-page__found-title").click());

        step("Should be Тестировщик", () ->
                $(".vacancies-details__title").shouldHave(text("Тестировщик")));
    }

    @Test
    @Tag("test_noveo")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://xn--b1agwec.xn--p1ai/'", () ->
                open("https://xn--b1agwec.xn--p1ai/"));

        step("Page title should have text 'Новео'", () -> {
            String expectedTitle = "Новео";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Tag("test_noveo")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://xn--b1agwec.xn--p1ai/'", () ->
                open("https://xn--b1agwec.xn--p1ai/"));

        step("Console logs should not contain text 'НОВЕО'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "НОВЕО";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Tag("test_noveo")
    @DisplayName("Test Website НОВЕО")
    void VKTest() {
        step("Open https://xn--b1agwec.xn--p1ai/", () ->
                open("https://xn--b1agwec.xn--p1ai/"));

        step("Click About Company", () ->
                $(".header__link").click());

        step("Should have VK", () ->
                $(".social-icons__text").shouldHave(text("Vkontakte")));
    }

    @Test
    @Tag("test_noveo")
    @DisplayName("Test Website НОВЕО")
    void TGTest() {
        step("Open https://xn--b1agwec.xn--p1ai/", () ->
                open("https://xn--b1agwec.xn--p1ai/"));

        step("Click About Company", () ->
                $(".header__link").click());

        step("Should have TG", () ->
                $(".footer__social").shouldHave(text("Telegram")));
    }
}
