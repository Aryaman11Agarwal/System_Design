package Controller;

import FileSystemNodes.ConcreteNodes.DirectoryNode;
import FileSystemNodes.FileSystemNode;

public class FileManagerSystem {

    FileSystemNode root;

    private static FileManagerSystem fileManagerSystem=null;




    private FileManagerSystem(){
        root=new DirectoryNode("root");
    }


    public static FileManagerSystem getFileManagerSystem(){

        if(fileManagerSystem==null){
            fileManagerSystem=new FileManagerSystem();
        }

        return fileManagerSystem;

    }


}
