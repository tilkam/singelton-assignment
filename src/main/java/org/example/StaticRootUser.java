package org.example;

public class StaticRootUser {
    private int UID = 0;
    private int GID = 0;
    private String userName = "root";
    private String name = "Super user";
    private String home = "/root";
    private String shell = "/bin/sh";
    private static final StaticRootUser instance = new StaticRootUser();
    private StaticRootUser(){
    }

    public static StaticRootUser getInstance(){
        return instance;
    }
    @Override
    public String toString(){
        return userName +
                "(" + name + ")" +
                " " + UID + ":" + GID +
                " home: " + home + " " +
                "shell: " + shell;
    }
}
