package com.demoqa.automation.tasks;
import com.demoqa.automation.models.Data;
import com.demoqa.automation.questions.ValidationsFormsdemoqa;
import com.demoqa.automation.ui.FormsDemoqaPage;
import com.demoqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class FormesDemoqaValidationsTasks implements Task {
    Excel excel=new Excel();
    Data data = new Data();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(ValidationsFormsdemoqa.in(FormsDemoqaPage.SAMPLEMODAL),equalToIgnoringCase(excel.getCellValue(data.getFilepath(),data.getSheetNameData(),1,0))),
                seeThat(ValidationsFormsdemoqa.in(FormsDemoqaPage.STUDENTGMAIL),equalToIgnoringCase(excel.getCellValue(data.getFilepath(),data.getSheetNameData(),1,1))),
                seeThat(ValidationsFormsdemoqa.in(FormsDemoqaPage.ADDRESS_TD),equalToIgnoringCase(excel.getCellValue(data.getFilepath(),data.getSheetNameData(),1,2)))
        );
    }
    public static FormesDemoqaValidationsTasks validations (){
        return instrumented(FormesDemoqaValidationsTasks.class);
    }
}
