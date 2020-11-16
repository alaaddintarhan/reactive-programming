package com.attin.reactive.r7Stream;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.printf("\navailableProcessors : %s", Runtime.getRuntime().availableProcessors());
        System.out.printf("\nfreeMemory : %s", Runtime.getRuntime().freeMemory());
        System.out.printf("\nmaxMemory : %s", Runtime.getRuntime().maxMemory());
        System.out.printf("\ntotalMemory : %s", Runtime.getRuntime().totalMemory());
        System.out.printf("\ncommonPoll : %s", ForkJoinPool.commonPool().getPoolSize());

        System.out.printf("\n\ncommonPoll : %s", ForkJoinPool.getCommonPoolParallelism());
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "4");
        //why dont changed
        System.out.printf("\ncommonPoll : %s\n", ForkJoinPool.getCommonPoolParallelism());

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18);

        ForkJoinPool pool = new ForkJoinPool(6);
        Long count = pool.submit(() -> list.parallelStream().filter(integer -> integer > 5).count()).get();
        System.out.printf("\ncount : %s",count);

        //Computation Intensive : Number  of the threads <=  number of cores

        //IO  : db operation , file  operation , Http Call
        // Number  of the threads >  number of cores
    }
}
