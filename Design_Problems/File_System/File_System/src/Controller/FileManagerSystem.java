package Controller;

import FileSystemNodes.ConcreteNodes.DirectoryNode;
import FileSystemNodes.ConcreteNodes.FileNode;
import FileSystemNodes.FileSystemNode;

public class FileManagerSystem {

    private FileSystemNode root;

    private static FileManagerSystem fileManagerSystem = null;

    private FileManagerSystem() {
        root = new DirectoryNode("root");
    }

    public static synchronized FileManagerSystem getFileManagerSystem() {
        if (fileManagerSystem == null) {
            fileManagerSystem = new FileManagerSystem();
        }
        return fileManagerSystem;
    }

    private FileSystemNode getSecondLastNode(String path) {
        String[] pathComponents = path.split("/");
        FileSystemNode crawler = root;

        for (int i = 1; i < pathComponents.length - 1; i++) {
            String component = pathComponents[i];
            if (component.isEmpty()) continue;

            if (crawler.isFile()) return null;
            if (!crawler.hasChild(component)) return null;

            crawler = crawler.getChild(component);
        }

        return crawler;
    }

    private FileSystemNode getLastNode(String path) {
        String[] pathComponents = path.split("/");
        FileSystemNode crawler = root;

        for (int i = 1; i < pathComponents.length; i++) {
            String component = pathComponents[i];
            if (component.isEmpty()) continue;

            if (crawler.isFile()) return null;
            if (!crawler.hasChild(component)) return null;

            crawler = crawler.getChild(component);
        }

        return crawler;
    }


    public boolean AddPath(String path) {
        String[] pathComponents = path.split("/");
        FileSystemNode crawler = root;

        for (int i = 1; i < pathComponents.length - 1; i++) {
            String component = pathComponents[i];
            if (component.isEmpty()) continue;

            if (crawler.isFile()) return false;
            if (!crawler.hasChild(component)) return false;

            crawler = crawler.getChild(component);
        }

        String component = pathComponents[pathComponents.length - 1];

        if(component.isEmpty()) return false;

        if(crawler.hasChild(component)) return false;

        if (crawler.isFile()) return false;

        // Decide whether it's a file or directory by presence of '.'
        FileSystemNode newNode;
        if (component.contains(".")) {
            newNode = new FileNode(component);
        } else {
            newNode = new DirectoryNode(component);
        }

        crawler.addChild(newNode);
        return true;
    }

    //  Remove an existing file or directory
    public boolean removePath(String path) {

        if(path.equals("/")) return false;


        FileSystemNode secondLastNode = getSecondLastNode(path);
        FileSystemNode lastNode = getLastNode(path);

        if (lastNode != null && secondLastNode != null && lastNode != secondLastNode) {
            secondLastNode.removeChild(lastNode);
            return true;
        }

        return false;
    }

    // ✅ Write content to a file (creates if missing)
    public boolean writePath(String path, String content) {
        FileSystemNode fileNode = getLastNode(path);

        if (fileNode == null) {
            // try to create if parent exists
            FileSystemNode parent = getSecondLastNode(path);
            if (parent == null || parent.isFile()) return false;

            String[] parts = path.split("/");
            String name = parts[parts.length - 1];
            fileNode = new FileNode(name);
            parent.addChild(fileNode);
        }

        if (!fileNode.isFile()) return false;

        ((FileNode) fileNode).setContent(content);
        return true;
    }

    // ✅ Read content of a file
    public String readPath(String path) {
        FileSystemNode node = getLastNode(path);

        if (node == null || !node.isFile()) return null;

        return ((FileNode) node).getContent();
    }

    // ✅ Move/Rename a file or directory
    public boolean modifyPath(String oldPath, String newPath) {
        FileSystemNode secondLastNode = getSecondLastNode(oldPath);
        FileSystemNode lastNode = getLastNode(oldPath);

        if (lastNode != null && secondLastNode != null && lastNode != secondLastNode) {
            secondLastNode.removeChild(lastNode);

            FileSystemNode lastNodeNewPath = getLastNode(newPath);

            if (lastNodeNewPath == null || lastNodeNewPath.isFile()) return false;

            lastNodeNewPath.addChild(lastNode);
            return true;
        }

        return false;
    }
}
