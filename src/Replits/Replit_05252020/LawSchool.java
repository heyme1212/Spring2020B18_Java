package Replits.Replit_05252020;

public class LawSchool extends EducationalInstitution {

    /*
    Write a subclass LawSchool that contains:
a (default) constructor that invokes the superclass constructor with the value 3 (law school is typically a three year program).

a (overridden) method graduationRequirements that returns the string "3 years of study and passing the bar".
You MUST invoke the graduationRequirements method of the superclass in this method (to obtain the first portion of the resulting string).
     */
    public LawSchool() {

        super(3);
    }

    @Override
    public String graduationRequirements(){

        String x=super.graduationRequirements()+" and passing the bar";
        return x;
    }


}
