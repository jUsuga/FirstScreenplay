package com.demoqa.automation.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsDemoqaPage {
    public  static  String URL ="https://demoqa.com";

    public static final Target FORMS = Target.the("").locatedBy("//h5[contains(text(),'Forms')]");
    public static final Target PRACTICE_FORMS = Target.the("").locatedBy("//*/span[text()='Practice Form']");
    public static final Target FIRST_NAME = Target.the("").located(By.id("firstName"));
    public static final Target LEST_NAME = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER = Target.the("").located(By.id("gender-radio-1"));
    public static final Target MOBILE = Target.the("").located(By.id("userNumber"));
    public static final Target HOBBIES = Target.the("").located(By.id("hobbies-checkbox-1"));
    public static final Target HOBBIES_1 = Target.the("").located(By.id("hobbies-checkbox-3"));
    public static final Target PINTURES = Target.the("").located(By.id("uploadPicture"));
    public static final Target ADDRESS = Target.the("").located(By.id("currentAddress"));
    public static final Target SUBMIT = Target.the("").located(By.id("submit"));
    public static final Target SAMPLEMODAL = Target.the("").located(By.id("example-modal-sizes-title-lg"));
    public static final Target STUDENTGMAIL = Target.the("").locatedBy("//*/tr/td[text()='perez.luis@gmail.com']");
    public static final Target ADDRESS_TD = Target.the("").locatedBy("//*/tr/td[text()='Calle 47c Cr #56-87']");
}
