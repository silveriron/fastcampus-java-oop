package com.fastcampus;

import com.fastcampus.logic.BubbleSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();

        System.out.println("[result] " + bubbleSort.sort(Arrays.asList(args)));
    }
}