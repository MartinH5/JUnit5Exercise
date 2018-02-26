package impl;

import first_semester_eksamen.Handler;
import first_semester_eksamen.TimeFormatException;
import java.io.IOException;
import java.util.ArrayList;
import first_semester_eksamen.Person;

public class HandlerImpl implements Handler {
    public static final String FILENAME = "Samples.csv";

    @Override
    public String readFile(String filename) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Person> getSamples(String data) throws TimeFormatException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Person getHighestAmplitude(ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Person getBiggestRise(ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isTooLoud(int limit, ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sortByTime(ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sortByAmplitude(ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Person> getLoudSamples(int limit, ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Person> getSamplesBefore(Time limit, ArrayList<Person> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
