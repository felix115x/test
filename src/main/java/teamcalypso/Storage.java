package teamcalypso;

public class Storage {
    private int id;
    private String type;
    private int size;

    public Storage(int id, String type, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
