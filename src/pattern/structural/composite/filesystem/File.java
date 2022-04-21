package pattern.structural.composite.filesystem;

public class File implements FileSystem {
    private String name;
    private int size;

    public File (String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        System.out.println(name+"파일 크기 : " + size);
        return size;
    }

    @Override
    public boolean remove(String name) {
        return false;
    }

    @Override
    public FileSystem find(String name) {
        if (this.name == name) {
            return this;
        }
        return null;
    }
}
