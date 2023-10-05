/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private int[] items;
    private int size;
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == items.length) {
            int[] a = new int[size + 1];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
        }

        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int x = getLast();
        size = size - 1;
        return x;
    }
}