package com.demoqa.automation.tasks;

import com.demoqa.automation.models.Data;
import com.demoqa.automation.ui.FormsDemoqaPage;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormsDemoqaTasks  implements Task {
    Excel excel = new Excel();
    Data data = new Data();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(FormsDemoqaPage.FORMS),
                JavaScriptClick.on(FormsDemoqaPage.PRACTICE_FORMS),
                Enter.theValue(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,0)).into(FormsDemoqaPage.FIRST_NAME),
                Enter.theValue(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,1)).into(FormsDemoqaPage.LEST_NAME)
        );
        SpecialMethods.waitFor(1);
        actor.attemptsTo(
                Enter.theValue(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,2)).into(FormsDemoqaPage.EMAIL),
                JavaScriptClick.on(FormsDemoqaPage.GENDER),
                Enter.theValue(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,3)).into(FormsDemoqaPage.MOBILE),
                JavaScriptClick.on(FormsDemoqaPage.HOBBIES),
                JavaScriptClick.on(FormsDemoqaPage.HOBBIES_1)
        );
        SpecialMethods.waitFor(2);
        actor.attemptsTo(
                Enter.theValue(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,4)).into(FormsDemoqaPage.ADDRESS),
                JavaScriptClick.on(FormsDemoqaPage.SUBMIT)
        );
    }

    public static FormsDemoqaTasks data (){
        return instrumented(FormsDemoqaTasks.class);
    }
}
