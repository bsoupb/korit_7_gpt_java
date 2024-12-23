package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null;
        List<Integer> numberList3 = null;

        numberList2 = new ArrayList<>();

        for(int i = 0; i < numberList.size(); i++){
            Integer num = numberList.get(i);
            numberList2.add(num * 10);
        }
        /*
        for(Integer num : numberList) {
            numberList2.add(num * 10);
        }

        numberList.forEach(numberList2::add);
        */

        numberList3 = numberList.stream().map(n -> n * 10).collect(Collectors.toList());


//        AtomicReference<Integer> num = new AtomicReference<>(0);
//        final List<Integer> numberList4 = new ArrayList<>();
//
//        numberList.forEach(number -> {
//            numberList4.add(number);
//            number.set(number);
//                }
//
//        );


        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);
    }
}
