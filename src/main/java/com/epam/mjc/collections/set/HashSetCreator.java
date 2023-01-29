package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : sourceList) {
            if (x % 2 == 0) {
                hashSet.add(x);
                while (x % 2 == 0) {
                    x /= 2;
                    hashSet.add(x);
                }
            } else {
                hashSet.add(x);
                hashSet.add(x * 2);
            }
        }
        return hashSet;
    }

    public static void main(String[] args) {
        HashSetCreator hashSetCreator = new HashSetCreator();
        System.out.println(hashSetCreator.createHashSet(List.of(3, 8, 5, 6, 10, 2, 7, 12)));
    }
}
