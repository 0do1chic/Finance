package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class AddPage extends BasePage{
    @FindBy(css = ".button.button--size-sm.button--is-centered.button--state-filled>.button__content>.button__content")
    private WebElement createButton;
    @FindBy(css = ".button.button--size-sm.button--is-centered.button--state-danger>.button__content")
    private WebElement deleteButton;
    @FindBy(css = ".swal2-confirm.swal2-styled")
    private WebElement acceptButton;
    @FindBy(xpath = "//input[@type = 'email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@type = 'password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div")
    private WebElement goodPopup;
    public AddPage() {
        driver.get(config.baseUrl() + "/edit");
        PageFactory.initElements(driver, this);
    }
    public AddPage clickCreateButton() {
        createButton.click();
        return this;
    }
    public AddPage clickDeleteButton() {
        deleteButton.click();
        return this;
    }
    public AddPage testDelete(){
        try {
            sleep(1000);
            assertTrue(acceptButton.isDisplayed());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }return this;
    }
    public AddPage testCreate(){
        try {
            sleep(1000);
            assertTrue(goodPopup.isDisplayed());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }return this;
    }
    public void register(){

    }



}
