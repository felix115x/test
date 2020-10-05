package teamcalypso;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorterTest {

    private Comparator<Storage> comparator = (t1, t2) -> t1.getSize() > t2.getSize()
            || t1.getSize() == t2.getSize() && t1.getType().compareToIgnoreCase(t2.getType()) < 0;

    @Test
    public void testSortingArray() {
        System.out.println("Sorting array of Storage objects...");

        Storage[] data = new Storage[]{
                new Storage(1, "String", 1),
                new Storage(2, "JavascriptInterface", 2),
                new Storage(3, "Web3j", 6),
                new Storage(4, "HexString", 1),
                new Storage(5, "ETH", 15),
                new Storage(6, "Autowired", 15),
                new Storage(7, "Comparator", 13),
                new Storage(8, "Request", 12),
                new Storage(9, "Mutable", 4),
        };
        Sorter<Storage> sorter = new Sorter<>(data, comparator);
        sorter.sort();

        assertEquals("Autowired", data[0].getType());
        assertEquals("String", data[data.length - 1].getType());

        System.out.println("Sorted");
    }
}
