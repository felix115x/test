package teamcalypso;

import org.junit.Test;

import static org.junit.Assert.*;

public class IteratorTest {
    private Iterator<Storage> iterator;

    @Test
    public void testEmptyData() {
        final Storage[] storage = {};
        iterator = new Iterator<>(storage);

        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSingleData() {
        final Storage[] storage = new Storage[]{new Storage(1, "Test 1", 1)};
        iterator = new Iterator<>(storage);

        assertTrue(iterator.hasNext());
        assertSame(storage[0],iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testMultipleData() {
        final Storage[] storage = new Storage[]{new Storage(1, "Test 1", 1), new Storage(2, "Test 2", 2)};
        iterator = new Iterator<>(storage);

        assertTrue(iterator.hasNext());
        assertSame(storage[0],iterator.next());
        assertTrue(iterator.hasNext());
        assertSame(storage[1],iterator.next());
        assertFalse(iterator.hasNext());
    }
}
