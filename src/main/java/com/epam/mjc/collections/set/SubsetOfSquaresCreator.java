package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer i : sourceList) {
            int square = i * i;
            if (square >= lowerBound && square <= upperBound) {
                result.add(square);
            }
        }
        System.out.println(sourceList);
        return result;
    }

    public static void main(String[] args) {
        SubsetOfSquaresCreator subsetOfSquaresCreator = new SubsetOfSquaresCreator();
        subsetOfSquaresCreator.createSubsetOfSquares(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 25, 49);
    }
}
