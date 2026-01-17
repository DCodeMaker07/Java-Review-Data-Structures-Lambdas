package org.TLPS1.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Generic generic = new Generic();

        List<Number> list = new ArrayList<Number>();
        list.add(1);
        list.add(1.3);
        list.add(10L);

        List<String> list2 = new ArrayList<>();

        list2.add("1");
        list2.add("2");
        list2.add("3");

        //final Integer result = generic.show();

        // System.out.println(result);

        generic.show(list);

    }

}
