package org.example;

public class RootUser {
    private int UID = 0;
    private int GID = 0;
    private String userName = "root";
    private String name = "Super user";
    private String home = "/root";
    private String shell = "/bin/sh";
    public RootUser(){
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
