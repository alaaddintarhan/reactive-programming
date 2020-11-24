package com.attin.reactive.r9Collector.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownstreamCollectors {


    public static void main(String[] args) {

        Path path = Paths.get("D:/dev/Git-Repo/reactive-programming/src/main/java/com/attin/reactive/r9Collector/EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path);) {

            Stream<String> wordStream = lines.flatMap(line -> Arrays.stream(line.split(",")));
            Spliterator<String> wordSpliterator = wordStream.spliterator();

            //  An object for traversing and partitioning elements of a source : EmployeeSpliterator
            List<Employee> stream = StreamSupport
                                            .stream(new EmployeeSpliterator(wordSpliterator), false)
                                            .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
