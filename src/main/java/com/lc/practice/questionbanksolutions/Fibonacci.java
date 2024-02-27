package com.lc.practice.questionbanksolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Fibonacci {
    private int suboptimalSolution(int input) {
        if (input == 1) return 1;
        else if (input == 0) return 0;
        return suboptimalSolution(input - 1) + suboptimalSolution(input - 2);
    }

    private int optimalSolution(int input) {
        return optimalSolutionHelper(input, new HashMap<>());
    }

    private int optimalSolutionHelper(int input, Map<Integer, Integer> cache) {
        if (input == 1) return 1;
        else if (input == 0) return 0;
        else if (cache.containsKey(input)) return cache.get(input);
        int solution = optimalSolutionHelper(input - 1, cache) + optimalSolutionHelper(input - 2, cache);
        cache.put(input, solution);
        return solution;
    }
}
