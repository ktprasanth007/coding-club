package main.java.org.lld.Step_32_All_Creational_Patterns.Builder_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Micro Economics");
        subs.add("Business Studies");
        subs.add("Operations Management");
        this.subjects = subs;
        return this;
    }
}
