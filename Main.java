import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Task 1");

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate.test(-7));

        Predicate<Integer> predicate1 = x -> x > 0;
        System.out.println(predicate1.test(5));

        System.out.println(" Task 2 ");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + ", Good Morning ");
            }
        };
        consumer.accept("World");

        Consumer<String> consumer1 = x -> System.out.println(x + ", Hello ");
        consumer1.accept("World");

        System.out.println("Task3");



        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                long c;
                return c = Math.round(aDouble);
            }
        };
        System.out.println(function.apply(37.135));

        Function<Double, Long> function1 = x -> Math.round(x);
        System.out.println(function1.apply(98.535));


        System.out.println(" Task 4 ");
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 354);
            }
        };
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 354);
        System.out.println(supplier1.get());

    }
}