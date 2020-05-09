package QueAndStack;

import Collections.Today.LinkedListImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class FirstThree {
    public static void main(String[] args) {
        Queue<String> names= new LinkedList<>();
        names.add("O");
        names.add("Bu");
        names.add("Su");
        System.out.println(names);
        names.remove();
        System.out.println(names);
        names.remove();
        System.out.println(names);
        names.remove();
        System.out.println(names);

    }

}
