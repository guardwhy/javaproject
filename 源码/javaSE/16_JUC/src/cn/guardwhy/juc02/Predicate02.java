package cn.guardwhy.juc02;

import java.util.function.Predicate;

public class Predicate02 {
    public static void main(String[] args) {
        /*Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return str.isEmpty();
            }
        };*/

        Predicate<String> predicate = str->{
            return str.isEmpty();
        };

        System.out.println(predicate.test(" ")); // false
    }
}
