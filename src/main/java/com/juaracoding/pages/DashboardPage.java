package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    @FindBy(xpath = "//img[@alt='Logo Hadir']")
    private WebElement hadirLogo;

    public String getTxtLogo(){
        return hadirLogo.getText();
    }


}
