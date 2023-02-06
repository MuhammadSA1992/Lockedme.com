/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lockedme.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class LockedmeCom {

    public static void main(String[] args) {
        System.out.print("welcome to Lockedme.com File Search \n Press 1- add file"
                + "2- search files 3- delete files 4-close the file \n"
                + "Choice: ");
        String path = "/home/muhammad/lockedme.com/";
        File file = new File(path);
        File[] listfiles = file.listFiles();
        ArrayList<String> fileArray = new ArrayList<>();
        Scanner in  = new Scanner(System.in);
        for (File listfile : listfiles) {
          fileArray.add(listfile.getName());
        }
        Collections.sort(fileArray);
        int ch = in.nextInt();
        String choosedname;
        
        switch (ch) {
            case 1:
                choosedname = in.next();
                if(fileArray.contains(choosedname)){
                    System.out.println("file is already exists");
                }
                else{
                    File filecreated = new File(path+choosedname);
                }
                break;
            case 2:
                System.out.print("enter the file name: ");
                choosedname = in.next();
                if(fileArray.contains(choosedname)){
                    System.out.println(choosedname);
                }
                else{
                    System.err.print("your name "+choosedname +" not exists ");
                }
                break;
            case 3:
                System.out.print("enter the deleted file name ");
                choosedname = in.next();
                if(fileArray.contains(choosedname)){
                    File filedelete = new File(path+choosedname);
                    System.out.println(filedelete.getAbsoluteFile());
                    filedelete.delete();
                   
                }
                else{
                    System.out.println("file enter not exits");
                }
                break;
            case 4:
                System.exit(0);
                break;
                
            default: System.out.println("this not valid optipn");
        }
                
        }
        
}
    

