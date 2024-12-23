package com.korit.main;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

@AllArgsConstructor
class Authority<T> implements Supplier<T> {
    private T role;

    @Override
    public T get() {
        return role;
    }
}

public class Main6 {
    public static void main(String[] args) {
        // Thread(Main 메소드의 역할) 사용할 때 사용 -> 람다식 사용 가능(추상메서드 실행해서 호출)
        // 추상화 -> 공통된 것을 묶어서 사용할 수 있음
        Runnable runnable;

        List<Runnable> programs = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            final int finalI = i;
            Runnable r = () -> System.out.println("프로그램" + (finalI + 1));
            programs.add(r);
        }

        for(Runnable program : programs){
            program.run();
        }

        // 매개변수로 값을 받아서 해당 값을 처리, 처리한 결과를 return 해주지는 않음 -> forEach
        Consumer<String> consumer;

        // 매개변수로 값을 받지 않고 처리한 데이터를 return 해주는 역할 -> getter
        Supplier<String> supplier;
        Authority<String> authority = new Authority<>("ROLE_ADMIN");
        String role = authority.get();
        
        // 매개변수(무조건 1개)로 값을 받아서 처리한 데이터를 return 해주는 역할
        Function<String, String> function;
        Function<Integer, Integer> addFunction = num -> num + 10;
        Integer result = addFunction.apply(100);

        // true, false -> filter에서 사용
        Predicate<String> predicate;
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNums = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        BiConsumer<Integer, String> biConsumer;

        // 매개변수(무조건 2개)로 값을 받아서 처리한 데이터를 return 해주는 역할
        BiFunction<Integer, Integer, String> biFunction;
        Map<String, Object> userMap = Map.of("username", "admin", "password", "1234");
        /*
            {
                "username": "admin",    Map에서 한 쌍 entry
                "password": "1234"
            }
         */
        Set<Map.Entry<String, Object>> entries = userMap.entrySet();
        for(Map.Entry<String, Object> entry : entries){
            entry.getKey();
            entry.getValue();
        }
        userMap.forEach((key, value) -> {
            System.out.println("key: " + key + " value: " + value);
        });


        BiFunction<Integer, Integer, Integer> addBiFunction = (num1, num2) -> num1 + num2;
        Integer result2 = addBiFunction.apply(100, 200);

        BiPredicate<Integer, Integer> biPredicate;
        
        // apply() 가지고 있음 (상속 받고 있기 때문)
        UnaryOperator<Integer> unaryOperator;
        BinaryOperator<Double> binaryOperator;

        
    }
}
