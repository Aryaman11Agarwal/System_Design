package FileSystemNodes.ConcreteNodes;

import FileSystemNodes.FileSystemNode;

import java.util.HashMap;
import java.util.Map;

public class DirectoryNode extends FileSystemNode {
    private final Map<String, FileSystemNode> children;
    public DirectoryNode(String name){

        super.setName(name);

        children=new HashMap<>();
    }



    public boolean isFile() {
        return false;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public boolean hasChild(String name){
      return  children.containsKey(name);
    }


    public boolean addChildren(FileSystemNode node){
        String name= node.getName();
        if(children.containsKey(name)) return false;

        children.put(name,node);

        return false;


    }





}
