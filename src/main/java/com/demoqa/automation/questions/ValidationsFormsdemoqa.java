package com.demoqa.automation.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationsFormsdemoqa  implements Question<String> {

    private Target target;

    public ValidationsFormsdemoqa(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    public static ValidationsFormsdemoqa in(Target target) {
        return new ValidationsFormsdemoqa(target);
    }
}
