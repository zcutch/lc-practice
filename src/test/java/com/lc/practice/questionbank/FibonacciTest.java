package com.lc.practice.questionbank;

import com.lc.practice.questionbanksolutions.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void suboptimalSolution() {
        assertEquals(Fibonacci.suboptimalSolution(5), com.lc.practice.questionbank.Fibonacci.optimalSolution(5));
    }

    @Test()
    void optimalSolution() {
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            assertEquals(Fibonacci.optimalSolution(1000), com.lc.practice.questionbank.Fibonacci.optimalSolution(1000));
        });
    }
}