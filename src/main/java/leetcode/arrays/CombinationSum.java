package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
* Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of
* candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of
* at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
* */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int i=0, size = candidates.length, sum=0;
        Stack<Integer> combi = new Stack<>(), indices = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        while (i < size) {
            if (sum + candidates[i]>= target) {
                if (sum + candidates[i] == target) {
                    combi.push(candidates[i]);
                    result.add(new ArrayList<>(combi));
                    combi.pop();
                }
                // indices stack and combination stack should have the same size all the time
                if (!indices.empty()){
                    sum -= combi.pop();
                    i = indices.pop();
                    while (i == size-1 && !indices.empty()) {
                        i = indices.pop();
                        sum -= combi.pop();

                    }
                }
                i++;
            } else {
                combi.push(candidates[i]);
                sum +=candidates[i];
                indices.push(i);
            }
        }
        return result;
    }
}
