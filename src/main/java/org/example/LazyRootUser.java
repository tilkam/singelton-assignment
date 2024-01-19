package org.example;

public class LazyRootUser {
    private int UID = 0;
    private int GID = 0;
    private String userName = "root";
    private String name = "Super user";
    private String home = "/root";
    private String shell = "/bin/sh";
    private static LazyRootUser instance;

    public LazyRootUser() {
    }

    public static LazyRootUser getInstance() {
        if (instance == null) {
            instance = new LazyRootUser();
        }
        return instance;
    }

    @Override
    public String toString() {
        return userName +
                "(" + name + ")" +
                " " + UID + ":" + GID +
                " home: " + home + " " +
                "shell: " + shell;
    }
}
