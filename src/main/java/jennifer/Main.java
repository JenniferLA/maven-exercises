package jennifer;

import com.google.common.base.Joiner;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Testing Guava
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1,2,3,4,5,null,6)));

    }
}