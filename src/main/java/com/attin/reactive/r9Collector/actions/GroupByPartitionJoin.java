package com.attin.reactive.r9Collector.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class GroupByPartitionJoin {

    public static void main(String[] args) {

        Path path = Paths.get("D:/dev/Git-Repo/reactive-programming/src/main/java/com/attin/reactive/r9Collector/EmployeeData.txt");

        try (Stream<String> lines = Files.lines(path)) {

            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));

            Spliterator<String> wordSpliterator = words.spliterator();

            //create a spliterator of the  object
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            //Creates a new sequential or parallel {@code Stream} from a {@code Spliterator}.
            Stream<Employee> stream = StreamSupport.stream(employeeSpliterator, false);

            List<Employee> employeeList = stream.collect(Collectors.toList());

            System.out.println("\n------X----------COLLECTION (partitioningby)--------X-----------");
            Map<Boolean, List<Employee>> partitionData = employeeList.stream()
                    .collect(
                            Collectors.partitioningBy(e -> e.getGender() == 'M')
                    );
            System.out.println(partitionData);

            List<Employee> malesEmployees = partitionData.get(true);
            List<Employee> femaleEmployees = partitionData.get(false);

            System.out.println("\n------X----------COLLECTION (joining)--------X-----------");
            String joining = employeeList.stream().map(e -> e.getName())
                    .collect(
                            Collectors.joining(", ")
                    );

            System.out.println(joining);

            System.out.println("\n------X----------COLLECTION (groupBy)--------X-----------");
            Map<String, List<Employee>> groupBy = employeeList.stream()
                    .collect(
                            Collectors.groupingBy(e -> e.getDesignation())
                    );

            System.out.println(groupBy);

            System.out.println("\n------X----------COLLECTION (groupBy -> summingDouble )--------X-----------");
            Map<String, Double> fundDistribution = employeeList.stream()
                    .collect(Collectors.groupingBy(
                            e -> e.getDesignation(),
                            Collectors.summingDouble(e -> e.getSalary())
                            )
                    );
            System.out.println(fundDistribution);


            System.out.println("\n------X----------COLLECTION (groupBy -> counting )--------X-----------");
            Map<String, Long> countByDesignation = employeeList.stream()
                    .collect(Collectors.groupingBy(
                            e -> e.getDesignation(),
                            Collectors.counting()
                            )
                    );
            System.out.println(countByDesignation);

            System.out.println("\n------X----------COLLECTION (groupBy -> comparing )--------X-----------\n");
            Map<String, Optional<Employee>> maxSalaryEmployees = employeeList.stream()
                    .collect(Collectors.groupingBy(
                            e -> e.getDesignation(),
                            Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))
                            )
                    );
            System.out.println(maxSalaryEmployees);


           /* System.out.println("\n------X----------COLLECTION (groupBy -> comparing )--------X-----------\n");
            Map<String, Optional<Double>> maxSalaries =
                    employeeList.stream()
                            .collect(
                                    Collectors.groupingBy(
                                            e -> e.getDesignation(),
                                            Collectors.mapping(
                                                    e -> e.getSalary(),
                                                    Collectors.maxBy(Comparator.comparing(Function.identity()))
                                            )
                                    )
                            );
            System.out.println(maxSalaries); */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
