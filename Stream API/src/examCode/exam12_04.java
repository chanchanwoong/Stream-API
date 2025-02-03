package examCode;

import java.util.*;
import java.util.stream.*;

/*
    Stream 종류
    - BaseStream 상위 인터페이스가 하위 4개의 인터페이스를 가짐
    - Stream 인터페이스, IntStream 인터페이스, LongStream 인터페이스, DoubleStream 인터페이스

    - Stream 객체를 생성하는 방식은 배열, 컬렉션, 타입 등에 따라 다양하다.
 */

public class exam12_04 {

    public static void main(String[] args) {
        int[] ia = {2, 3, 5, 7, 11, 15};
        IntStream is = Arrays.stream(ia);

        String[] strings = {"AA", "BB", "CC", "DD"};
        Stream<String> ss1 = Stream.of(strings);
        Stream<String> ss2 = Arrays.stream(strings);

        double[] da = {1.2, 3.14, 3.44, 72.33};
        DoubleStream ds =Arrays.stream(da);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> ss3 = list.stream();
    }
}
