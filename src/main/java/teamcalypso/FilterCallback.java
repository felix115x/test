package teamcalypso;

public interface FilterCallback<T extends Storage> {
    public boolean isValid(T element);
}
