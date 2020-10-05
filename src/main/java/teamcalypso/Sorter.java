package teamcalypso;

public class Sorter<E extends Storage> {

    private final int START_IDX = 0;

    private boolean isSorted;
    private E[] data;
    private Comparator<E> comparator;

    public Sorter(E[] data) {
        this.data = data;
        isSorted = false;
    }

    public Sorter(E[] data, Comparator<E> comparator) {
        this.data = data;
        this.comparator = comparator;

        isSorted = false;
    }

    public E[] sort() {
        if (!isSorted) {       // As this Sorter implementation uses state variables, once sorted it's not supposed to mutate
            quickSort(this.data, START_IDX, this.data.length - 1);
            isSorted = true;
        }

        return this.data;
    }

    /**
     * Calls sorter with a specified comparator function
     * @param comparator    callback
     * @return
     */
    public E[] sort(Comparator<E> comparator) {
        this.comparator = comparator;
        return sort();
    }

    protected void quickSort(E[] data, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(data, start, end);
            quickSort(data, start, partitionIndex - 1);
            quickSort(data, partitionIndex + 1, end);
        }
    }

    /**
     * Help function for QuickSort implementation
     * @param data  state array of type E elements
     * @param start start index
     * @param end   end index
     * @return  index of partition separation in the data array
     */
    private int partition(E[] data, int start, int end) {
        E pivotElement = data[end];
        int idx = start - 1;

        for (int i = start; i < end; ++i) {
            if (this.comparator.compare(data[i], pivotElement)) {
                ++idx;

                E swap = data[idx];
                data[idx] = data[i];
                data[i] = swap;
            }
        }

        E swap = data[idx + 1];
        data[idx + 1] = data[end];
        data[end] = swap;

        return idx + 1;
    }
}
