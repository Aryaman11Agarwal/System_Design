package FileSystemNodes.ConcreteNodes;

import FileSystemNodes.FileSystemNode;

public class FileNode extends FileSystemNode {


    private String content;


    public FileNode(String name){
      //  isFile=true;
        super.setName(name);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFile() {
        return true;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
