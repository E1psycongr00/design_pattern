package pattern.structural.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystem file : children) {
            total += file.getSize();
        }
//        System.out.println(String.format("%s 폴더 크기 : %d", this.name, total));
//        System.out.println("----------------");
        return total;
    }


    @Override
    public boolean remove(String name) {
        FileSystem file = this.find(name);
        if (file == null) {
            return false;
        }
        file = null;
        return true;
    }

    @Override
    public FileSystem find(String name) {
        if (this.name == name) {
            return this;
        }
        FileSystem result = null;
        for (FileSystem file : children) {
            FileSystem tmp = file.find(name);
            if (tmp != null) {
                result = tmp;
                break;
            }
        }
        return result;
    }
}
