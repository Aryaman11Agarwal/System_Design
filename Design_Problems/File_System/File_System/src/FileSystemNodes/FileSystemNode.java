package FileSystemNodes;

public abstract class FileSystemNode {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean hasChild(String name);
    public abstract boolean isFile();

    public abstract FileSystemNode getChild(String name);

    public abstract void removeChild(FileSystemNode fileSystemNode);
    public abstract void addChild(FileSystemNode fileSystemNode);

}
