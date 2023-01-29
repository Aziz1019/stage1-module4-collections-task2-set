package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>(firstSet);
        resultSet.retainAll(secondSet);
        resultSet.removeAll(thirdSet);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        resultSet.addAll(thirdSet);
        return resultSet;
    }
}
