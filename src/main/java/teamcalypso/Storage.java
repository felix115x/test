package teamcalypso;

public class Storage {
    int id;
    String type;
    int size;

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
