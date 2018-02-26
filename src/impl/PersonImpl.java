package impl;

import first_semester_eksamen.Person;

public class PersonImpl implements Person {

    private final String name;
    private final int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
