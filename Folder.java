package Composition;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> subFolders = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void printFolderContents() {
        System.out.println(name);
        for (Folder folder : subFolders) {
            folder.printFolderContents();
        }
        for (File file : files) {
            file.printFileName();
        }
    }

    public void deleteFolder(String folderName) {
        if (name.equals(folderName)) {
            subFolders.clear();
            files.clear();
        } else {
            for (Folder folder : subFolders) {
                folder.deleteFolder(folderName);
            }
        }
    }
}
