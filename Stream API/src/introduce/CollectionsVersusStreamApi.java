package introduce;

import java.util.*;

public class CollectionsVersusStreamApi {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(30));
        }
        System.out.println("list > " + list);


        // Collections 처리(코드가 지저분하다.)
        List<Integer> gt10 = new ArrayList<>();
        for (int i : list) {
            if (i > 10) {
                gt10.add(i);
            }
        }

        Collections.sort(gt10);
        System.out.println("gt10 > " + gt10);


        // Stream 처리(코드가 간결하다.)
        list.stream()
                .filter(i -> i > 10)
                .sorted()
                .forEach(x -> System.out.print(x + " "));
    }
}
