package pattern.structural.composite.filesystem;

public interface FileSystem {

    public String getName();
    public int getSize();
    public boolean remove(String name);
    public FileSystem find(String name);
}
