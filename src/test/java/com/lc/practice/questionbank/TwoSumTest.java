package com.lc.practice.questionbank;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void findSuboptimalSolution() {
        int[] input = new int[]{1,2,3,4,5,6,7,8,9};
        int find = 5;
        assertEquals(com.lc.practice.questionbanksolutions.TwoSum.suboptimalSolution(input, find), com.lc.practice.questionbank.TwoSum.suboptimalSolution(input, find));
    }

    @Test
    void doNotFindSuboptimalSolution() {
        int[] input = new int[]{1,3,3,5,6,7,8,9};
        int find = 2;
        assertEquals(com.lc.practice.questionbanksolutions.TwoSum.suboptimalSolution(input, find), com.lc.practice.questionbank.TwoSum.suboptimalSolution(input, find));
    }

    @Test
    void findOptimalSolution() {
        int[] input = new int[1000000];
        int find = 1500000;
        for (int i = 0; i < 1000000; i++) {
            input[i] = i;
        }
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            assertEquals(com.lc.practice.questionbanksolutions.TwoSum.optimalSolution(input, find), com.lc.practice.questionbank.TwoSum.optimalSolution(input, find));
        });
    }

    @Test
    void doNotFindOptimalSolution() {
        int[] input = new int[1000000];
        int find = Integer.MAX_VALUE;
        for (int i = 0; i < 1000000; i++) {
            input[i] = i;
        }
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            assertEquals(com.lc.practice.questionbanksolutions.TwoSum.optimalSolution(input, find), com.lc.practice.questionbank.TwoSum.optimalSolution(input, find));
        });
    }
}