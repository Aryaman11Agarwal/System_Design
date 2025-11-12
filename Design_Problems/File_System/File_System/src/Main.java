import Controller.FileManagerSystem;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        FileManagerSystem fileManagerSystem=FileManagerSystem.getFileManagerSystem();


        if(fileManagerSystem.AddPath("/Folder1")) System.out.println("Successfull");

        fileManagerSystem.AddPath("/Folder1/aryaman.txt");

        System.out.println(fileManagerSystem.writePath("/Folder1/aryaman.txt","Aryaman is a good boy"));

        System.out.println(fileManagerSystem.readPath("/Folder1/aryaman.txt"));
        //fileManagerSystem.removePath("/Folder1/aryaman.txt");
        System.out.println(fileManagerSystem.AddPath("/Folder2"));

        fileManagerSystem.modifyPath("/Folder1","/Folder2");

        System.out.println(fileManagerSystem.readPath("/Folder1/aryaman.txt"));
        System.out.println(fileManagerSystem.readPath("/Folder2/Folder1/aryaman.txt"));




    }
}