package com.lc.practice.questionbank;

import com.lc.practice.questionbanksolutions.FindInSortedArray;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindInSortedArrayTest {
    @Test
    void findSuboptimalSolution() {
        int[] input = new int[]{1,2,3,4,5,6,7,8,9};
        int find = 5;
        assertEquals(FindInSortedArray.suboptimalSolution(input, find), com.lc.practice.questionbank.FindInSortedArray.suboptimalSolution(input, find));
    }

    @Test
    void doNotFindSuboptimalSolution() {
        int[] input = new int[]{1,2,3,4,6,7,8,9};
        int find = 5;
        assertEquals(FindInSortedArray.suboptimalSolution(input, find), com.lc.practice.questionbank.FindInSortedArray.suboptimalSolution(input, find));
    }

    @Test
    void findOptimalSolution() {
        Set<Integer> set = new HashSet<>();
        int find = new Random().nextInt(100000);
        for (int i = 0; i <= 100000; i++) {
            set.add(i);
        }
        int[] input = new int[set.size()];
        for (Integer i : set) {
            input[i] = i;
        }
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            assertEquals(FindInSortedArray.optimalSolution(input, find), com.lc.practice.questionbank.FindInSortedArray.optimalSolution(input, find));
        });
    }

    @Test
    void doNotFindOptimalSolution() {
        Set<Integer> set = new HashSet<>();
        int find = new Random().nextInt(100000);
        for (int i = 0; i <= 100000; i++) {
            if (i == find) continue;
            set.add(i);
        }
        int[] input = new int[set.size() + 1];
        for (Integer i : set) {
            if (i - 1 == find) input[i - 1] = Integer.MAX_VALUE;
            input[i] = i;
        }
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            assertEquals(FindInSortedArray.optimalSolution(input, find), com.lc.practice.questionbank.FindInSortedArray.optimalSolution(input, find));
        });
    }
}