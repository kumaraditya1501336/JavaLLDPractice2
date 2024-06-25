package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
//        example5();
//        example6();
//        example7();
//        example8();
//        example9();
//        example10();
        example11();
    }

    public static void example1() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Stream<Integer> stream = list.stream();

        //Terminal methods -> they end the stream
        stream.forEach((ele) -> {
            System.out.println(ele);
        });
    }

    public static void example2() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();

        //Terminal methods -> they end the stream
        stream.forEach((ele) -> {
            System.out.print(ele * ele + " ");
        });
    }

    public static void example3() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();

        stream
                .map((ele) -> ele * ele)
                .forEach((e) -> {
            System.out.print(e + " ");
        });
    }

    public static void example4 () {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();

        Stream<Integer> stream1 = list.stream();

        stream1
                .filter(e -> e % 2 == 0)
                .forEach(e -> {
                    System.out.print(e + " ");
                });

        System.out.println();

        stream
                .filter(e -> {
                    return e % 2 == 0;
                })
                .map(e -> e * e)
                .forEach(e -> {
                    System.out.print(e + " ");
                });

        System.out.println("\n" + list);
    }

    public static void example5 () {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
//        Stream<Integer> stream = list.stream();

//        int sum = 0; //not allowed to update this inside lambda
        list.stream().reduce(0, (sum, ele) -> {
            return sum + ele;
        });
    }

    public static void example6 () {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        list
                .stream()
                .map(e -> {
                    System.out.println(e);
                    return e * e;
                })
                .forEach(e -> {
                    System.out.println(e);
                });

        Optional<Integer> integerOptional = list
                .stream()
                .map(e -> {
                    System.out.println(e);
                    return e * e;
                })
                .findFirst();
    }

    public static void example7 () {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.parallelStream().forEach(e -> {
            System.out.println("printing from thread : " + Thread.currentThread().getName());
        });
    }

    public static void example8 () {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> modifiedList = list.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .collect(() -> new ArrayList<>(),
                        (list1, e) -> {
                            list1.add(e);
                        },
                        (list2, list3) -> {

                        }
                        );

        List<Integer> modifiedList1 = list.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .collect(Collectors.toList());

        System.out.println(modifiedList1);
    }

    public static void example9 () {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        List<Integer> list1 = List.of(1, 2, 3, 4);

        list1.stream().map(e -> {
            list.add(e);
            return 1;
        }).forEach(e -> System.out.print(""));

        System.out.println("\n" + list);
    }

    public static void example10() {
        //Write code to return the sum of square of even elements in a List using Streams API

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        int result = list.stream()
                .filter(e -> e % 2 == 0)
                .reduce(0, (sum, e) -> sum + e * e);

        System.out.println(result);
    }

    public static void example11() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> res = list.stream()
                .filter(e -> e % 2 != 0)
                .map(e -> e * e)
                .collect(Collectors.toList());

        System.out.println(res);
    }

    public static Function<String, Integer> test() {
        return (String s) -> {
            return 1;
        };
    }
}
