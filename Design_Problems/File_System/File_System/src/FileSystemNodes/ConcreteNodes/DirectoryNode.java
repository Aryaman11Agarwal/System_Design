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
    @Override
    public boolean hasChild(String name){
      return  children.containsKey(name);
    }


    public boolean addChildren(FileSystemNode node){
        String name= node.getName();
        if(children.containsKey(name)) return false;

        children.put(name,node);

        return false;


    }

    @Override
    public FileSystemNode getChild(String name) {
        return children.get(name);
    }

    @Override
    public void removeChild(FileSystemNode fileSystemNode) {
        children.remove(fileSystemNode.getName());
    }

    @Override
    public void addChild(FileSystemNode fileSystemNode) {
        children.put(fileSystemNode.getName(),fileSystemNode);
    }
}
