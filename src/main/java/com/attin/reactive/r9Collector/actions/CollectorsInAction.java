package com.attin.reactive.r9Collector.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {

    public static void main(String[] args) {
        Path path = Paths.get("D:/dev/Git-Repo/reactive-programming/src/main/java/com/attin/reactive/r9Collector/EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path)) {
            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));

            Spliterator<String> wordSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            Stream<Employee> stream = StreamSupport.stream(employeeSpliterator, false);

            List<Employee> employeeList = stream.collect(Collectors.toList());

            System.out.println("------X----------LIST--------X-----------");
            //toList
            List<String> employeeNames = employeeList.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.toList());
            //toUnmodifiableList
            List<String> unmodifiedEmployeeNames = employeeList.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.toUnmodifiableList());

            employeeNames.forEach(System.out::println);

            System.out.println("------X----------SET--------X-----------");
            //toSet or toUnmodifiableSet()
            Set<String> designationSet = employeeList.stream()
                    .map(employee -> employee.getDesignation())
                    .collect(Collectors.toSet());

            designationSet.forEach(System.out::println);

            System.out.println("------X----------COLLECTION(TreeSet)--------X-----------");
            TreeSet<Employee> employeesSorted = employeeList.stream()
                    .collect(Collectors.toCollection(TreeSet::new));

            employeesSorted.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
