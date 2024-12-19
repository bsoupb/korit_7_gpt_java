package com.korit.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPrinter2<T> {   // 생성할 때 T 정의 가능

    // static 뒤에 제네릭 표시
    public static <T> List<T> print(List<T> datas, Consumer<List<T>> action) {    // static 일 때 생성이 되지 않음
        List<T> result = new ArrayList<T>();
        for(T data : datas) {
            System.out.println(data);
            result.add(data);
        }

        action.accept(datas);

        return result;
    }
    // Object 사용시: Object 업캐스팅 -> 다운캐스팅 해서 메소드 사용 가능
    // 제네릭은 업캐스팅, 다운캐스팅 필요 없음

}
