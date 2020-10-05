package teamcalypso;

public class Iterator<E extends Storage> {

    protected final int START_IDX = 0;

    protected int cursor;
    protected E[] data;

    public Iterator(E[] data) {
        this.data = data;
        this.cursor = START_IDX;
    }

    public boolean hasNext() {
        try {
            return cursor < data.length && data[cursor] != null;
        } catch (NullPointerException|ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    public E next() {
        if (hasNext()) {
            return data[cursor++];
        }
        return null;
    }

    public void reset() {
        cursor = START_IDX;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        if (cursor < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.cursor = cursor;
    }
}
