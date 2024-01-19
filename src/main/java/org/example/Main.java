package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(LazyRootUser.getInstance());
        System.out.println(StaticRootUser.getInstance());
        System.out.println(EnumRootUser.INSTANCE);
    }
}