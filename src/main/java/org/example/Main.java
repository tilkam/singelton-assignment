package org.example;

public class Main {
    public static void main(String[] args) {
        RootUser user = new RootUser();
        System.out.println(user);

        //Lazy
        System.out.println(LazyRootUser.getInstance());
        //Static final
        System.out.println(StaticRootUser.getInstance());
        //Enum
        System.out.println(EnumRootUser.INSTANCE);
    }
}