package com.github;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestGithubVersion2 {
        @BeforeAll
        static void beforeAll() {
            open("https://github.com/");
        }
        @Test
    void comparePlans(){
            Configuration.browserSize = "1800x1000";
            $(byText("Pricing")).hover();
            $(".dropdown-menu a[href='/pricing#compare-features']").click();
            $$("h1.h2-mktg").shouldHave(CollectionCondition.textsInAnyOrder("Choose the plan "));
        }

}
