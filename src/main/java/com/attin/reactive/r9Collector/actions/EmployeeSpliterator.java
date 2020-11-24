package com.attin.reactive.r9Collector.actions;

import java.sql.Date;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator<Employee> {

    private Spliterator<String> wordSpliterator;
    private int id;
    private String name;
    private char gender;
    private Date dob;
    private String city;
    private String designation;
    private Date joiningDate;
    private double salary;

    public EmployeeSpliterator(Spliterator<String> wordSpliterator) {
        this.wordSpliterator = wordSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Employee> action) {
        if (wordSpliterator.tryAdvance(word -> this.id = Integer.valueOf(word))
                && wordSpliterator.tryAdvance(word -> this.name = word)
                && wordSpliterator.tryAdvance(word -> this.gender = word.charAt(0))
                && wordSpliterator.tryAdvance(word -> this.dob = Date.valueOf(word))
                && wordSpliterator.tryAdvance(word -> this.city = word)
                && wordSpliterator.tryAdvance(word -> this.designation = word)
                && wordSpliterator.tryAdvance(word -> this.joiningDate = Date.valueOf(word))
                && wordSpliterator.tryAdvance(word -> this.salary = Double.valueOf(word))) {

            action.accept(new Employee(id, name, gender, dob, city, designation, joiningDate, salary));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Employee> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return wordSpliterator.estimateSize();
    }

    @Override
    public int characteristics() {
        return wordSpliterator.characteristics();
    }
}
