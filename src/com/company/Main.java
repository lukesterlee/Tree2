package com.company;

import java.io.File;

public class Main {


    public static void printFiles(String path, int level) {

        if (level == 0)
            System.out.println(".");

        File folder = new File(path);
        File[] list = folder.listFiles();

        for (int i  = 0; i < list.length; i++) {
            if (list[i].isFile()) {

                for (int j = 0; j < level; j++) {
                    System.out.print("│   ");
                }

                if (i == list.length - 1) {
                    System.out.println("└--" + list[i].getName());
                } else {
                    System.out.println("├--" + list[i].getName());
                }
            } else if (list[i].isDirectory()) {
                printFiles(path + "/" + list[i].getName(), level+1);
            }
        }

    }
    
    public static void main(String[] args) {
	// write your code here
        printFiles("/Users/Willee/Desktop/try", 0);
        //│└
    }
}
