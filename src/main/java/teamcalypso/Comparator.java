package teamcalypso;

public interface Comparator<T extends Storage> {
    public boolean compare(T t1, T t2);
}
